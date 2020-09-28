import java.util.*;
import java.util.stream.*;

public class MovingTotal {
    /**
     * Adds/appends list of integers at the end of internal list.
     */
    private static ArrayList<Integer> itemStore = new ArrayList<>();
    private static ArrayList<Integer> lookupTotal;



    public void append(int[] list) {
        //append list item to itemStore
        for(int i : list){
            itemStore.add(i);
        }
    }

    /**
     * Returns boolean representing if any three consecutive integers in the
     * internal list have given total.
     */
    public boolean contains(int total) {
        //iterate through container for 3 numbers at a time
        //performance hit on for loop
        for(int i = 0; i < itemStore.size() - 2; ++i){
            if(itemStore.get(i) + itemStore.get(i+1) + itemStore.get(i+2) == total){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        MovingTotal movingTotal = new MovingTotal();

        movingTotal.append(new int[] { 1, 2, 3, 4 });

        System.out.println(movingTotal.contains(6));
        System.out.println(movingTotal.contains(9));
        System.out.println(movingTotal.contains(12));
        System.out.println(movingTotal.contains(7));

        movingTotal.append(new int[] { 5 });

        System.out.println(movingTotal.contains(6));
        System.out.println(movingTotal.contains(9));
        System.out.println(movingTotal.contains(12));
        System.out.println(movingTotal.contains(7));
    }
}
