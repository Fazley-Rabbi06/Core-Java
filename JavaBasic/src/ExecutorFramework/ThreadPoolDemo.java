package ExecutorFramework;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
    public static void main(String[] args) {
        int core = Runtime.getRuntime().availableProcessors();

//        System.out.println();
        ExecutorService executorService = Executors.newFixedThreadPool(core);
        while (true){
            Runnable task = new Runnable(){
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName());
                }
            };
            executorService.execute(task);
        }
    }
}
