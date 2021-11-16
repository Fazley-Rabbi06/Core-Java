package Polymorphism;

public class Person {
    String name;
    int age;
    String profession;
    String homeAdd;
    String lastDegree;

    public Person(){}

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public Person(String name,int age,String profession,String homeAdd,String lastDegree){
        this.name = name;
        this.age = age;
        this.profession = profession;
        this.homeAdd = homeAdd;
        this.lastDegree = lastDegree;
    }

    void insertInfo(String profession,String lastDegree){
        this.profession = profession;
        this.lastDegree = lastDegree;
    }

    void insertInfo(String homeAdd){
        this.homeAdd = homeAdd;
    }

    void displayInfo(){
        System.out.println("Name : "+name+"\nAge : "+age+"\nProfession : "+profession+"\nHome Address :"+homeAdd+"\n");
    }

}
