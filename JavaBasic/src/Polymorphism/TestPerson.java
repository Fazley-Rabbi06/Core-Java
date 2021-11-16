package Polymorphism;

public class TestPerson {
    public static void main(String[] args) {

        Person f1,f2,f3,f4,f5;
        //Compile time Polymorphism
        f1 = new Person();
        f3 = new Person("Ahmed",30,"Engineer","Dhaka","BSc");
        f2 = new Person("Hasan",40);
        f3.displayInfo();

        //Runtime Polymorphism or Dynamic Method Dispatch
        f3 = new Father(1234,0100000006);
        f3.displayInfo();







    }

}
