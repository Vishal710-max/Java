package Threading.JoinMethod;

/*
# join() Method in Java
   - The join() method is a crucial threading mechanism that allows one thread to wait for the completion of another thread.
     It's essential for coordinating thread execution order.

# How join() Works
  Basic Syntax
    thread.join();       // Waits indefinitely for thread to finish
    thread.join(1000);  // Waits maximum 1000ms for thread to finish

# Key Behaviors
   - Blocks the calling thread until the target thread terminates
   - Throws InterruptedException if the waiting thread is interrupted
   - Releases all locks while waiting (unlike sleep() which holds locks)
*/
public class Join {
    public static void main(String[] args) throws InterruptedException {
        Thread worker = new Thread(() -> {
            System.out.println("Worker thread started");
            try {
                Thread.sleep(2000); // Simulate work
            } catch (InterruptedException e) {
                System.out.println("Worker interrupted!");
            }
            System.out.println("Worker thread completed");
        });

        System.out.println("Main thread starting worker");
        worker.start();

        System.out.println("Main thread waiting for worker");
        worker.join(); // Main thread waits here

        System.out.println("Main thread continues after join");
    }
    // Output Timeline
    //  Main thread starting worker
    //  Worker thread started (worker begins)
    //  Main thread waiting for worker (main thread blocks)
    //  (After 2 seconds) Worker thread completed
    //  Main thread continues after join
}

// Output =>
// Main thread starting worker
// Main thread waiting for worker
// Worker thread started  (working for 2000 milisecond)
// Worker thread completed
// Main thread continues after join
