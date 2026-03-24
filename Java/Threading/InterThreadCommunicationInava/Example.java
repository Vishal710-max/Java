package Threading.InterThreadCommunicationInava;

class Message {
    private String message;
    private boolean empty = true;

    public synchronized void put(String message) {
        // Wait until message is consumed
        while (!empty) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        // Set the message
        this.message = message;
        empty = false;
        notify(); // Notify consumer that message is ready
    }

    public synchronized String take() {
        // Wait until message is available
        while (empty) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        // Read the message
        empty = true;
        notify(); // Notify producer that message was taken
        return message;
    }
}
public class Example {
    public static void main(String[] args) {
        Message message = new Message();

        // Producer thread
        new Thread(() -> {
            String[] messages = {"Hello", "How are you?", "Goodbye"};
            for (String m : messages) {
                message.put(m);
                try {
                    Thread.sleep(1000); // Simulate work
                } catch (InterruptedException e) {}
            }
            message.put("DONE");
        }).start();

        // Consumer thread
        new Thread(() -> {
            String received;
            do {
                received = message.take();
                System.out.println("Received: " + received);
                try {
                    Thread.sleep(1000); // Simulate work
                } catch (InterruptedException e) {}
            } while (!received.equals("DONE"));
        }).start();
    }
}
