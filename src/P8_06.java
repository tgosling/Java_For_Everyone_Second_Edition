import org.w3c.dom.ls.LSOutput;

public class P8_06 {
    private int INITIAL_FUEL = 0;
    private double fuel;
    private double fuelEffieciency;

    public P8_06(double fuelEffieciency){
        this.fuelEffieciency = fuelEffieciency;
        this.fuel = this.INITIAL_FUEL;
    }

    public void addGas(double amount){
        this.fuel += amount;
    }

    public void drive(double distance){
        this.fuel -= distance * this.fuelEffieciency;
    }

    public void getGasLevel(){
        System.out.println(this.fuel);
    }
}


