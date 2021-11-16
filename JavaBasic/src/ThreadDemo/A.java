package ThreadDemo;

public class A extends Thread{

    public  void run(){
        for (int i=0;i<5;i++){
            System.out.println("Hello");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
  }
}
