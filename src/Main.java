

import Model.Employee;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        System.out.println("Enter the name of the employee ");
        String name = scanner.nextLine();

        System.out.println("Enter tje last name of the employee ");
        String lastname = scanner.nextLine();

        System.out.println("Enter the DNI ");
        String dni = scanner.nextLine();

        System.out.println("And lastly, the salary: ");
        double salary = scanner.nextDouble();

        Employee employee= new Employee(name,lastname,dni,salary);

        System.out.println("Annual salary "+ employee.calculateAnnualSalary() );

        System.out.println("Enter the percentage  to upgrade  the salary ");
        double percentage = scanner.nextDouble();

        employee.calculatePercentage(percentage);

        System.out.println("The augment is "+ employee.toString());

    }
}