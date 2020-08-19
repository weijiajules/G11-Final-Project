import hsa.*;

//change name of class here
public class AddCoins {

    public static void main(String args[]) {
        Console c = new Console();
        double pennies, nickels, dimes, quarters;

        c.println("enter your coins down below: ");
        c.print("Pennies: ");
        pennies = c.readDouble();
        c.print("Nickels: ");
        nickels = c.readDouble();;
        c.print("Dimes: ");
        dimes = c.readDouble();
        c.print("Quarters: ");
        quarters = c.readDouble();
        c.println("your coins add up to $" + coins(pennies, nickels, dimes, quarters));

    }

    public static double coins(double p, double n, double d, double q) {
        return p + n * .05 + d * .10 + q * .25;
}
}



