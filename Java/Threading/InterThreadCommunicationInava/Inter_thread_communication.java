package Threading.InterThreadCommunicationInava;

/*
# Inter-Thread Communication in Java
  - Inter-thread communication allows threads to coordinate their activities and exchange information safely.
    Java provides built-in methods for this purpose in the Object class:

Key Methods for Inter-Thread Communication
       Method	   Description
       wait()	    Causes current thread to wait until another thread calls notify()
       notify()	    Wakes up a single waiting thread
       notifyAll()	Wakes up all waiting threads
*/

class SharedResource {
    private int value;
    private boolean available = false;

    public synchronized void produce(int newValue) {
        while (available) { // Wait if value hasn't been consumed yet
            try {
                wait(); // Releases lock and waits
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        value = newValue;
        available = true;
        System.out.println("Produced: " + value);
        notify(); // Notify waiting consumer
    }

    public synchronized int consume() {
        while (!available) { // Wait if nothing to consume
            try {
                wait(); // Releases lock and waits
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        available = false;
        System.out.println("Consumed: " + value);
        notify(); // Notify waiting producer
        return value;
    }
}

public class Inter_thread_communication {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        // Producer thread
        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                resource.produce(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        // Consumer thread
        Thread consumer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                resource.consume();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        producer.start();
        consumer.start();
    }
}
