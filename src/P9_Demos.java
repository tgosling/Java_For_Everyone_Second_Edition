import java.awt.*;

public class P9_Demos {
    public static void main(String[] args){
        //P9 Demo Variables
        P9_12LabelPoint pos1 = new P9_12LabelPoint(12, 14, "McDonald's");
        Point p = new Point(82,69);
        P9_13LabelPoint pos2 = new P9_13LabelPoint(p, "Wendy's");
        P9_15PersonAverage[] persons = new P9_15PersonAverage[]{
                new P9_15PersonAverage("Oscar", 72.5),
                new P9_15PersonAverage("Oscar", 199.5),
                new P9_15PersonAverage("Oscar", 145.5),
                new P9_15PersonAverage("Oscar", 175.5),
                new P9_15PersonAverage("Oscar", 105.5)
        };
        P9_15PersonAverage pA = new P9_15PersonAverage("oscar", 34);
        double avg = pA.averageHeight(persons);
        //P9 Demo Tests
        System.out.println("Chapter 9 Demos\n");
        System.out.println(pos1);
        System.out.println(pos2);
        System.out.printf("The average height of persons in array = %f", avg);
    }
}
