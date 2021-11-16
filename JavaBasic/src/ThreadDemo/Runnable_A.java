package ThreadDemo;

public class Runnable_A extends B implements Runnable{
    @Override
    public void sum(int a, int b) {
        super.sum(a, b);
    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }}
