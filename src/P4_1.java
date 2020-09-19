/**
 *     File:
 *  Purpose:
 *    Coder:
 *     Date:
 */
import java.util.Scanner;

public class P4_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int evenNumSum = 0;
        for(int i = 0; i < 101; i += 2){
            evenNumSum += i;
        }
        System.out.printf("The sum of all even numbers between 1 and 100 inclusive: %d", evenNumSum);

        int squareNumSum = 0;
        for(int i = 1; i < 101; ++i){
            squareNumSum += i * i;
        }
        System.out.printf("Sum of numbers squared between 1 and 100: %d", squareNumSum);


        System.out.print("Range start: ");
        int startVal = in.nextInt();
        System.out.print("Range end: ");
        int endVal = in.nextInt();
        int oddNumSum = 0;

        for(int i = startVal; i <= endVal; ++i){
            if(i % 2 == 0){
                oddNumSum += i;
            }
        }
        System.out.printf("Sum of odd values between %d and %d is equal to %d", startVal, endVal, oddNumSum);
    }
}
