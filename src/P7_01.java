/**    File: P7_01
 *  Purpose: Open a file with the name "hello.txt"; store the message "Hello, World!"; Close File;
 *           Open same file; Read and print contents;
 *    Coder: Tyler Gosling
 *     Date: 05/05/2020
 */
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class P7_01 {
    public static void main(String[] args) throws FileNotFoundException {
        writeToFile("hello.txt");
        printFileContents("hello.txt");
    }

    public static void writeToFile(String filename) throws FileNotFoundException {
        try(PrintWriter outputFile = new PrintWriter(filename)){
            outputFile.println("Hello, World!");
        } catch(FileNotFoundException e){
            System.out.println("File not found!");
        }
    }

    public static void printFileContents(String filename){
        Scanner inputFile = new Scanner(filename);
        String contents = inputFile.nextLine();
        inputFile.close();
        System.out.println(contents);
    }
}
