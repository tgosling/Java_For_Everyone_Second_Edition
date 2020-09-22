

public class P9_09EmployeeDemo {
    public static void main(String[] args){
        P9_09Employee emp1 = new P9_09Employee("Tyler Gosling", 12, 55000);
        P9_09Employee emp2 = new P9_09Employee("Jayna Quigley", 42, 75000);
        P9_09Manager mngr1 = new P9_09Manager("Oscar Meyer", 69, 125000, "Deli");
        P9_09Manager mngr2 = new P9_09Manager("Jon Febeuder", 75, 100000, "Clerks");


        System.out.println("Employees:");
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println("Managers:");
        System.out.println(mngr1);
        System.out.println(mngr2);
    }
}
