package ExceptionHandling;

public class NestedException {
    public static void main(String[] args) {
        try{
            try {
                System.out.println("Inner Try exception");
                int sum = 30/0;
            }
            catch (ArithmeticException o){
                System.out.println(o);
            }
            try {
                String s= null;
                System.out.println(s.length());
            }
            catch (NullPointerException e){
                System.out.println(e);
            }
            System.out.println("This is outer try block code");
            int[] a = new int[3];
            a[5] = 7;
        }
        catch (ArithmeticException e){
            System.out.println("Couldn't handle");
        }
        finally {
            System.out.println("In this block all the code must be executed");
        }
    }
}
