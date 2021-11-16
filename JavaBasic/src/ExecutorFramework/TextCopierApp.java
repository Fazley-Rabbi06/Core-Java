package ExecutorFramework;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TextCopierApp {
    public static void main(String[] args) {
        TextCopier url = new TextCopier("https://jugbd.org/");
        TextCopier anotherUrl = new TextCopier("https://masterdevskills.com/");
        List<TextCopier> tasks = List.of(url,anotherUrl);
        ExecutorService executorService = Executors.newCachedThreadPool();
        try {
            List<Future<String>> futures = executorService.invokeAll(tasks);
            for (Future<String> future:futures
                 ) {
                String result = future.get();
            }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }


    }
}
