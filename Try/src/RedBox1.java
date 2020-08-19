
import processing.core.*;
import g4p_controls.*;

//change name of class:
public class RedBox1 extends PApplet {

    int xloc = 20, yloc = 20;
    //xdir -> -5(left) 0,+5(right) 
    //ydir -> -5(up),0,+5(down)
    int xdir = 0, ydir = 0;

    //when ld is tur, xdir will be -5
    boolean ld = false, rd = false, ud = false, dd = false;

    public void setup() {
        size(640, 480, JAVA2D);

    }

    public void handleButtonEvents(GButton button, GEvent event) {

        //code for buttons goes here
    }

    public void keyPressed() {
        if (keyCode == RIGHT) {
            rd = true;
        } else {
            rd = false;
        }
        //true or false quesiont, short cut ways
        ld = (keyCode == LEFT);
        ud = (keyCode == UP);
        dd = (keyCode == DOWN);

    }

    public void keyReleased() {
        if (keyCode == LEFT) {
            ld = false;
        }
        if (keyCode == RIGHT) {
            rd = false;
        }
        if (keyCode == UP) {
            ud = false;
        }
        if (keyCode == DOWN) {
            dd = false;
        }

    }

    public void mousePressed() {
        // System.out.println(""+mouseX+","+mouseY);
        if (mouseX >= xloc && mouseX <= xloc + 20 && mouseY >= yloc && mouseY <= yloc + 20) {
            //click boz wiht the mous
            //System.out.println("BOX HIT");

            xloc = (int) (random(600) + 1);
            yloc = (int) (random(440) + 1);

        }
        //else System.out.println("BOX MISS");

    }

    public void drawCar(int x, int y) {
        fill(255, 0, 0);// reD 
        // BPODY
        rect(x, y, 90, 20);
        fill(210, 250, 250); // light blue
        rect(x + 20, y - 20, 50, 20);
        //tries
        fill(0, 0, 0);
        ellipse(x + 20, y + 20, 20, 20);
        ellipse(x + 70, y - 70, 20, 20);

    }

    public void drawCar(int x, int y, int r, int g, int b) {
        fill(r, g, b);// reD 
        // BPODY
        rect(x, y, 90, 20);
        fill(210, 250, 250); // light blue
        rect(x + 20, y - 20, 50, 20);
        //tries
        fill(0, 0, 0);
        ellipse(x + 20, y + 20, 20, 20);
        ellipse(x + 70, y + 20, 20, 20);

    }

    public void draw() {
        background(240, 240, 220); //light tan
        fill(255, 0, 0);

        drawCar(xloc, yloc, 244, 66, 164);
        rect(xloc, yloc, 20, 20);
        xloc += xdir;
        yloc += ydir;

        //set xdir to -5,0,5
        if (ld) {
            xdir = -5;
        } else if (rd) {
            xdir = 5;
        } else {
            xdir = 0;
        }

        if (ud) {
            ydir = -5;
        } else if (dd) {
            ydir = 5;
        } else {
            ydir = 0;
        }

        //come bakc out on other side
        if (xloc <= 0) {
            xloc = 635;
        }
        if (xloc >= 640) {
            xloc = 5;
        }

        if (yloc <= 0) {
            yloc = 475;
        }
        if (yloc >= 480) {
            yloc = 5;
        }

    }

    //this is needed to run the program
    public static void main(String ags[]) {
        PApplet.main(new String[]{RedBox1.class.getName()});
    }

}
