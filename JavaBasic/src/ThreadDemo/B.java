package ThreadDemo;

public class B extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
    public void sum(int a, int b){
        int sum = a+b;
        System.out.println(sum);
    }

}
