import java.util.Scanner;

public class P4_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Number: ");
        double usrInputNum = in.nextDouble();
        double smallVal = usrInputNum;
        double largVal = usrInputNum;
        System.out.print("Number: ");

        while(in.hasNextDouble()){
            System.out.println("Number: ");
            usrInputNum = in.nextDouble();
            if(usrInputNum < smallVal){
                smallVal = usrInputNum;
            } else if (usrInputNum > largVal){
                largVal = usrInputNum;
            }
        }
        System.out.println("Smallest Number " + smallVal);
        System.out.println("Largest Number: " + largVal);
        in.close();
    }
}
