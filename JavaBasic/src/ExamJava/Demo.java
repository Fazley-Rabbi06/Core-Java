package ExamJava;
@FunctionalInterface
public interface Demo {
    public abstract int sum(int a);

    public static void display( String s){
        System.out.println(s);
    }
}
