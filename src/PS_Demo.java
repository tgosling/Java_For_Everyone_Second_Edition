import java.util.Scanner;

public class PS_Demo {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);


        System.out.println("Playstation Trophy Tracker");
        System.out.print("Enter PlayStation Gamer Tag: ");
        String gamerTag = in.nextLine();
        System.out.print("Enter PlayStation Trophy Level: ");
        int psTrphyLvl = in.nextInt();

        PS_Player psPlyr = new PS_Player(psTrphyLvl, gamerTag);

        boolean flag = true;
        while(flag){
            //add trophy
            System.out.print("Enter Trophy Level:\n1) Bronze\n2) Silver\n3) Gold\nPlatinum");
            int trophyType = in.nextInt();

            if(trophyType == 1){

            }
        }
    }
}
