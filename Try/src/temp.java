
import hsa.*;

//change name of class here
public class temp {

    public static Console c;
    
    public static void main(String args[])
    {
        c = new Console();
      double temps []= new double [12]; // makes  arry and just no items
    
      String months [] ={"JAN","FEB","MAR","APR","MAY","JUNE","JULY","AUG","SEP","OCT","NOV","DEC"}; // donest need tp say how many java will see
  // thsi loop lest you addd tmeo or each month
  
        for (int x = 0; x < 12; x++) {
            c.print ("eneter temperature for "+ months [x]+"> ");
            temps [x]=c.readDouble();
           
        }
         // this loop prints back all moths nad their temps
         for (int i = 0; i < months.length; i++) {
             c.print(months[i]+"\t");
             c.println(temps[i]);
            
        }
         /*
         String smonth;
         c.print("enter a month to enter temparute >");
         smonth=c.readLine();
         int result =findMonth(smonth, months); // months is an arrat
         c.println("findMonth returned a "+ result); // gives loacation of month
         if(result==-1 ){
             c.println("month not found");
         }
         else{
             c.println("the tempratur in " + smonth + "is"+ temps[result]);  // result is a laction
         }
*/
         double tval;
         c.print("enter min tmep to display>");
         tval = c.readDouble();
      listTemps(months,temps,tval);
      
      
    }
    // other methods
    public static int findMonth(String m, String list[]){ //sennd in an array for the peraremetner
        int location =-1; // havent found anything
        for (int i = 0; i < list.length; i++) {
            if (m.equals(list[i])){
                location=i; // location has been updated
            }
        }
    return location;
        
     
    }
    public static void listTemps(String m[], double t[], double minTemp){
        c.print("m list of months with tme atleast "+ minTemp );
        c.println("========================================");
                for (int i = 0; i < m.length; i++) {
            if (t[i]>= minTemp){
                    c.print(m[i],10);
                    c.println(t[i]);
                }
        }
    }
          
    
}









