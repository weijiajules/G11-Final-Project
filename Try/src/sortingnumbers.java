import hsa.*;
import java.util.Random;

//change name of class here
public class sortingnumbers {

    public static Console c;
    static int nums[]= new int[100];
    
    public static void main(String args[])
    {
        c = new Console();
       Random r= new Random();
       // genterate 100 randim #'s 1-1000
        for (int x = 0; x < nums.length; x++) {
            nums[x]=r.nextInt(1000)+1;
            c.print(nums[x],4);
            
        }
        c.println("\n\n Press any key to start..."); // \n\n new lines
        c.getChar(); //pause and wait for any key
        // sorting
        for (int i = 0; i < nums.length; i++) {
            int sm=findSmallest(i); // retuns an int
            swap(i,sm); // swap lac i with the smallest
            
        }
        //reprint array in  sorted array
       
        for (int i = 0; i < nums.length; i++) {
            c.print(nums[i],4);
            
        }
        
    }
    public static int findSmallest(int startloc){
        int smallest=nums[startloc];
        int smloc =startloc;
        for (int x = startloc+1; x < nums.length; x++) {
            // if we find a sammler number
            if(nums[x]<smallest){ // change the < to a > to make high to low
                smallest=nums[x];
                smloc=x;
            }   
        }
        return smloc; // return location of smallest numebr
    }
    public static void swap(int loc1, int loc2){
        int temp= nums[loc1];
        nums[loc1]= nums[loc2];
        nums[loc2]=temp;
    }
}





















