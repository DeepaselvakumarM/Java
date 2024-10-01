abstract class Employee{
    String name;
    int employeeID;
    double salary;

    public Employee(String name,int employeeID,double salary){
        this.name=name;
        this.employeeID=employeeID;
        this.salary=salary;
    }

    public void display(){
        System.out.println(employeeID);
        System.out.println(name);
        System.out.println(salary);
    }

}

class FullTime extends Employee{
    private double bonus;
    public FullTime(String name,int employeeID,double salary,double bonus){
        super(name, employeeID, salary);
        this.bonus=bonus;
    }
     public double calculateSalary(){
        return salary+bonus;
     }
}

class PartTime extends Employee{
    private double bamount;
    public PartTime(String name,int employeeID,double salary,double bamount){
        super(name, employeeID, salary);
        this.bamount=bamount;
    }
    public double calcualte(){
        return salary+bamount;
    }

}
public class Abstract {
    public static void main(String[] args) {
        Employee f=new FullTime("Dee", 670, 7000, 100);
        Employee P=new PartTime("sudar", 870, 4500, 70);
        f.display();
        // System.out.println(f.calculateSalary());
    
    }
}
