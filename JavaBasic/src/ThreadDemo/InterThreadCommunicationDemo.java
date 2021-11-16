package ThreadDemo;
class Q{
    int num;
    boolean setValue = false;
    public synchronized void put(int num) throws Exception{
//        while (setValue){
//            wait();
//        }
        System.out.println("Put : "+num);
        this.num = num;
//        setValue = true;
//        notify();
    }
    public synchronized void get() throws Exception{
//        while (!setValue){
//            wait();
//        }
        System.out.println("Get : "+num);
//        setValue = false;
//        notify();
    }
}
class Producer implements Runnable{
    Q q;
    public Producer(Q q){
        this.q = q;
        Thread t1 = new Thread(this,"Consumer");
        t1.start();
    }
    @Override
    public void run() {
        int i = 0;
        while (true){

            try {
                q.put(i++);
            } catch (Exception e) {
                e.printStackTrace();
            }

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Consumer implements Runnable{
    Q q;
    public Consumer(Q q) throws InterruptedException {
        this.q = q;
        Thread t2 = new Thread(this,"Consumer");
        t2.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void run() {
        try {
            q.get();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }}
public class InterThreadCommunicationDemo {
    public static void main(String[] args) throws InterruptedException {
        Q q = new Q();
        Producer p = new Producer(q);
        Consumer c = new Consumer(q);

    }
}

