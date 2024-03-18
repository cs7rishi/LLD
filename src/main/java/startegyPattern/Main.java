package startegyPattern;

import startegyPattern.strategy.impl.FixedDiscountStrategy;
import startegyPattern.strategy.impl.PercentageDiscountStrategy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the bill total");

        double billAmount = scanner.nextDouble();

        //Percentage strategy
        Order order1 = new Order(billAmount, new PercentageDiscountStrategy());
        System.out.println("Total Bill using percentage strategy: " + order1.getBill());

        //Fixed strategy
        Order order2 = new Order(billAmount, new FixedDiscountStrategy());
        System.out.println("Total Bill using fixed strategy: " + order1.getBill());

    }
}
