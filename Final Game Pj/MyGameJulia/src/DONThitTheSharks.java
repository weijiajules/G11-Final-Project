
import processing.core.*;
import g4p_controls.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

//change name of class:
public class DONThitTheSharks extends PApplet {
    //imgames used
    PImage imgwater, imgman, imgtreasure, imgover, imgshark, imgfish, introscreen, imgend;
    //player fisher man
    Hitbox man, endL, intro;
    //array of hitboxes for the trasures
    ArrayList<Hitbox> treasures = new ArrayList();
    ArrayList<MovingTreasure> sharks = new ArrayList();
    ArrayList<MovingTreasure> fish = new ArrayList();

    int counter = 0;
    Boolean gameover = false, starting = true;
    int plscore = 0, nfish = 0, nshark = 0, nt = 0;
      GameSound coin,fs,ss;
      
    public void setup() {
        size(952, 460, JAVA2D);
        //load img and sonds
        imgwater = loadImage("water.jpg");
        imgman = loadImage("fisherman.png");
        imgtreasure = loadImage("ptreasure.png");
        imgshark = loadImage("shark.png");
        imgfish = loadImage("fish.png");
        introscreen = loadImage("opening.png");
        imgend = loadImage("ending.png");
     coin = new GameSound("coin.wav");
         fs = new GameSound("fishsounds.wav");
         ss=new GameSound("sharkso.wav");

        man = new Hitbox(this, imgman, 10, 50);
        intro = new Hitbox(this, introscreen, 952, 420);

//creates the traseure at start
        for (int i = 0; i < 2; i++) {
            treasures.add(new Hitbox(this, imgtreasure, (int) random(950), (int) random(450) + 30));
        }
        //createss sharks at start
        for (int i = 0; i < 6; i++) {
            sharks.add(new MovingTreasure(this, imgshark, (int) random(950) + 100, (int) random(450) + 30));
        }
        //create 10 fish at start
        for (int i = 0; i < 10; i++) {
            fish.add(new MovingTreasure(this, imgfish, (int) random(950), (int) random(450) + 30));
        }
        noCursor();
    }

    public void endingLine() {
        //this is teh finsih line
        endL = new Hitbox(this, 900, 0, 10, 460);
        fill(255, 0, 0);
        rect(900, 0, 10, 460);
    }

    public void handleButtonEvents(GButton button, GEvent event) {
    }

    public void keyReleased() {
        //see if the key is realsed
        man.stop(keyCode);//keycoade is for arrow keys
    }

    public void keyPressed() {
        //click to start game after teh staring screen 
        if (starting == false) {
            return;
        }
        starting = false;
    }

    public void draw() {
        //draw the staring screan
        if (starting) {
            background(introscreen);
            return;
        }
        //increase the time
        counter++;
        //generate moving sharks ranomly
        if (counter % 100 == 0 && gameover == false) {
            if (random(2) < 1) {
                sharks.add(new MovingTreasure(this, imgshark, (int) random(930) + 100, (int) random(440) + 20));
            }
        }
        //generate treasure ranomly
        if (counter % 30 == 0 && gameover == false) {
            if (random(2) < 1) {
                treasures.add(new Hitbox(this, imgtreasure, (int) random(930), (int) random(440) + 20));
      
            }
        }
        //generate moving fish ranomly
        if (counter % 40 == 0 && gameover == false) {
            if (random(2) < 1) {
                fish.add(new MovingTreasure(this, imgfish, (int) random(930), (int) random(440) + 20));
                 
            }
        }
        //background water
        background(imgwater);
        //drawing the fisnish line
        endingLine();
        //if the  man hits the red ln game ends the game over screeen will apper

        //see if game is over
        if (gameover == false) {
            man.draw();
        }

        man.move();
//draw the treasures
        for (int i = 0; i < treasures.size(); i++) {
            treasures.get(i).draw();
        }
        //draw the sharks moving
        for (int i = 0; i < sharks.size(); i++) {
            sharks.get(i).draw();
            sharks.get(i).move();
        }
        //draw the fish moving
        for (int i = 0; i < fish.size(); i++) {
            fish.get(i).draw();
            fish.get(i).move();
        }

        //hit dectetion
        for (int i = 0; i < treasures.size(); i++) {
            //hit boxestreasure shorted for ease
            Hitbox t = treasures.get(i);
            //if man collides with the treasure 
            if (man.collidesWith(t)) {
                /// player scjore will increase
                if (man.collidesWith(t)) {
                    plscore += 50;
                    //counts the nuber of trasue collected
                    nt++;
                    //treasure sounds
                        coin.playSound();
                }
                // if hit the treausre will disapper
                treasures.remove(i);
            }
        }
        for (int i = 0; i < fish.size(); i++) {
            //hit boxes fish shorted for ease
            Hitbox f = fish.get(i);
            //if man collides with the fish
            if (man.collidesWith(f)) {
                /// player scjore will increase
                if (man.collidesWith(f)) {
                    plscore += 25;
                    //counts the nuber of fish collected
                    nfish++;
                    //fish sounds
                    fs.playSound();
                }
                // if hit the fish will disapper
                fish.remove(i);
            }
        }

        for (int i = 0; i < sharks.size(); i++) {
            //hit boxes fish shorted for ease
            Hitbox s = sharks.get(i);
            //if man collides with the fish
            if (man.collidesWith(s)) {
                /// player scjore will increase
                if (man.collidesWith(s)) {
                    plscore -= 50;
                    //counts the nuber of sharks hit
                    nshark++;
                    //play shark sounds
                        ss.playSound();
                }
                sharks.remove(i);
            }
        }
        //prints score
        fill(255);
        rect(700, 0, 900, 20);
        fill(0);
        text("Your Score:  " + plscore, 730, 20);

        if (man.collidesWith(endL)) {
           
//remmoves fish sharks and treasures
            for (int i = 0; i < fish.size(); i++){ 
                fish.remove(i);
            }
          for (int i = 0; i < sharks.size(); i++) {
                sharks.remove(i);
            }
           for (int i = 0; i < treasures.size(); i++) {
                treasures.remove(i);
            } 
//clears the screan
            clear();
            //ending img appers
            image(imgend, 0, 0);
            fill(209, 54, 54);
            textFont(createFont("Times", 40));
            //tells the player stats
            text(plscore, 470, 235);
            text(nfish, 470, 300);
            text(nt, 470, 355);
            text(nshark, 470, 405);  
        }  
    }
    //this is needed to run the program
    public static void main(String ags[]) {
        PApplet.main(new String[]{DONThitTheSharks.class.getName()});
    }
}