
import hsa.Console;

public class CarRecall {

    public static void main(String[] args) {
        Console c = new Console();
        int mod = 0;

        while (true) {
            c.println("Enter the Car model or -1 to quit:    ");
            mod = c.readInt();
            if (mod == 119 || mod == 179 || mod == 189 || mod >= 195 && mod <= 221) {
                c.println("YOUR CAR IS DEFECTIVE!!! IT MUST BE REPAIRED!");
            } else if (mod == -1) {
                c.println("Program has ended.");
                break;
            } else {
                c.println("Your car is fine. Your car is not defective.");
            }
           
        }

    }
}
