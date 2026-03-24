package Threading.Synchronization.SynchronizedMethod;

/**
 * This class demonstrates synchronized table printing
 * where multiple threads print different tables without mixing outputs
 */
class TablePrinter {
    /**
     * Synchronized method to print multiplication table
     * @param num The number whose table we want to print

     * WHAT IS A SYNCHRONIZED METHOD?
     * 1. The 'synchronized' keyword makes this method thread-safe
     * 2. When a thread enters this method, it automatically acquires the intrinsic lock (monitor)
     *    of the TablePrinter object (since it's an instance method)
     * 3. Other threads must wait until the current thread releases the lock

     * WHY USE IT HERE?
     * - Prevents interleaving of table outputs from different threads
     * - Ensures each table prints completely before another starts
     * - Without synchronization, output lines from different tables would mix
     */
    public synchronized void printTable(int num) {
        System.out.println("\nMultiplication table of " + num + ":");
        for (int i = 1; i <= 5; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
            try {
                Thread.sleep(200); // Small delay to make synchronization visible
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted!");
            }
        }
        System.out.println(Thread.currentThread().getName() + " finished printing table of " + num);
    }
}

public class Synchronized_Method {
    public static void main(String[] args) throws InterruptedException {
        // Create a single shared TablePrinter instance
        // (All threads will compete for its lock)
        TablePrinter printer = new TablePrinter();

        // Create three threads sharing the same printer object
        Thread t1 = new Thread(() -> printer.printTable(5), "Thread-5");
        Thread t2 = new Thread(() -> printer.printTable(7), "Thread-7");
        Thread t3 = new Thread(() -> printer.printTable(13), "Thread-13");

        System.out.println("Starting all table printing threads...");

        // KEY POINT ABOUT SYNCHRONIZATION:
        // Even though we start all threads together,
        // the synchronized method ensures only one executes at a time

        t1.start();
        t2.start();
        t3.start();

        // Wait for all threads to complete
        t1.join();
        t2.join();
        t3.join();

        System.out.println("\nAll tables printed successfully!");

        /*
         * EXPECTED OUTPUT BEHAVIOR:
         * 1. One complete table prints at a time (no mixed lines)
         * 2. Example output:
         *    Multiplication table of 5:
         *    5 x 1 = 5
         *    ...
         *    Thread-5 finished printing table of 5
         *
         *    Multiplication table of 7:
         *    7 x 1 = 7
         *    ...
         *    Thread-7 finished printing table of 7
         *
         *    (No interleaving between tables)
        */
    }
}

// Output =>
// Starting all table printing threads...

// Multiplication table of 5:
// 5 x 1 = 5
// 5 x 2 = 10
// 5 x 3 = 15
// 5 x 4 = 20
// 5 x 5 = 25
// Thread-5 finished printing table of 5
//
// Multiplication table of 13:
// 13 x 1 = 13
// 13 x 2 = 26
// 13 x 3 = 39
// 13 x 4 = 52
// 13 x 5 = 65
// Thread-13 finished printing table of 13
//
// Multiplication table of 7:
// 7 x 1 = 7
// 7 x 2 = 14
// 7 x 3 = 21
// 7 x 4 = 28
// 7 x 5 = 35
// Thread-7 finished printing table of 7
//
// All tables printed successfully!