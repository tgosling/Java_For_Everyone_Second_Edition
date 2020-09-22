public class P9_09Employee {
    protected String name;
    protected double salary;
    protected int empID;

    public P9_09Employee(String n, int id, double s){
        this.name = n;
        this.empID = id;
        this.salary = s;
    }

    private String getName(){
        return this.name;
    }

    public double getSalary(){
        return this.salary;
    }

    public int getEmpID(){
        return this.empID;
    }

    public String toString(){
        return  String.format("%d) %s\n$%f", this.empID, this.name, this.salary);
    }
}
