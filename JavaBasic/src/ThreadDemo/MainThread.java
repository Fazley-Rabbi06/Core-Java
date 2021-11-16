package ThreadDemo;
public class MainThread {
    public static void main(String[] args) throws InterruptedException {
        A obj = new A();
        B obj1 = new B();
        obj.start();
        Thread.sleep(1000);
        obj1.start();
//        try {
//            Thread.sleep(500);
//        }catch (Exception e){
//            System.out.println(e);
//        }



    }
}
