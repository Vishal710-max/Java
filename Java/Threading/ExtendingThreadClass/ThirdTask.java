package Threading.ExtendingThreadClass;

public class ThirdTask extends Thread{
    @Override
    public void run() {
        // Third Task
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d$ ", i);
        }
        System.out.println("\n$ Task is Completed..");
        System.out.printf("\n%s $ ", Thread.currentThread().getName());
    }
}
