/**    File: P4_31.java
 *  Purpose:
 *    Coder: Tyler Gosling
 *     Date: 05/28/2020
 */

public class P5_1 {
    public static double smallest(double x, double y, double z){
        return ((x <= y && x < z) || ( x < y && x<=x)) ?x : (y < x && y < z)? y : z;
    }

    public static double average(double x, double y, double z){
        return (x + y + z)/3;
    }

    //P5_3.A
    public static int firstDigit(int n){
        char hold = Integer.toString(n).charAt(0);
        return Character.getNumericValue(hold);
    }

    public static int lastDigit(int n){
        return n % 10;
    }

    public static int digits(int n){
        return Integer.toString(n).length();
    }

    public static String middle(String s){
        String output = "";
        int sMid = s.length() / 2;
        if(s.length() % 2 == 0){
            output = s.substring(sMid - 1, sMid+1);
        } else {
            output = s.substring(sMid, sMid + 1);
        }
        return output;
    }

    public static String scramble(String s){
        if(s.length() > 3){
            int pos1 = (int) (Math.random() * (s.length() - 3)) + 1;
            int pos2 = (int)(Math.random() * (s.length() - pos1 - 2) + pos1 + 1);

            if(pos2 >= s.length() - 1){
                System.out.println(pos1 + " " + pos2);
                System.exit(0);
            }
            return s.substring(0, pos1) + s.charAt(pos2) + s.substring(pos1 + 1, pos2)
                    + s.charAt(pos1) + s.substring(pos2 + 1);
        } else {
            return s;
        }
    }

    public static void main(String[] args){
        int num = 1789;
        String s1 = "Banana", s2 = "Bananas";
        System.out.printf("First digit in %d is %d", num, firstDigit(num));
        System.out.printf("\nLast digit in %d is %d", num, lastDigit(num));
        System.out.printf("\nNumber of digits in %d is %d", num, digits(num));


    }
}
