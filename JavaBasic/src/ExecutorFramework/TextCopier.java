package ExecutorFramework;

import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class TextCopier implements Callable<String> {
    private String target;

    public TextCopier(String url){
        this.target = url;
    }
    @Override
    public String call() throws Exception {
        URL url = new URL(target);
        StringBuilder builder = new StringBuilder();
        InputStream is = url.openConnection().getInputStream();
        Scanner scan = new Scanner(is);
        while (scan.hasNext()){
            builder.append(scan.nextLine());
        }
        return builder.toString();
    }
}
