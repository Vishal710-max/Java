package Threading.ShortHand;

/*
The Thread class provides multiple constructors, including:
   public Thread(Runnable target, String name) {
        // Initializes the thread
        this.target = target;
        this.name = name; // Sets the thread name directly
   }

1. Basic Thread Creation
   Syntax:
     Thread threadName = new Thread(RunnableObject, "ThreadName");

   Example:
     Thread t1 = new Thread(() -> {
         System.out.println("Thread is running!");
     }, "Worker-Thread");

   Explanation:
     - Thread t1: Creates a new thread object.
     - new Thread(): Instantiates a thread.
     - () -> { ... }: Lambda expression defining the task (replaces Runnable).
     - "Worker-Thread": Sets the thread name (optional but recommended).

2. Different Ways to Create Threads

   (A) Using Lambda Expression (Java 8+)
       Thread t = new Thread(() -> {
           System.out.println("Running in: " + Thread.currentThread().getName());
       }, "Lambda-Thread");
       t.start();

   (B) Using Anonymous Class
       Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Running in: " + Thread.currentThread().getName());
            }
       }, "Anonymous-Thread");
       t.start();

   (C) Using a Separate Runnable Class
      class MyTask implements Runnable {
           @Override
           public void run() {
                System.out.println("Running in: " + Thread.currentThread().getName());
           }
      }

      public class Main {
           public static void main(String[] args) {
               Thread t = new Thread(new MyTask(), "Runnable-Thread");
               t.start();
           }
      }
*/

public class Usefull_Syntax {
    public static void main(String[] args) {
        // Thread for table of 5
        Thread t5 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                  System.out.println("5 x " + i + " = " + (5 * i));
            }
        }, "Table-of-5");

        // Thread for table of 7
        Thread t7 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("7 x " + i + " = " + (7 * i));
            }
        }, "Table-of-7");

        t5.start();
        t7.start();
    }
}
