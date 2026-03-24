package Threading.Synchronization;

/*
Why Do We Need the Same Object for Synchronization?
   - In Java, synchronization ensures that only one thread can access a critical section of code at a time. The lock object (monitor) determines which threads must wait.

1. Synchronization Works on Object Locks
   - When a thread enters a synchronized block/method, it acquires the lock of the specified object.
   - If another thread tries to enter any synchronized block/method using the same lock object, it must wait until the first thread releases the lock.

2. If Different Objects Are Used, Synchronization Fails
   - If each thread locks on a different object, they won’t block each other.
   - This leads to race conditions because multiple threads can enter critical sections simultaneously.

   ❌ Incorrect (Different Objects → No Synchronization)

class Printer {
    public void print(String doc) {
        Object lock = new Object(); // ❌ Each thread gets a NEW lock
        synchronized (lock) {
            System.out.println("Printing: " + doc);
            try { Thread.sleep(500); } catch (Exception e) {}
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();

        new Thread(() -> printer.print("Doc1")).start();
        new Thread(() -> printer.print("Doc2")).start();
        // Both threads run simultaneously (no synchronization)
    }
}
Problem:
Each thread creates its own lock object → No mutual exclusion.
Both threads execute synchronized blocks at the same time.

Correct Example :=
*/
class Printer {
    Object lock = new Object();
    public void print(String doc) {
        synchronized (lock) {
            System.out.println("Printing: " + doc);
            try { Thread.sleep(500); } catch (Exception e) {}
        }
    }
}

public class Need_OF_Same_Object {
    public static void main(String[] args) {
        Printer printer = new Printer();

        new Thread(() -> printer.print("Doc1")).start();
        new Thread(() -> printer.print("Doc2")).start();
        // Both threads run simultaneously (no synchronization)
    }
}
