package Abstraction;

public class TestBankingSystem{
    public static void main(String[] args) {
        BankingSystem user1,user2;
        user1 = new User();
        user1.createAccount("Fazley","Dhaka",010000002,50000);
        user1.displayState();
        user1.transaction();
        user1.displayState();



    }



}
