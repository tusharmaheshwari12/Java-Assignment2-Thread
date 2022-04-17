public class Q2_EvenNo_OddNo {

    public static void main(String[] args) {
        Runnable r1 = new Runnable1();
        Thread t1 = new Thread(r1);
        Runnable r2 = new Runnable2();
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
    }
}

class Runnable2 implements Runnable{
    public void run(){
        System.out.println("----------------Even Numbers from 1-100-------------");
        for(int i=0;i<100;i+=2) {
            System.out.println(i);
        }
    }
}

class Runnable1 implements Runnable{
    public void run(){
        System.out.println("----------------Odd Numbers from 1-100-------------");
        for(int i=1;i<=100;i+=2) {
           System.out.println(i);
        }
    }
}