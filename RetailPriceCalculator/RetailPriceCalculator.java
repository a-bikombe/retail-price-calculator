package RetailPriceCalculator;

import java.util.*;

public class RetailPriceCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double wholesale, markup;

        System.out.print("Enter the wholesale cost: ");
        wholesale = input.nextDouble();

        System.out.print("Enter the markup percentage in decimal form: ");
        markup = input.nextDouble();

        System.out.println("Your retail price is " + calculateRetail(wholesale, markup));    // stating retail price
    }

    public static double calculateRetail(double wholesale, double markup) {    // calculating retail price
        double retail;
        retail = wholesale * (1 + markup);
        return retail;
    }
}
