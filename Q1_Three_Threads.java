public class Q1_Three_Threads {
    
    public static void main(String[] args) {
        Runnable r1 = new Runnable1();
        Thread t1 = new Thread(r1);
        Runnable r2 = new Runnable2();
        Thread t2 = new Thread(r2);
        Runnable r3 = new Runnable3();
        Thread t3 = new Thread(r3);

        t1.start();
        t2.start();
        t3.start();
    }
    
}


class Runnable1 implements Runnable  {
    public void run(){
        try{
        System.out.println("Hello");
        Thread.sleep(1000);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

class Runnable2 implements Runnable{
    public void run(){
        try{
            System.out.println("Hi");
            Thread.sleep(3000);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
    }
}

class Runnable3 implements Runnable{
    public void run(){
        System.out.println("How are You?");
        
    }
}