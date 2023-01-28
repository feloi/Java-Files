import employee.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.printf("Name: ");
        employee.name = sc.nextLine();
        System.out.printf("Gross salary: ");
        employee.salary = sc.nextDouble();
        System.out.printf("Tax: ");
        employee.tax = sc.nextDouble();

        System.out.println("Employee: " + employee);

        System.out.printf("Which percentage to increase salary? ");
        employee.percentage = sc.nextDouble();
        employee.IncreaseSalary(employee.percentage);
        System.out.println();

        System.out.println("Updated data: " + employee);


        sc.close();

    }

}
