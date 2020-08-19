import processing.core.*;
import g4p_controls.*;

//change name of class:
public class PizzaOrder extends PApplet
{
        String toppings[] = {"Ham","Bacon","Pineapple","Mushroom","Olives","Pepperoni"};
        //                     0      1         2          3         4          5
        GCheckbox topchoices[] = new GCheckbox[6];
        
        int pepx []= {10, 120, 300, 575, 354,190};
        int pepy []= {350, 450, 200, 75, 230, 10};
        int pepspeed []= {3, 5, 1,9, 10, 2};
        
                GButton btnorder, btnclear;
                GTextArea txtbill;
                int numtoppings;
                double total;
                
	public void setup()
	{
		size(640, 480, JAVA2D);
                
                for (int i = 0; i < 6; i++) {
                    topchoices[i] = new GCheckbox(this, 10,10 + 30 *i,100,30);
                    topchoices[i].setText(toppings[i]);
                   
                }
               btnorder = new GButton (this, 10, 300, 100, 30);
               btnorder.setText("order");
                       
                 btnclear = new GButton (this, 10, 300, 100, 30);
                 btnclear.setText("Clear");
                 
                 txtbill =new GTextArea (this, 120, 10, 200, 180);
                 txtbill.setEnabled (false);
                

	}
     

	public void handleButtonEvents(GButton button, GEvent event) 
	{
if (button == btnorder);
    total = 10;
            numtoppings = 0;
            txtbill.setText ("");
            for (int i = 0; i < topchoices.length; i++)
            if (topchoices [i].isSelected ()){
                numtoppings++;
                total +=0.50;
                txtbill.appendText (topchoices [i].getText()+ "\in");
                
            }
            txtbill.appendText ("------------------|n");
            txtbill.appendText ("Toppings: " + numtoppings);
            txtbill.appendText ("\n---------------------------\n");
            txtbill.appendText (topchoices [i].getText () + "\n");
                    
{
    if (button==btnclear)total=10;
    numtoppings =0;
    txtbill.setText("");
    for (int i =0; i < topchoices.length; i++) {
        topchoices[i];
    }
}
		//code for buttons goes here
	}		

	public void draw()
	{
		background(240, 240, 220); //light tan
                fill (200,0,0);
               for (int i=0; i<pepx.length ; i++){
                 ellipse {pepx [i], 20, 20);
                   pepx[i] += pepspeed[i];
                if (pepx[i] > 640) {
                     || pepx[i] < 0
                }
                
                   pepspeed[i] = pepspeed[i];

            }
        }
        //this is needed to run the program
    public static void main(String[] args);
    {
        PApplet.main(new String[]{PizzaOrder.class.getName()});
    }

}
