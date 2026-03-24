package Threading.Synchronization.SynchronizedBlock;

/**
 * This class demonstrates table printing using synchronized blocks
 * to prevent output mixing between threads
 */
class TablePrinter {
    /**
     * Prints multiplication table using synchronized block
     * @param num The number whose table to print
     */
    public void printTable(int num) {
        /*
         * SYNCHRONIZED BLOCK EXPLANATION:
         * 1. The synchronized block locks on 'this' object's monitor (intrinsic lock)
         * 2. Only one thread can execute this block at a time for THIS instance
         * 3. Other threads trying to enter ANY synchronized block on the same object must wait
         *
         * WHY USE SYNCHRONIZED BLOCK INSTEAD OF METHOD?
         * - More granular control (only synchronize critical sections)
         * - Can lock on different objects for different operations
         * - Reduces contention compared to synchronizing entire methods
         */
        synchronized (this) {
            System.out.println("\nMultiplication table of " + num + ":");
            for (int i = 1; i <= 5; i++) {
                System.out.println(num + " x " + i + " = " + (num * i));
                try {
                    Thread.sleep(200); // Delay to visualize synchronization
                } catch (InterruptedException e) {
                    System.out.println("Thread interrupted!");
                }
            }
            System.out.println(Thread.currentThread().getName() + " finished printing table of " + num);
        }

        /*
         * NON-SYNCHRONIZED CODE HERE WOULD:
         * - Execute concurrently by all threads
         * - Not be protected by the lock
         */
    }
}
public class Synchronized_Block {
    public static void main(String[] args) throws InterruptedException {
        // Single shared TablePrinter instance
        TablePrinter printer = new TablePrinter();

        /*
         * THREAD CREATION NOTES:
         * All threads share the same 'printer' instance
         * Therefore they compete for the same lock in synchronized blocks
         */
        Thread t1 = new Thread(() -> printer.printTable(5), "Thread-5");
        Thread t2 = new Thread(() -> printer.printTable(7), "Thread-7");
        Thread t3 = new Thread(() -> printer.printTable(13), "Thread-13");

        System.out.println("Starting all table printing threads...");

        /*
         * THREAD EXECUTION BEHAVIOR:
         * 1. Threads start concurrently
         * 2. When reaching synchronized block:
         *    - First thread acquires lock
         *    - Others wait at the block entrance
         * 3. When first thread exits block:
         *    - Next waiting thread acquires lock
         */
        t1.start();
        t2.start();
        t3.start();

        // Wait for all threads to complete their synchronized work
        t1.join();
        t2.join();
        t3.join();

        System.out.println("\nAll tables printed successfully!");
    }
    /*
      Key Differences from Synchronized Method:
       Feature	      Synchronized Method	   Synchronized Block
       Lock Object	     Implicit (this)	       Explicit (any object)
       Scope	         Entire method	           Only the enclosed block
       Flexibility	     Less flexible	           More control over locked section
       Performance	     Slightly slower           More efficient (locks only needed section)
                         (locks longer)

     */
}
