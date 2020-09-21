import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 * This program encrypts a file using a Casear Cipher
 */

public class CasearCipher {
    public static void main(String[] args) throws FileNotFoundException{
        final int DEFAULT_KEY = 3;
        int key = DEFAULT_KEY;
        String inFile = "";
        String outFile = "";
        int files = 0;

        for(int i = 0; i < args.length; ++i){
            String arg = args[i];
            if(arg.charAt(0) == '-'){
                //it is a command line option
                char option = arg.charAt(1);
                if(option == 'd')
                    key -= key;
                else{
                    usage();
                    return;
                }
            } else {
                //it is a filename
                files++;
                if(files == 1)
                    inFile = arg;
                else if(files == 2)
                    outFile = arg;
            }
        }
        if(files != 2){
            usage();
            return;
        }

        Scanner in = new Scanner(new File(inFile));
        in.useDelimiter(""); //process individual chararcters
        PrintWriter out = new PrintWriter(outFile);

        while(in.hasNext()){
            char from = in.next().charAt(0);
            char to = encrypt(from, key);
            out.print(to);
        }
        in.close();
        out.close();
    }

    /**Encrypts upper- and lowercase characters by shifting them according to a key;
     * @param ch the letter to be encrypted
     * @param key the encryption key
     * @return the encrypted letter
     */
    public static char encrypt(char ch, int key){
        int base = 0;
        if('A' <= ch && ch <= 'Z')
            base = 'A';
        else if('a' <= ch && ch <= 'z')
            base = 'a';
        else
            return ch; //not a letter
        int offset = ch - base + key;
        final int LETTERS = 26;
        if(offset > LETTERS)
            offset -= LETTERS;
        else if(offset < 0)
            offset += LETTERS;
        return (char)(base + offset);
    }

    /**
     * Prints a message describing proper usage
     */
    public static void usage(){
        System.out.println("Usage: java CaesarCipher [-d] infile outfile" );
    }
}
