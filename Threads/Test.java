package Threads;

class A extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello");
            // optimizing the thread for printintng one by one
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hii");
            // optimizing the thread for printintng one by one
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

// Another way of creating a thread
// when we extend the Thread Class we can not make any other class as parent

//Moved to lambda expression

// class C implements Runnable {
//     public void run() {
//         for (int i = 0; i < 5; i++) {
//             System.out.println("Good Morning");
//             try {
//                 Thread.sleep(100);
//             } catch (Exception e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }


//converted to lambda expression

// class D implements Runnable {
//     public void run() {
//         for (int i = 0; i < 5; i++) {
//             System.out.println("Good Morning Sir");
//             try {
//                 Thread.sleep(100);
//             } catch (Exception e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

public class Test {
    public static void main(String[] args) {

        A obj1 = new A();
        B obj2 = new B();

        System.out.println(obj1.getPriority());
        System.out.println(obj2.getPriority());

        // we can set the priority of the thread
        // obj1.setPriority(Thread.MAX_PRIORITY);
        // obj1.setPriority(10);
        // max priority is 10
        // min priority is 1
        // and normal priority is 5

        // obj1.start();

        // given the gap between the start of the two threads
        try {
            Thread.sleep(15);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // obj2.start();

        // creating thread from Runnable

        // C obj = new C();
        // D obj = new D();

        Runnable objC = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Good Morning");
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        
        Runnable objD = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Good Morning Sir");
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }            
        };

        Thread t1 = new Thread(objC);
        Thread t2 = new Thread(objD);

        t1.start();
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();

    }
}
