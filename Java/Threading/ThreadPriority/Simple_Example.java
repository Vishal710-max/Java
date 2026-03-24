package Threading.ThreadPriority;

class  MyThread extends Thread {
    @Override
    public void run() {
        Thread current = Thread.currentThread();
        System.out.println(current.getName() + " is Running with priority " + current.getPriority());
    }
}
public class Simple_Example {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        t1.setName("t1");
        t2.setName("t2");
        t3.setName("t3");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}

// Output =>
// t3 is Running with priority 10
// t2 is Running with priority 5
// t1 is Running with priority 1
