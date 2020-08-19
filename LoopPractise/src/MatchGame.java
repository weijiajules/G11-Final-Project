
import hsa.Console;
import java.util.Random;

public class MatchGame {

    public static void main(String[] args) {
        Console c = new Console();
        int mynum;
        int compnum;
        int tries = 0;
        Random r = new Random();

        while (true) 
        {
            c.println("Enter a number from 1 to 100");
            mynum = c.readInt();

            if (mynum > 0 && mynum <= 100) {
                break;
            }
            c.println("Fool, try agian");
            
  
        }
        compnum=-1;
        while (compnum !=mynum) {
            compnum = r.nextInt(100) + 1;
            tries++;

            c.println(String.format("ON try %d the compuater picked %d" ,tries, compnum));

            if (mynum == compnum)
            break; //break means leaves the loop

        }
        c.println("it too " + tries + "tries to match you number.");
    }
}
