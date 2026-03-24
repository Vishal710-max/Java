package Threading.ExtendingThreadClass;


public class Extending_Thread_Class {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        FirstTask t1 = new FirstTask();
        SecondTask t2 = new SecondTask();
        ThirdTask t3 = new ThirdTask();

        System.out.println("\nStarting 1st Thread");
        t1.start();

        System.out.println("\nStarting 2nd Thread");
        t2.start();

        System.out.println("\nStarting 3rd Thread");
        t3.start();

        long end = System.currentTimeMillis();
        System.out.printf("\n%s Total time taken: %d", Thread.currentThread().getName(), (end - start));
    }
}
