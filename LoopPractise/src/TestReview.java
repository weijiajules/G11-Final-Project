
import hsa.Console;


public class TestReview {

    public static void main(String[] args)
    {
       Console c=new Console();
       int count=0;
       double total=0;
       double item;
       while (true){
           count++;
           while (true){
               //stay until postive or -1 emntered
             c.print ("enter price for item " +  count + ">");
             item = c.readDouble ();
             if (item>0 || item ==-1) 
                 break;
             c.println ("that one doesnt count");
             
           }
           //comes if we entered postive or -1
           if (item==-1){
               //user is all done so leave
               count--; //uncount the quit number
               break; //leave the outer loop
           }
           total += item; //add item into the total
           
       }
       //comes here afete user enters -1
       c.println ("number of items purchased" + count );
       c.println ("total; $" +total);
   

    }
    
}
