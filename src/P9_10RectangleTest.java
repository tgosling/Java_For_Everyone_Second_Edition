public class P9_10RectangleTest {
    public static void main(String[] args){
        P9_10BetterRectangle rec1 = new P9_10BetterRectangle(5, 5, 2, 2);

        System.out.printf("Length: %d, \tWidth: %d\nPerimeter: %d \tArea: %d", rec1.height, rec1.width, rec1.getPerimeter(), rec1.getArea());
    }
}
