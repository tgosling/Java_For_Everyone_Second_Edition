public class EC_shuffleName {
    public static String nameShuffle(String s){
        String holdFirst = s.substring(0, s.indexOf(" "));
        String holdLast = s.substring(s.indexOf(" ") + 1);
        String hold = holdLast + " " + holdFirst;
        return hold;
    }
}
