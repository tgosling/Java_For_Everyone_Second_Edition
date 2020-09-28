public class RemoveRepetitions {
    public static String transform(String input) {
        //variables
        //used to test against null at first
        char hold = '\0';
        StringBuilder sbHold = new StringBuilder();
        //test for empty
        if(input.length() == 0){
            return null;
        }
        //iterate through string
        for(int i = 0; i < input.length(); i++){
            //add to string if different character
            if(input.charAt(i) != hold){
                sbHold.append(input.charAt(i));
                hold = input.charAt(i);
            }
        }

        return sbHold.toString();
    }

    public static void main(String[] args) {
        System.out.println(RemoveRepetitions.transform("abbcbbb"));
    }
}
