package Threading.ExtendingThreadClass;

// MyThread class extends Thread class to create a custom thread
class MyThread extends Thread {
    private String symbol; // Symbol that this thread will print

    // Constructor to set the symbol for this thread
    public MyThread(String symbol) {
        this.symbol = symbol;
    }

    // run() contains the code that executes when thread starts
    @Override
    public void run() {
        // Loop to print numbers with the thread's symbol
        for (int i = 0; i < 100; i++) {
            System.out.print(i + symbol + "\n ");
            try {
                // Small delay to make the interleaving visible
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // Message when thread completes its task
        System.out.println("\n\n" + symbol + " Task Completed");
    }
}

public class Extending_Thread {
    public static void main(String[] args) {
        // Record start time to measure total execution time
        long startTime = System.currentTimeMillis();

        // Create 3 thread instances with different symbols
        MyThread thread1 = new MyThread("*"); // Thread printing *
        MyThread thread2 = new MyThread("#"); // Thread printing #
        MyThread thread3 = new MyThread("$"); // Thread printing $

        // Start all threads (they begin execution)
        thread1.start(); // Starts thread1's run() method
        thread2.start(); // Starts thread2's run() method
        thread3.start(); // Starts thread3's run() method

        // Why we use join():
        // The join() method makes the main thread wait until
        // all spawned threads complete their execution
        // Without join(), main thread would continue immediately
        try {
            thread1.join(); // Wait for thread1 to finish
            thread2.join(); // Wait for thread2 to finish
            thread3.join(); // Wait for thread3 to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Calculate and print total execution time
        long endTime = System.currentTimeMillis();
        System.out.println("\nTotal execution time: " + (endTime - startTime) + "ms");
    }
}