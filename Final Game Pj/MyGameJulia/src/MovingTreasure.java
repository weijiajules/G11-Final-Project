
import processing.core.PApplet;
import processing.core.PImage;


public class MovingTreasure extends Hitbox {

    
    
    
    public MovingTreasure(PApplet pa, PImage img, int xp, int yp) {
        super(pa, img, xp, yp);
        ydir = 5;
        
    }

    public void move() {
        y += ydir;
        if (hitWall() == 'b') {
            ydir = -5;
        }
        if (hitWall() == 't') {
            ydir = 5;
        }
    }
    
}
