package ExceptionHandling;

public class Exception02 {
    public static void main(String[] args) {
        try{
            int[] x = new int[4];
            x[4] = 5;
        }
        catch(Exception o){
            System.out.println(o);
        }
        System.out.println("Exception Handled");
    }

}
