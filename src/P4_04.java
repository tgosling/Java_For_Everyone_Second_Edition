import java.util.Scanner;

public class P4_04 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        double maxTemp = 0;
        int highTempMnth = 1;
        for(int i = 1; i <= 12; ++i){
            System.out.printf("Month %d: ", i);
            double usrTemp = in.nextDouble();
            if(usrTemp > maxTemp){
                highTempMnth = i;
                maxTemp = usrTemp;
            }
        }

        in.close();
        String maxTempMnth = "";
        switch(highTempMnth){
            case 1:
               maxTempMnth = "January";
               break;
            case 2:
                maxTempMnth = "February";
                break;
            case 3:
                maxTempMnth = "March";
                break;
            case 4:
                maxTempMnth = "April";
                break;
            case 5:
                maxTempMnth = "May";
                break;
            case 6:
                maxTempMnth = "June";
                break;
            case 7:
                maxTempMnth = "July";
                break;
            case 8:
                maxTempMnth = "August";
                break;
            case 9:
                maxTempMnth = "September";
                break;
            case 10:
                maxTempMnth = "October";
                break;
            case 11:
                maxTempMnth = "November";
                break;
            case 12:
                maxTempMnth = "December";
                break;
        }

        System.out.printf("Max Temp Month: %s \nMax Temperature: %f", maxTempMnth, maxTemp);
    }
}
