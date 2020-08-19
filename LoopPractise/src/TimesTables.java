import hsa.Console;

public class TimesTables {

    public static void main(String[] args) {
        Console c = new Console();
        
        for(int x=1; x<=12; x++){
            for(int y=1; y<=12; y++){
               c.print(x*y,4);
            }
            c.println("");
        }
        
    }
    
}
