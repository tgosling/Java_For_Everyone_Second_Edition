public class Casting {
    public static void main(String[]args) {
        /**Narrowing type casting(explicit): Manually convert a higher data type to a lower one
         * i.e. double to int. There is a loss in data so the conversion is not automatic       */
        // double to int
        double doubleNum = 19.97;
        System.out.println("The double value: " + doubleNum);
        // Need explicit casting because the double, doubleNum, cannot automatically fit into the int, intNum
        int intNum = (int) doubleNum;
        System.out.println("The int value: " + intNum);
        /**Widening type casting (implicit): Java automatically converts a lower data type to a
         * higher one i.e. int to double. There is no data loss */
        // int to double
        int intNum1 = 19;
        System.out.println("The int value: " + intNum1);
        // No need for explicit casting because the int, intNum, can automatically fit into the double, doubleNum
        double doubleNum1 = intNum1;
        System.out.println("The double value: " + doubleNum1);
        /**A string that holds an integer value can be converted to an int using the
         * Integer class method .parseInt()        */
        // String to int
        String s = "12";
        System.out.println("The string value: " + s);
        int intNum2 = Integer.parseInt(s);
        System.out.println("The int value: " + intNum2);
        /**  An int calue can be converted to a string using the String class method .valuOf() */
        // String to int
        int intNum3 = 12;
        System.out.println("The int value: " + intNum3);
        String s1 = String.valueOf(intNum);
        System.out.println("The String value: " + s1);
    }
}
