package ExceptionHandling;

import java.io.IOException;

public class ExceptionThrows {
    static void m() throws IOException{
        throw new IOException("Device Error");
    }
     static void n() throws IOException {
        m();
    }
    static void p(){
        try {
            n();
        }
        catch (Exception e){
            System.out.println("Exception Handled");
        }
    }

    public static void main(String[] args) {
        p();
    }
}
