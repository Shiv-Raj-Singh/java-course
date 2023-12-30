/**
 * Two type of Conversion in Java we have 
 1: Widening Conversion: : (Automatic) less to more because we don't any faer to loose to data. 
 * @example 
 *  {
        int intValue = 10;
        long longValue = intValue; // Implicit conversion (int to long)
    }
2: Narrowing Conversion:: (Manual) More to less we need to do it manual else it will be throw an error
beacuse there is fear of loose data we decreasing range 
@example 
    {
        double doubleValue = 10.5;
        int intValue = (int) doubleValue; // Explicit conversion (double to int)
    }
 */

public class Conversion{
    public static void main (String a[]){
        // widening conversion :
        // Byte x = 15;
        // int y = x;
        // System.out.print("widening conversion:L: " +y);

        //  Narrowing Conversion :
        double pointValue = 8.6;
        int intValue =(int) pointValue;
        System.out.print(" Narrowing Conversion:: " +intValue); 
    }
}