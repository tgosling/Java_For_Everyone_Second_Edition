import java.util.ArrayList;
import java.util.Arrays;

public class TwoSum {
    public static int[] findTwoSum(int[] list, int sum) {
        int[] holdArr = new int[2];
        ArrayList<Integer> uniqueArr = Arrays.asList(list);
        //try to see if pair exists
        if(list.length < 2){
            return null;
        }
        //iterate through list to check if numbers add up in any two spots
        for(int i = 0; i < list.length - 1; ++i){
            for(int j = i + 1; j < list.length; ++j){
                if(list[i] + list[j] == sum){
                    holdArr[0] = i;
                    holdArr[1] = j;
                    return holdArr;
                }
            }
        }

        //exhausted all pairs
        return null;
    }

    public static void main(String[] args) {
        int[] indices = findTwoSum(new int[] { 3, 1, 5, 7, 5, 9 }, 10);
        if(indices != null) {
            System.out.println(indices[0] + " " + indices[1]);
        }
    }
}
