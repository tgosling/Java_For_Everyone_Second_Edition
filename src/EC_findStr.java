public class EC_findStr {
    public static int find_bob(String[] names){
        int hold = 0;
        for(int i = 0; i < names.length; ++i){
            hold = i;
            if(names[i] == "Bob")
                return hold;
        }
        return -1;
    }
}
