package ExceptionHandling;

public class ExceptionThrow {
    public void validate(int age){
        if (age<18)
            throw new ArithmeticException("Person is not eligible for vote");
        else
            System.out.println("Eligible for vote");
    }
}
