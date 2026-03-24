package Threading.Synchronization.SynchronizedBlock;

public class  Short_Synchronized_Block {
    // Shared lock object for synchronization
    private static final Object lock = new Object();

    public static void main(String[] args) {
        // Thread for table of 5
        Thread t5 = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Running in: " + Thread.currentThread().getName());
                for (int i = 1; i <= 5; i++) {
                    System.out.println("5 x " + i + " = " + (5 * i));
                    try {
                        Thread.sleep(100); // Simulate work
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }, "Table-of-5");

        // Thread for table of 7
        Thread t7 = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Running in: " + Thread.currentThread().getName());
                for (int i = 1; i <= 5; i++) {
                    System.out.println("7 x " + i + " = " + (7 * i));
                    try {
                        Thread.sleep(100); // Simulate work
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }, "Table-of-7");

        t5.start();
        t7.start();
    }
}
