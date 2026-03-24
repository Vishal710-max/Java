package Threading.Synchronization.StaticSynchronization;

class Counter {
    static int count = 0;

    // ❌ Not thread-safe for static data!
    public synchronized void increment() {
        count++; // Race condition for static variable!
    }
}
public class Problem_Without_Static_Sync {
    public static void main(String[] args) throws InterruptedException {
        Counter c1 = new Counter();
        Counter c2 = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) c1.increment();
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) c2.increment();
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Count: " + Counter.count); // ❌ May not be 2000!
    }

    // Problem:
    // synchronized locks per instance, but count is static (shared across all instances).
    // Threads t1 and t2 use different locks (c1 and c2), so race conditions occur.
}
