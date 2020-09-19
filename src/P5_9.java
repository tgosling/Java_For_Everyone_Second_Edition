public class P5_9 {

    public static void main(String[] args){

        double sphereRad = 170;
        double cylRad = 80, cylHeight = 22;
        double coneRad = 26, coneHeight = 8;

        System.out.println("Sphere Radius = " + sphereRad);
        System.out.printf("The volume of the sphere = %f\n", sphereVolume(sphereRad));
        System.out.printf("The surface area of the sphere = %f\n", sphereSurface(sphereRad));
        System.out.printf("Cylinder radius = %f \tCylinder height = %f\n", cylRad, cylHeight);
        System.out.printf("Cylinder Volume = %f \tCylinder Surface = %f\n", cylinderVolume(cylRad, cylHeight) ,cylinderSurface(cylRad, cylHeight));
        System.out.printf("Cone radius = %f \tCone Radius = %f\n", coneRad, coneHeight);
        System.out.printf("Cone volume = %f \tCone Surface = %f\n", coneVolume(coneRad, coneHeight), coneSurface(coneRad, coneHeight));
    }

    public static double sphereVolume(double r){
        return (4.0/3.0) * Math.PI * Math.pow(r, 3);
    }

    public static double sphereSurface(double r){
        return 4* Math.PI * Math.pow(r, 2);
    }

    public static double cylinderVolume(double r, double h){
        return Math.PI * (r*r) * h;
    }

    public static double cylinderSurface(double r, double h){
        return 2 * Math.PI * r * h + 2 * Math.PI * (r*r);
    }

    public static double coneVolume(double r, double h){
        return Math.PI * (r*r) * (h/3);
    }

    public static double coneSurface(double r, double h){
        return Math.PI*r*(r + Math.sqrt(h*h) + Math.sqrt(r*r));
    }
}
