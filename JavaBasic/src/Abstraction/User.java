package Abstraction;

import java.util.Scanner;

public class User extends BankingSystem {
    Scanner scan = new Scanner(System.in);
    double depositAmount,withdrawalAmount;

    @Override
    double transaction() {
        System.out.println("Enter transaction type : If Deposit then type - deposit ,if Withdraw  type withdraw or anything");
        String type = scan.next();
        if (type.equals("deposit")) {
            System.out.print("Enter your depositAmount = ");
            depositAmount = scan.nextDouble();
            initialAmount +=  depositAmount;
            System.out.println("Successfully Deposited");
        } else {
            System.out.print("Enter your withdrawalAmount = ");
            if (initialAmount == 0 || initialAmount < 0) {
                System.out.println("You don't have sufficient balance");
            } else {
                withdrawalAmount = scan.nextDouble();
                initialAmount -= withdrawalAmount;
                System.out.println("Your withdrawal successful");
            }
        }
        return initialAmount;
    }
        @Override
        void displayState(){
            System.out.println("Name = "+name+"\nAddress = "+address+"\nContact Number = "+contactNo+"\nTotal Amount = "+initialAmount);
        }
    }

