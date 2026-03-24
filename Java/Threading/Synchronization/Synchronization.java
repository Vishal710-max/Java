class MyThread extends Thread {
    int num;
    static Object lock = new Object(); // Shared lock for all threads

    MyThread(int num, String name) {
        this.num = num;
        this.setName(name);
    }

    public void printTable(int num) {
        synchronized (lock) { // All threads compete for the SAME lock
            for (int i = 1; i <= 5; i++) {
                System.out.println(num * i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
            System.out.println(Thread.currentThread().getName() + " Completed..");
        }
    }

    @Override
    public void run() {
        printTable(this.num);
    }
}

public class Synchronization {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread(5, "t1");
        MyThread t2 = new MyThread(10, "t2");
        MyThread t3 = new MyThread(11, "t3");

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();
    }
}