class InheritPoly_Noodle {

    protected double lengthInCentimeters;
    protected double widthInCentimeters;
    protected String shape;
    protected String ingredients;
    protected String texture = "brittle";

    InheritPoly_Noodle(double lenInCent, double wthInCent, String shp, String ingr) {

        this.lengthInCentimeters = lenInCent;
        this.widthInCentimeters = wthInCent;
        this.shape = shp;
        this.ingredients = ingr;

    }

    public String getCookPrep() {

        return "Boil noodle for 7 minutes and add sauce.";

    }


    public static void main(String[] args) {

        InheritPoly_Noodle spaghetti, ramen, pho;

        spaghetti = new InheritPoly_Spaghetti();
        ramen = new InheritPoly_Ramen();
        pho = new InheritPoly_Pho();

        // Add your code below:
        InheritPoly_Noodle[] allTheNoodles = {spaghetti, ramen, pho};

        for(InheritPoly_Noodle n : allTheNoodles){
            System.out.println(n.getCookPrep());
        }

    }

}
