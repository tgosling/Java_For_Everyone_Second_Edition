public class P9_12LabelPoint {
    private int x;
    private int y;
    private String label;

    public P9_12LabelPoint(int x, int y, String str){
        this.x = x;
        this.y = y;
        this.label = str;
    }

    public String toString(){
        return String.format("Point [x= %d, y= %d | label= %s]", this.x, this.y, this.label);
    }
}
