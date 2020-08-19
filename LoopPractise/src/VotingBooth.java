
import hsa.Console;

public class VotingBooth {

    public static void main(String[] args) {
        Console c = new Console();
        int pc = 0, lib = 0, ndp = 0, green = 0;
        char vote = 'x';

        while (vote != 'q') {
            c.print("Vote p, l, n ,g ot q to quit >");
            vote = c.getChar();

            if (vote == 'p')
            {
                c.println("Vote cast for PC");

                pc++;

            } 
            else if (vote == 'l') 
            {
                c.println("Vote cast for Liberal");
                lib++;
            } 
            else if (vote == 'n') 
            {
                c.println("Vote cast for NDP");
                ndp++;
            }
            else if (vote == 'g')
            {
                c.println("Vote cast for green");
                green++;
            }
            else if (vote != 'q')
            {
                c.println("Spoiled ballot");
            }
        }

        c.println("");
        c.println("ElectionResults");
        c.println("====================");
        c.print("PC", 20);
        c.println(pc);
        c.print("Liberal", 20);
        c.println(lib);
        c.print("NDP", 20);
        c.println(ndp);
        c.print("Green", 20);
        c.println(green);
    }
}
