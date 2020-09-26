public class EC_ShapeSwitch {
    public static String nSidedShape(int n){
        String hold = "";
        switch(n){
            case 1:
                hold = "circle";
                break;
            case 2:
                hold = "semi-circle";
                break;
            case 3:
                hold = "triangle";
                break;
            case 4:
                hold = "square";
                break;
            case 5:
                hold = "pentagon";
                break;
            case 6:
                hold = "hexagon";
                break;
            case 7:
                hold = "heptagon";
                break;
            case 8:
                hold = "octagon";
                break;
            case 9:
                hold = "nonagon";
                break;
            case 10:
                hold = "decagon";
                break;
        }
        return hold;
    }
}
