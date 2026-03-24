package Threading.ExtendingThreadClass;

public class SecondTask extends Thread{
    @Override
    public void run() {
        // Second Task
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d# ", i);
        }
        System.out.println("\n# Task is Completed..");
        System.out.printf("\n%s # ", Thread.currentThread().getName());
    }
}
