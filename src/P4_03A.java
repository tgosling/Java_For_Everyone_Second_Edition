import java.util.Scanner;

public class P4_03A {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a word or sentence: ");
        String usrInput = in.nextLine();
        //4.03A
        String capLtrs = "";
        for(int i = 0; i < usrInput.length(); ++i){
            char hold = usrInput.charAt(i);
            if(Character.isUpperCase(hold)){
                capLtrs += " " + hold;
            }
        }
        //4.03B
        String oddLtrs = "";
        for(int i = 0; i < usrInput.length(); i+=2){
            oddLtrs += usrInput.charAt(i);
        }

        //4.03C
        String underScr = usrInput;

        for(int i = 0; i < usrInput.length(); ++i){
            char curLtr = usrInput.charAt(i);
            char hold = Character.toLowerCase(curLtr);
            if(hold == 'a' || hold == 'e' || hold == 'i' || hold == 'o' || hold == 'u'){
                StringBuilder modStr = new StringBuilder(underScr);
                modStr.setCharAt(i, '_');
                underScr = modStr.toString();
            }
        }

        System.out.println(capLtrs);
        System.out.println(oddLtrs);
        System.out.println(underScr);
    }
}
