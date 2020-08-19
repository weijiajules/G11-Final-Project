
import processing.core.*;
import g4p_controls.*;
import hsa.Console;
import java.util.Random;
import javax.swing.JOptionPane;

//change name of class:
public class Nim extends PApplet {

    static String[] program = {"Nim"};
    static PImage stone;

    Console c = new Console();

// 2d arry for rocj latxaitons
    // 30 rocks each with an x snd y
    int loc[][] = new int[30][2];
    Random r = new Random();
    int mypick, compick, numstones;
    GLabel lblstatus;
    GTextField txtmystones;
    GButton btnpick;

    public void setup() {
        size(600, 600, JAVA2D);

        numstones = r.nextInt(16) + 15; // random numer between 0-15, min 15 max 30
        stone = loadImage("rock.png");

        for (int x = 0; x < numstones; x++) {
            loc[x][0] = r.nextInt(400) + 100;
            loc[x][1] = r.nextInt(400) + 100;
        }

        lblstatus = new GLabel(this, 150, 30, 200, 30);
        lblstatus.setOpaque(true);
        lblstatus.setText("there are " + numstones + " stone left. take 1- 3>");
        txtmystones = new GTextField(this, 375, 30, 30, 30);
        btnpick = new GButton(this, 425, 30, 100, 30);
        btnpick.setText("Pick stones");

    }

    public void handleButtonEvents(GButton button, GEvent event) {
        if (numstones == 0) {
            return;
        }

        if (button == btnpick) {

            mypick = Integer.parseInt(txtmystones.getText());

            if (moveOK(mypick) == false) {
                JOptionPane.showMessageDialog(null, "You suck! You didn't pick between 1-3 stones! Try agian and do it right this time.");

            } else if (mypick == 1) {
                numstones--;
                JOptionPane.showMessageDialog(this, "you took " + mypick + " stones");
                lblstatus.setText("there are " + numstones + " stones. Take up to 3.");
               
            } else if (mypick == 2) {
                numstones--;
                numstones--;
                JOptionPane.showMessageDialog(this, "you took " + mypick + " stones");
                lblstatus.setText("there are " + numstones + " stones. Take up to 3.");
              
            } else if (mypick == 3) {
                numstones--;
                numstones--;
                numstones--;
                JOptionPane.showMessageDialog(this, "you took " + mypick + " stones");
                lblstatus.setText("there are " + numstones + " stones. Take up to 3.");
                
            }
        
        }

        if (numstones <= 0) {
            JOptionPane.showMessageDialog(this, "you loose! BOOO!");
            btnpick.setEnabled(false);

        }
        while (true) {
            compick = r.nextInt(4);
            if (moveOK(compick) == true) {
                break;
            }
        }
        numstones -= compick;
        JOptionPane.showMessageDialog(null, "computer took " + compick);
        lblstatus.setText("there are " + numstones + " stones. Take up to 3.");
        if (numstones == 0) {
            JOptionPane.showMessageDialog(this, " You Win!");
        }

    }

    public static boolean moveOK(int howmany) {
        if (howmany <= 3 && howmany >= 1) {
            return true;
        } else {
            return false;
        }

    }

    public void draw() {
        background(0);
        //drawstones on table
        for (int i = 0; i < numstones; i++) {
            image(stone, loc[i][0], loc[i][1]);
        }
        // draw table
        noFill(); // border only , hollow shape
        strokeWeight(5); // border size
        stroke(100, 0, 0); // gray color
        rect(70, 70, 475, 475);//table

    }

    //this is needed to run the program
    public static void main(String ags[]) {
        PApplet.main(new String[]{Nim.class.getName()});
    }

}
