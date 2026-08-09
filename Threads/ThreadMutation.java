package Threads;

class Counter{
    int count;

    //we used syncronized so that only one function can call it others need to wait
    public synchronized void increment(){
        count++;
    }
}

public class ThreadMutation {
    public static void main(String[] args) {

        Counter c = new Counter();
        Runnable obj = () -> {
            for(int i=0;i<10000;i++){
                c.increment();
            }
        };

        Runnable obj1 = () -> {
            for(int i = 0; i<10000;i++){
                c.increment();
            }
        };


        Thread t = new Thread(obj);
        Thread t1=new Thread(obj1);
        t.start(); 
        t1.start();

        try {
            t.join();
            t1.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(c.count);
    }
    
}
