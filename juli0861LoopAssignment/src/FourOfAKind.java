
import processing.core.*;
import g4p_controls.*;
import javax.swing.*;
import java.util.Random;

//change name of class:
public class FourOfAKind extends PApplet {

    GCheckbox cbkeep[] = new GCheckbox[4];
    PImage imgdice[] = new PImage[4];
    int nums[] = new int[4];
    GButton btnroll, btnclear;
    Random r = new Random();

    public void setup() {
        size(640, 480, JAVA2D);

        for (int i = 0; i < 4; i++) {

            cbkeep[i] = new GCheckbox(this, 50 + (100 * i), 100, 50, 20);
            cbkeep[i].setText("keep");
            cbkeep[i].setEnabled(false);
            imgdice[i] = loadImage("q.jpg");
        }
        btnroll = new GButton(this, 500, 10, 80, 30);
        btnroll.setText("roll");

        btnclear = new GButton(this, 500, 50, 80, 30);
        btnclear.setText("Clear");

    }

    public void handleButtonEvents(GButton button, GEvent event) 
    {
        if (button == btnroll) 
        {
// go thru each check to seee if we want a new dice
            for (int i = 0; i < 4; i++)
            {
                 cbkeep[i].setEnabled(true);
                if (cbkeep[i].isSelected()) 
                {
                    //do nothing
                }
                else 
                {
                    //get a new dice
                    nums[i] = r.nextInt(6) + 1; //1-6
                    //replace dice image
                    imgdice[i] = loadImage("d" + nums[i] + ".jpg");
                }
                
            }
            if (nums[0] == nums[1] && nums[0] == nums[2] && nums[0] == nums[3]) 
            {
                //now have my 4 dice
                // did i win? = 4 of a kind
                System.out.println("4 of a kind! YOu win!");
            }
        }
        else 
        {
            for (int i = 0; i < 4; i++) {

                imgdice[i] = loadImage("q.jpg");
                cbkeep[i].setEnabled(false);
                cbkeep[i].setSelected(false);

            }
        }
    }

    public void draw() {
        background(240, 240, 220); //light tan
        for (int i = 0; i < 4; i++) {
            image(imgdice[i], 40 + (100 * i), 5);

        }
    }

    //this is needed to run the program
    public static void main(String ags[]) {
        PApplet.main(new String[]{FourOfAKind.class.getName()});
    }

}
