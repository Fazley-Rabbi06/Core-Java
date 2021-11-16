package JavaFeatures08;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class PrimeChecker {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String n = bufferedReader.readLine();
        int num = Integer.parseInt(n);
        String store = s.nextBigInteger().isProbablePrime(num)? "Prime":"Not Prime";
        bufferedReader.close();
        System.out.println(store);
    }

}


