import java.util.Scanner;

public class P4_05 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Numbers: ");
        boolean firstVal = true;
        double minVal = 0;
        double maxVal = 0;
        double numSum = 0;
        int numTotal = 0;

        while(in.hasNextDouble()){
            System.out.print("Next value: ");
            double usrInput = in.nextDouble();
            ++numTotal;
            numSum += usrInput;
            if(firstVal){
                minVal = usrInput;
                maxVal = usrInput;
                firstVal = false;
            } else {
                if(usrInput < minVal){
                    minVal = usrInput;
                } else if(usrInput > maxVal){
                    maxVal = usrInput;
                }
            }
        }

        double numAvg = numSum / numTotal;
        double numDiff = Math.abs(maxVal - minVal);
        System.out.printf("Average: %f \nMin. Value: %f \nMax. Value: %f \nDifference: %f", numAvg, minVal, maxVal, numDiff);
        in.close();
    }
}
