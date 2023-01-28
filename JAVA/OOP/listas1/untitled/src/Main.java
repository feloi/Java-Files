import java.util.ArrayList;
import java.util.List;
import  java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = 0;

        System.out.print("How many employees will be registered? ");
        n = sc.nextInt();


        List<Employee> list = new ArrayList<>();
        System.out.println();
        for(int i = 0; i < n; i++){
            System.out.println("Employee #" + (i+1) + ":");
            System.out.printf("Id: ");
            Integer id = sc.nextInt();
            sc.nextLine();
            System.out.printf("Name: ");
            String name = sc.nextLine();
            System.out.printf("Salary: ");
            Double salary = sc.nextDouble();

            Employee emp = new Employee(id, name, salary);
            list.add(emp);
        }
        System.out.println();

        System.out.printf("Enter the employee id that will hava salary increase: ");
        int sid = sc.nextInt();

        Integer pos = position(list, sid);

        if (pos == null){
            System.out.println("This id does not exist!");
        }
        else{
            System.out.printf("Enter the percentage: ");
            double percent= sc.nextInt();
            list.get(pos).increaseSalary(percent);
        }
        System.out.println();
        System.out.println("List of employees: ");
        for(Employee emp: list){
            System.out.println(emp);
        }
        sc.close();
    }
    public static Integer position(List<Employee> list, int id){
        for(int i=0; i<list.size();i++){
            if (list.get(i).getId() == id){
                return i;
            }
        }
        return null;
    }
}
