package employee;

public class Employee {
    public String name;
    public double salary;
    public double newSalary;
    public double tax;
    public double percentage;

    public double netSalary(){
        return  salary - tax; //450
    }
    public void IncreaseSalary(double percentage){
        salary =  salary + ((salary * percentage) / 100); //4000 + 400
    }
    public String toString(){
        return name + ", $" + String.format("%.2f", netSalary());
    }
}