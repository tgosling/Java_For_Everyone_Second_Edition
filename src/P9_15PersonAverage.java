public class P9_15PersonAverage {
    private String name;
    private double height;

    public P9_15PersonAverage(String n, double h){
        this.name = n;
        this.height = h;
    }

    public double averageHeight(P9_15PersonAverage[] pa){
        double total = 0;
        for(P9_15PersonAverage person : pa)
            total += person.height;
        return total / pa.length;
    }
}
