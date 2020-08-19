import hsa.*;

//change name of class here
public class HockeyStats2D {

    public static Console c;

    public static void main(String args[]) {
        c = new Console();
        String teams[] = {"leafes", "oilers", "senterors", "falmes"};
        String info[] = {"w", "l", "otl", "pts"};
        // 4 teams 4 stats per tems
        int stats[][] = new int[4][4];

        for (int t = 0; t < 4; t++) { // vertical
            c.println("enter stats for " + teams[t]); // horazontal
            c.println("===============");
            for (int s = 0; s < 3; s++) {
                c.print(info[s] + ">");
                stats[t][s] = c.readInt();

            }// go to next stat
            // cacualates sta[3} pts
            stats[t][3] = stats[t][0] * 2 + stats[t][2];

        }// go to next tem
        //print score bpre
        c.clear();

        // print headings
        c.print("", 15); // 15 blank spaces
        for (int i = 0; i < 4; i++) {
            c.print(info[i], 5);
        }// print each team
        for (int i = 0; i < 4; i++) {
            c.print(teams[i], 15);
            // print stats for each team
            for (int j = 0; j < 4; j++) {
                c.print(stats[i][j], 5);

            }
c.println("");// new line for next team}
            

        }

    }

}










