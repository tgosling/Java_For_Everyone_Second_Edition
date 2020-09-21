public class P8_01 {
    private int value;

    public int getValue(){
        return value;
    }

    public void count(){
        ++value;
    }

    public void reset(){
        value = 0;
    }

    public void undo(){
        value -= 1;
    }

}
