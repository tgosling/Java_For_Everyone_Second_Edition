import java.awt.Point;

public class P9_13LabelPoint {
    private Point pos;
    private String label;

    public P9_13LabelPoint(Point p, String str){
        pos = new Point();
        this.pos.setLocation(p.x, p.y);
        this.label = str;
    }

    public String toString(){
        return String.format("Point[x= %d, y= %d | Label=%s]", this.pos.x, this.pos.y, this.label);
    }
}
