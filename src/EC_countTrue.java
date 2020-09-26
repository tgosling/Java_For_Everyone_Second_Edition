public class EC_countTrue {
    public static int countTrue(boolean[] arr){
        int hold = 0;
        for(boolean b : arr){
            if(b == true)
                ++hold;
        }
        return hold;
    }
}
