package CollectionFrameworks;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
            List<Integer> al = new LinkedList<>();
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the total numbers you want to put in arrylist-");
            int n = scan.nextInt();
            System.out.println("Start-");
            for (int i =0;i<n;i++){
                int num = scan.nextInt();
                al.add(num);
                System.out.println("Next-");
            }
            System.out.println(al);
        }
    }

