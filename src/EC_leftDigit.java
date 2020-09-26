import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EC_leftDigit {
    public static int leftDigit(String str){
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(str);
        while(m.find()){
            return Integer.parseInt(m.group());
        }
        return -1;

        //return Integer.valueOf(str.replaceAll("\\D+", "").substring(0,1));
    }
}
