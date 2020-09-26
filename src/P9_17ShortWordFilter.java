import java.util.ArrayList;

public class P9_17ShortWordFilter implements P9_17Filter {
    public boolean accept(Object x){
        return x.toString().length() < 5;
    }


}
