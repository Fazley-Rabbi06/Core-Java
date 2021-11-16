package Recap;

public class PassByValue {
    int x;
    PassByValue(int i){
        x=i;
    }
    PassByValue(){
        x = 2;
    }

    public static void change(PassByValue y){
        y = new PassByValue();
        y.x = 9;

    }

}
