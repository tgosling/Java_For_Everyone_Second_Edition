import java.util.Arrays;

public class EC_sevenBoom {
    public static String sevenBoom(int[] arr){
        if(Arrays.toString(arr).contains("7"))
            return String.format("Boom! There is a 7 in the array");
        else
            return String.format("There is no 7 in the array.");
    }
}
