import java.util.Scanner;

public class P4_02C {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Numbers: ");
        double cumulativeSum = 0;
        String sumOutput = "";

        while(in.hasNextDouble()){
            double usrInVal = in.nextDouble();
            cumulativeSum += usrInVal;
            sumOutput += String.format("%s", String.valueOf(cumulativeSum));
        }
        System.out.println(sumOutput);
        in.close();
    }
}
