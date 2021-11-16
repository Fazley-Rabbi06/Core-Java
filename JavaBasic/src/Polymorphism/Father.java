package Polymorphism;

public class Father extends Person {

    int salary;
    int contactNo;

    public Father(int salary,int contactNo){
        this.salary = salary;
        this.contactNo = contactNo;
    }
    @Override
    void displayInfo(){
        System.out.println("Salary : "+salary+"\nContact Number : "+contactNo);
    }

}

