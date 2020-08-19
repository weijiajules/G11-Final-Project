


import hsa.*;

//change name of class here
public class MetricConverson {

    public static Console c;

    public static void main(String args[]) {
        c = new Console();
        //mynum,anser gets sent in ansewr reaices ansewr back
        double mynum, answer;
        int choice;
        c.print("enter a number to convert >");
        mynum = c.readDouble();
        
        while (true) {
            drawMenu();
            choice = c.readInt();
            if (choice >=1 && choice <= 4) break;
            else{
                c.println("error - must be from 1-4");
                c.println("press any key to conturne");
                c.getChar();// waits fo
                c.clear();
        }
        
            } if (choice == 1) {
                answer = inchtocm(mynum);
                c.println(mynum + " inches to cm is " + answer);
            } else if (choice == 2) {
                answer = fttocm(mynum);
                c.println(mynum + " feet to cm is " + answer);
            } else if (choice == 3) {
                answer = yardtom(mynum);
                c.println(mynum + " yards to meters is " + answer);
            } else if (choice == 4) {
                answer = mtokm(mynum);
                c.println(mynum + " miles to km is " + answer);
            }

        }

    

    public static void drawMenu() {
        c.println("enter a number: ");
        c.println(""); // blank
        c.println("1-inches to cm");
        c.println("2-ft to cm");
        c.println("3-yard to m");
        c.println("4-miles to km");
        c.println("");
        c.print("enter chose 1-4 > ");

    }

    public static double inchtocm(double bob) {
        return bob * 2.54;
    }

    public static double fttocm(double bob) {
        return bob * 20;
    }

    public static double yardtom(double bob) {
        return bob * 0.91;
    }

    public static double mtokm(double bob) {
        return bob * 1.6;
    }

}


