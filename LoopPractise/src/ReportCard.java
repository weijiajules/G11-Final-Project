import hsa.Console;

public class ReportCard {
 
    public static void main(String[] args) {
      Console c = new Console();
      String subject[] = new String[4];
      int marks[] = new int[4];
      int avg=0;
      //subject has locations 0, 1, 2, 3
      //ask for 4 subject names
      for(int x = 0; x<4; x++){
          c.print("Enter subject " + (x+1) + "> ");
          subject[x] = c.readLine();
      }
      //ask for 4 marks
      for(int x = 0; x<4; x++){
          c.print("Enter the mark for " + subject[x] + "> ");
          marks[x] = c.readInt();
      }
      //print report card
      for(int x=0; x<4; x++){
          c.print(subject[x],20);
          c.println(marks[x]);
          avg += marks[x];
      }
      avg /=4;  //avg = avg / 4
      c.println("------------");
      c.println("Average: \t\t" + avg);
      
              
      
    }
    
}
