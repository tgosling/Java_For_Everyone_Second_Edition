import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Total {
    public static void main(String[] args) throws FileNotFoundException {
        //Prompt for the input and output filenames
        Scanner console = new Scanner(System.in);
        System.out.print("Input File: ");
        String inputFileName = console.next();
        System.out.print("Output file: ");
        String outputFileName = console.next();

        //Construct the Scanner and PrintWriter objects for reading and writing
        File inputFile = new File(inputFileName);
        Scanner in = new Scanner(inputFile);
        PrintWriter out = new PrintWriter(outputFileName);

        //Read the input and output
        double total = 0;

        while(in.hasNextDouble()){
            double value = in.nextDouble();
            out.printf("%15.2f\n", value);
            total += value;
        }

        out.printf("Total = %8.2f\n", total);

        in.close();
        out.close();
    }
}
