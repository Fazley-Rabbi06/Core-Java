package ExceptionHandling;

import java.io.PrintWriter;

public class CompileTimeException {
    public static void main(String[] args) {
        PrintWriter pw;
        try{
            pw = new PrintWriter("x.tx");
            pw.println("Saved");
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Checked exception handled successfully");
    }



}
