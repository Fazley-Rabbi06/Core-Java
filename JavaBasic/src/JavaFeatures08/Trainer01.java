package JavaFeatures08;

public interface Trainer01 {
    void topic();
    default String name(String s){
        return s;
    }
    static int phone(int num){
        return num;
    }
}
