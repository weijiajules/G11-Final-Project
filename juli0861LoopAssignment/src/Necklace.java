
import processing.core.*;
import g4p_controls.*;
import javax.swing.JOptionPane;

//change name of class:
public class Necklace extends PApplet {

    int num1, num2, nextnum;
    int origl, orig2; // keep track of org nambers before they change
    GButton btngo, clear;
    GLabel numi, numii;
    GTextArea numbi, numbii;

    public void setup() {
        size(640, 480, JAVA2D);
        btngo = new GButton(this, 300, 10, 100, 30);
        btngo.setText("Make a necklace");

        clear = new GButton(this, 10, 200, 100, 30);
        clear.setText("Clear");

        numi = new GLabel(this, 30, 10, 50, 50);
        numi.setText("Num 1");
        numi.setOpaque(true);
        numii = new GLabel(this, 30, 70, 50, 50);
        numii.setText("Num 2");
        numii.setOpaque(true);

        numbi = new GTextArea(this, 90, 10, 50, 50);
        numbi.setEnabled(true);
        numbii = new GTextArea(this, 90, 70, 50, 50);
        numbii.setEnabled(true);

    }

    public void handleButtonEvents(GButton button, GEvent event) {
        num1 = 9;
        num2 = 1;
// make sure both nums are from 1 to 9
        if (num1 < 1 || num1 > 9 || num2 < 1 || num2 > 9) {
            JOptionPane.showMessageDialog(this, "Error - all numbers must be from 1 - 9");
            return;
        }
        System.out.println("Necklase starts here");
        num1 = Integer.parseInt(numi.getText());
        num1 = Integer.parseInt(numii.getText());
        numbi.append(num1 + "\n");
        numbii.append(num2 + "\n");

        origl = num1;
        orig2 = num2;
        while (true) {
            nextnum = num1 + num2;
            if (nextnum > 9) {
                nextnum -= 10;
            }
            numbi.append(num1 + "\n");
            num1 = num2;
            num2 = nextnum;

            if (num1 = orig1 && num2 = orig2) {
                break;
            }

        }

    

    

    

    

    public void draw() {
        background(240, 240, 220); //light tan

    }

    //this is needed to run the program
    public static void main(String ags[]) {
        PApplet.main(new String[]{Necklace.class.getName()});
    }

}
