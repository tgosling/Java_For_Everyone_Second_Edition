import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**    File: P7_03
 *  Purpose: Read a file containing text; Read each line and send it to the output file,
 *           Preceded by line numbers;
 *    Coder: Tyler Gosling
 *     Date: 05/05/2020
 */

public class P7_03 {
    static int lineNumber = 1;
    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(System.in);
        String inFileName;
        String outFileName;
        if(args.length == 2) {
            inFileName = args[0];
            outFileName = args[1];
        } else{
            System.out.print("Filename to read: ");
            inFileName = console.next();
            System.out.print("Filename to write: ");
            outFileName = console.next();
        }
        console.close();

        File inFile = new File(inFileName);
        Scanner in = new Scanner(inFile);
        PrintWriter outFile = new PrintWriter(outFileName);
        while(in.hasNextLine()){
            String line = in.nextLine();
            System.out.println(line);
            writeNumLine(line, outFile);
        }
        in.close();
        outFile.close();
    }

    public static void writeNumLine(String line, PrintWriter fileOut){
        fileOut.printf("/* %d */ %s\n", lineNumber, line);
        ++lineNumber;
    }
}
