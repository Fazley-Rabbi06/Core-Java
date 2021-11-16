package ThreadDemo;

class Count{
    int count;
    public synchronized void count(){
       count++;
    }
}
public class SynchronizedDemo {
    public static void main(String[] args) throws InterruptedException {
        Count obj1 = new Count();
        Runnable thread = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i<1000; i++) {
                    obj1.count();
                }
//                try{Thread.sleep(300);
//                } catch (InterruptedException e){e.printStackTrace();}

            }
        };
        Thread t1 = new Thread(thread);
        Thread t2 = new Thread(thread);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(obj1.count);

//        System.out.println(t1.getName());
//        System.out.println(t2.getName());


    }
}