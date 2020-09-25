import java.awt.*;

public class P9_10BetterRectangle extends Rectangle {
    public P9_10BetterRectangle(int x, int y, int w, int h){
        super(x, y, w, h);
    }

    public int getPerimeter(){
        return (int) (super.getHeight() * 2 + super.getWidth() * 2);
    }

    public int getArea(){
        return (int) (super.getHeight() * super.getWidth());
    }
}
