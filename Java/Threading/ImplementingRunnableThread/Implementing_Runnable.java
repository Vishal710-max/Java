package Threading.ImplementingRunnableThread;

// Thread1 class implements Runnable interface to create a thread
class Thread1 implements Runnable {
    String str;  // This will store the symbol that the thread will print

    // Constructor to set the symbol for this thread
    Thread1(String name) {
        this.str = name;
    }

    // run() method contains the code that will execute when thread starts
    @Override
    public void run() {
        // Loop to print numbers along with the thread's symbol
        for (int i = 0; i < 30; i++) {
            System.out.println(i + this.str + " ");

            try {
                // Pause the thread for 100 milliseconds between prints
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // Message when thread completes its task
        System.out.print("\n\n" + this.str + " Task Completed");
    }
}

public class Implementing_Runnable {
    public static void main(String[] args) {
        // Creating Thread1 objects with different symbols
        Thread1 t1 = new Thread1("*");  // First thread will print *
        Thread1 t2 = new Thread1("#");  // Second thread will print #
        Thread1 t3 = new Thread1("$");  // Third thread will print $

        // Why we create Thread class objects:
        // The Thread1 class implements Runnable but isn't actually a thread itself.
        // We need to create Thread objects and pass our Runnable (Thread1) to them.
        // This is how Java's threading works - the Thread class does the actual
        // thread management, while Runnable provides the task to run.

        // Creating Thread objects and starting them
        new Thread(t1).start();  // Wraps t1 in Thread and starts it
        new Thread(t2).start();  // Wraps t2 in Thread and starts it
        new Thread(t3).start();  // Wraps t3 in Thread and starts it

        // Now all three threads will run concurrently
    }
}