import hsa.Console;

public class Acceleration {

    public static void main(String[] args) {
        Console c = new Console();
        double vel = 5;
        for(int x=10; x > 0; x--){
            c.print("A T-" + x + " seconds, ");
            c.println(String.format("the rock is going %.2f m/s", vel));
            vel *= 1.2;   //vel = vel + .2 * vel   vel += .2*vel
        }
        //this line inly runs once at the end of the loop
        c.println(String.format("When it hits the ground, the rock is going %.2f m/s", vel));
    }
    
}
