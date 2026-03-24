package Threading.Synchronization.StaticSynchronization;

/*
# What is Static Synchronization?
   - Static synchronization is used when you need to synchronize access to static methods or static
     variables in a multi-threaded environment.Unlike instance-level synchronization (which locks on this),
     static synchronization locks on the class-level monitor (Class object).

# Why Do We Need It?
   - When multiple threads access static methods/variables, instance-level synchronization
     (synchronized methods/blocks) won't work because they lock on object instances.
   - Static synchronization ensures that only one thread can execute a static synchronized method at a
     time, across all instances of the class.
*/
class Counter1 {
    static int count = 0;

    /*
     * STATIC SYNCHRONIZATION EXPLANATION:
     * 1. The synchronized block locks on the CLASS-level monitor
     * 2. Only one thread can execute this block at a time across ALL instances
     * 3. Different from instance synchronization which locks on 'this' object
     *
     * WHY USE STATIC SYNCHRONIZATION?
     * - Needed when multiple threads access static methods/data
     * - Ensures thread safety for class-level operations
     * - Prevents race conditions in static context
     */
    // ✅ Static synchronized method (locks on CLASS, not instance)
    public static synchronized void increment() {
        count++;
    }
}

public class Static_Synchronization {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) Counter1.increment();
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) Counter1.increment();
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Count: " + Counter1.count); // ✅ Always 2000
    }
}
