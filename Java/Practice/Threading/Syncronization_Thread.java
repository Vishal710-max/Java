package Practice.Threading;

class  PrintTable {
    synchronized void print(int ele) {
        System.out.println("Table of " + ele);
        for (int i = 1; i <= 5; i++) {
            System.out.println(ele * i);
            try {
                Thread.sleep(1000);
            } catch (Exception a) {
                System.out.println("Exception: " + a);
            }
        }
    }
}
public class Syncronization_Thread {
    public static void main(String[] args) {
        PrintTable obj = new PrintTable();

        Thread  t1 = new Thread(() -> obj.print(10), "MyThread1");
        Thread  t2 = new Thread(() -> obj.print(11), "MyThread2");
        Thread  t3 = new Thread(() -> obj.print(12), "MyThread3");

        t1.start();
        t2.start();
        t3.start();
    }
}
