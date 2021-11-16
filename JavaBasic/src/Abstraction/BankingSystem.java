package Abstraction;

public abstract class BankingSystem {

    String name;
    String address;
    int contactNo;
    double initialAmount;

    void createAccount(String name,String address,int contactNo,double initialAmount){
        this.name = name;
        this.address = address;
        this.contactNo = contactNo;
        this.initialAmount = initialAmount;
    }
    abstract double transaction();
    abstract void displayState();




}
