
import processing.core.*;
import g4p_controls.*;
import hsa.Console;

//change name of class:
public class NumberList extends PApplet {

    GTextArea list1, list2;
    GButton btngo, btnclear;
    GLabel lblstart, lblstop, lblchange;
    GTextField txtstart, txtstop, txtchange;
    int start, stop, change;

    public void setup() {
        size(640, 480, JAVA2D);
        lblstart = new GLabel(this, 10, 10, 50, 20);
        lblstart.setText("Start");
        lblstop = new GLabel(this, 110, 10, 50, 20);
        lblstop.setText("Stop");
        lblchange = new GLabel(this, 210, 10, 50, 20);
        lblchange.setText("Change");

        txtstart = new GTextField(this, 10, 30, 50, 20);
        txtstop = new GTextField(this, 110, 30, 50, 20);
        txtchange = new GTextField(this, 210, 30, 50, 20);

        btngo = new GButton(this, 10, 60, 250, 30);
        btngo.setText("Generate Lists");
        btnclear = new GButton(this, 10, 310, 250, 30);
        btnclear.setText("Clear");

        list1 = new GTextArea(this, 10, 100, 100, 200, 1);
        list2 = new GTextArea(this, 150, 100, 100, 200, 1);

    }

    public void handleButtonEvents(GButton button, GEvent event) {

        if (button == btngo) {
            start = Integer.parseInt(txtstart.getText());
            stop = Integer.parseInt(txtstop.getText());
            change = Integer.parseInt(txtchange.getText());

            if (change > 0) {
                change = change * -1;

                for (int i = start; i >= stop; i += change) {
                    list1.appendText(i + "\n");

                }
            } else
            {

                
                 if (change < 0) {
                change = change * -1;
                
                //generate list 1
                for (int i = start; i <= stop; i += change) {
                    list1.appendText(i + "\n");
                }
                //generate ist2
                int i = start;
                while (i <= stop) {
                    list2.appendText(i + "\n");
                    i += change;
                }

            }
            else{
            txtstart.setText("");
            txtstop.setText("");
            txtchange.setText("");
            list1.setText("");
            list2.setText("");
        }
        }
        
    

    

    public void draw() {
        background(240, 240, 220); //light tan

    }

    //this is needed to run the program
    public static void main(String ags[]) {
        PApplet.main(new String[]{NumberList.class.getName()});
    }

}
