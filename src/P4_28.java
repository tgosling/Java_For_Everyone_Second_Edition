/**    File: P4_28.java
 *  Purpose: Convert U.S. Dollar values to Japanese Yen; Convert Japanese Yen to U.S. Dollar:
 *           Use 0 as the sentinel value to denote end of input;
 *    Coder: Tyler Gosling
 *     Date: 05/28/2020
 */
import java.util.Scanner;

public class P4_28 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter value for on USD to JPY: ");
        double usaJpyExc_Rate = in.nextDouble();
        System.out.print("USD: ");
        while(in.hasNextDouble()){
            double usDol = in.nextDouble();
            if(usDol == 0)
                break;
            System.out.printf("Japanese Yen: %,f", (usDol * usaJpyExc_Rate));
            System.out.print("USD: ");
        }
        System.out.print("JPY: ");
        while(in.hasNextDouble()){
            double jpYen = in.nextDouble();
            if(jpYen == 0)
                break;
            System.out.printf("US $: %,f", (jpYen * usaJpyExc_Rate));
        }
    }
}
