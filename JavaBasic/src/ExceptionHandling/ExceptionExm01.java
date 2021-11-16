package ExceptionHandling;

public class ExceptionExm01 {
    public static void main(String[] args) {
       try{
           int a = 100;
           int b = 0;
           int div = a/b;
           System.out.println(div);
       }
       catch (ArrayIndexOutOfBoundsException e){
           System.out.println(e);

       }
        System.out.println("Rest of the code");
    }
}
