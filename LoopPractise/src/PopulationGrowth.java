import hsa.Console;



public class PopulationGrowth {
    
    
    
    public static void  main (String[] args)
    {
        Console c= new Console ();
        int year =2019;
        int population=160000;
        
        while (population <= 320000)
        {
            c.println (String.format ("In the year %d, population = %d,",year,population));
            year+=10;
            population += population*0.03;
            
        }
        c.println("Popuation will double by the year " + year);
        c.println("at that time the population will be " + population);

        
    }
    
    
    
    
}
