package JavaFeatures08;

public interface Trainer {


    void topic();
    default String name(String s){
        return s;
    }
    static int phone(int num){
        return num;
    }
}
