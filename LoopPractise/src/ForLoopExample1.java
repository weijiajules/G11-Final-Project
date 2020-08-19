import hsa.Console;

public class ForLoopExample1 {

    public static void main(String[] args) {
        Console c = new Console();
        int num;
        int count=0;
      for(int x=10; x<=20; x-=2){
            count++;
            c.print("On time " + count + " thru the loop\t");
            c.println("num is now set to the value: " + x);
        }
    }
    
}
