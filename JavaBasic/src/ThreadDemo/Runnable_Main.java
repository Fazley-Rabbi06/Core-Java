package ThreadDemo;

public class Runnable_Main {
    public static void main(String[] args) throws Exception {
//        System.out.println("HHHH");
        Runnable o2 = new Runnable_B();
        Thread t1 = new Thread(()->{
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }},"Hello Thread");
        Thread t2 = new Thread(o2);
        t1.start();
        t2.start();
//        t1.setName("Hello Thread");
//        t2.setName("Hi Thread");


//        System.out.println(t1.getName());
//        System.out.println(t2.getName());

        t1.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t1.getPriority());


//        t1.join();
//        System.out.println(t1.isAlive());
//        t2.join();
//        Runnable_A obj = new Runnable_A();
//        obj.sum(4,5);




    }
}
