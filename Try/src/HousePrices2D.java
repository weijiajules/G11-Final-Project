import hsa.*;

//change name of class here
public class HousePrices2D{

    public static Console c;
    
    public static void main(String args[])
    {
        c = new Console();
        double prices [][]= new double [2][4];
        // toronto houses prices
        prices[0][0]= 750000;
        prices[0][1]= 550000;
        prices[0][2]= 375000;
        prices[0][3]= 350000;
        
        // barrie houses prices
        prices[1][0]= 400000;
        prices[1][1]= 275000;
        prices[1][2]= 205000;
        prices[1][3]= 175000;
        
        double avgtor=0;
        double avgbar=0;
        
        for (int i = 0; i < prices.length; i++) { // vertacal list 
               for (int j = 0; j < prices[i].length; j++) { // horazontal list
                if(i==0){
                    // in toronto
                    avgtor+=prices[i][j];
                }
                else{
                    // in barie
                    avgbar+=prices[i][j];
                }
            }
        }
        avgtor/=4;
        avgbar/=4;
        c.println("toronto average price is "+avgtor);
        c.println("barrie avwerfe pruce is "+avgbar);
    }}
