package JavaFeatures08;

import java.util.Locale;
import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        String[] arr = new String[7];
        Optional<String> obj = Optional.ofNullable(arr[5]);
        if (obj.isPresent()){
            String s = arr[5].toLowerCase();
            System.out.println(s);
        }
        else{
            System.out.println("(wink) ");
        }
    }
}
