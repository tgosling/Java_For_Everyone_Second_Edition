import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class P7_04 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner in = new Scanner(System.in);
        System.out.print("Read from file name: ");
        String inFileName = in.next();
        in.close();

        Scanner inFile = new Scanner(new File(inFileName));


    }
}
