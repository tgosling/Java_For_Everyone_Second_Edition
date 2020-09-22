public class P9_09Manager extends P9_09Employee {
    protected String department;

    public P9_09Manager(String n, int id, double s,  String d){
        super(n, id, s);
        this.department = d;
    }

    public String getDepartment(){
        return this.department;
    }

    public String toString(){
        return  String.format("%d) %s\n%s\n$%f", this.empID, this.name, this.department, this.salary);

    }
}
