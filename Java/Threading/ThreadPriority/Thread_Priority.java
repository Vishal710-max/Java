package Threading.ThreadPriority;

class Thread2 extends Thread {
    int time; // Number of iterations the thread will run

    // Constructor to set execution time and thread name
    Thread2(int n, String name) {
        this.time = n;
        this.setName(name); // Set the thread name for identification
    }

    @Override
    public void run() {
        Thread current = Thread.currentThread(); // Get current thread reference
        for (int i = 0; i < this.time; i++) {
            // Print thread info with its priority
            System.out.println(current.getName() + " Running with priority " + current.getPriority());
            try {
                Thread.sleep(1000); // Pause for 1 second between prints
            } catch (InterruptedException e) {
                System.out.println(getName() + " interrupted!");
                return; // Exit the thread if interrupted
            }
        }
        System.out.println(current.getName() + " Task Completed..");
    }
}

public class Thread_Priority {
    public static void main(String[] args) {
        // Create three threads with different priorities
        Thread2 t1 = new Thread2(10, "Thread-1");
        Thread2 t2 = new Thread2(10, "Thread-2");
        Thread2 t3 = new Thread2(10, "Thread-3");

        /*
        SETTING THREAD PRIORITIES:
        - Priority range: 1 (MIN_PRIORITY) to 10 (MAX_PRIORITY)
        - NORM_PRIORITY is 5 (default)
        - Higher priority threads get preference in scheduling
        - Note: Priority is just a hint to the scheduler, not a guarantee
        */
        t1.setPriority(Thread.MIN_PRIORITY);   // Priority 1 (lowest)
        t2.setPriority(Thread.NORM_PRIORITY);  // Priority 5 (default)
        t3.setPriority(Thread.MAX_PRIORITY);   // Priority 10 (highest)

        // Start all threads (they become eligible for execution)
        t1.start();
        t2.start();
        t3.start();

        try {
            /*
            JOIN() METHOD PURPOSE:
            - Makes main thread wait until these threads complete
            - Without join(), main thread would continue immediately
            - We wait for all threads to finish before printing "All threads finished"
            */
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All threads finished");

        /*
        IMPORTANT NOTES ABOUT THREAD PRIORITY:
        1. Priority is just a suggestion to the thread scheduler
        2. There's no guarantee higher priority threads will always run first
        3. Actual behavior depends on OS implementation
        4. Priorities should be used judiciously to avoid thread starvation
        5. On some systems, priorities may have no effect at all

        TYPICAL OUTPUT OBSERVATION:
        - Higher priority threads tend to get more CPU time
        - But you'll still see interleaving of all threads
        - The exact order may vary between runs due to OS scheduling
        */
    }
}