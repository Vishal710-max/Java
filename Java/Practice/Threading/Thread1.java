package Practice.Threading;

class MyThread extends Thread {
    int table;
    MyThread(int ele) {
        this.table = ele;
    }
    @Override
    public void run() {
        System.out.println("Table of " + this.table);
        for (int i = 1; i <= 5; i++) {
            System.out.println(this.table * i);
        }
    }
}

class MyThread1 implements Runnable {
    int table;
    MyThread1(int ele) {
        this.table = ele;
    }
    @Override
    public void run() {
        System.out.println("Table of " + this.table);
        for (int i = 1; i <= 5; i++) {
            System.out.println(this.table * i);
        }
    }
}
public class Thread1 {
    public static void main(String[] args) {
        MyThread obj = new MyThread(5);
        MyThread obj1 = new MyThread(10);

        obj.start();
        obj1.start();

        Thread t1 = new Thread(new MyThread1(15));
        t1.start();
    }
}
