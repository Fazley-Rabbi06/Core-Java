package Question1;

import java.util.Scanner;

public class CoffeeShopDemo {
    static Beverage makeCoffee(String coffee) {
        Beverage beverage = null;
        if (coffee.equals("HouseBlend")) {
            beverage = new HouseBlend();
        } else if (coffee.equals("Espresso")) {
            beverage = new Espresso();
        } else if (coffee.equals("DarkRoast")) {
            beverage = new DarkRoast();
        } else if (coffee.equals("Decaf")) {
            beverage = new Decaf();
        }
        return beverage;
    }

    static Beverage makeCondiment(String condiment, Beverage coffee) {

        CondimentDecorator condimentDecorator = null;
        if (condiment.equals("Milk")) {
            condimentDecorator = new Milk(coffee)
            ;
        } else if (condiment.equals("Mocha")) {
            condimentDecorator = new Mocha(coffee)
            ;
        } else if (condiment.equals("Soy")) {
            condimentDecorator = new Soy(coffee)
            ;
        } else if (condiment.equals("Whip")) {
            condimentDecorator = new Whip(coffee)
            ;
        }

        return condimentDecorator;
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String moreCoffee = "yes";
        do {
            System.out.print("Enter Coffee Name: ");
            String coffeeName = console.next();

            Beverage beverage = makeCoffee(coffeeName);
            String needCondiment;

            do {
                System.out.print("Do you want any/more condiment(yes/no): ");
                needCondiment = console.next();
                if (needCondiment.equals("yes")) {
                    System.out.print("Enter Condiment Name: ");
                    String condimentName = console.next();
                    beverage = makeCondiment(condimentName, beverage);
                }
            } while (needCondiment.equals("yes"));

            System.out.print("You have ordered: " + beverage.getDescription() + " .Cost: $" + beverage.cost());

            System.out.println("\nDo you want more coffee(yes/no): ");
            moreCoffee = console.next();
        } while (moreCoffee.equals("yes"));

        System.out.print("Thank you for coming to coffee shop.");
    }
}