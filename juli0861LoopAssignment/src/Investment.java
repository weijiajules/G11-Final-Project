
import hsa.Console;

public class Investment {

    public static void main(String[] args) {
        Console c = new Console();
        double money=0, rate, inv;
        int years = 0;

        while (true) {
            c.print("How much money do you want to invest? > ");
            inv = c.readDouble();
            if (inv <= 1999) {
                c.print("Please invest a min of $2000 ");
            } else {
                break;
            }
        }
        
        while (true) {
             c.print("How much do you expext to earn in interest > ");
            rate = c.readDouble();
            if (rate >= 0.05 && rate <= 0.15) {
                break;
            } else {
                c.print("Invailed rate! Please try agian ");
            }
        }
        
        while (money <= 1000000){
            money = money + inv;
            //money += inv;  += means increase by
            money+=rate*money;
            years+=1;
            c.println(String.format("Year %d > $ %.2f", years, money));
        }
        
        c.println (String.format("it will take %d years to reach $1 millon",years));
        
       
    }

}
