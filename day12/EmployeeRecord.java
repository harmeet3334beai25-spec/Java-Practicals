package day12;

import java.util.Scanner;

class Employee {
    int id;
    String name;
    String department;
    double salary;

    Employee() {
        id = 0;
        name = "Default";
        department = "Default";
        salary = 0;
    }

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        id = 0;
        department = "Not Assigned";
    }

    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    void display() {
        System.out.println("ID         : " + id);
        System.out.println("Name       : " + name);
        System.out.println("Department : " + department);
        System.out.printf("Salary     : Rs. %.2f\n", salary);
    }
}

public class EmployeeRecord {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Object 1 - Default Constructor
        Employee emp1 = new Employee();

        // Object 2 - Two Parameter Constructor
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        double salary;
        do {
            System.out.print("Enter Salary: ");
            salary = sc.nextDouble();
            if (salary < 0)
                System.out.println("Salary cannot be negative.");
        } while (salary < 0);

        Employee emp2 = new Employee(name, salary);

        // Object 3 - Four Parameter Constructor
        System.out.print("\nEnter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name2 = sc.nextLine();

        System.out.print("Enter Department: ");
        String dept = sc.nextLine();

        double salary2;
        do {
            System.out.print("Enter Salary: ");
            salary2 = sc.nextDouble();
            if (salary2 < 0)
                System.out.println("Salary cannot be negative.");
        } while (salary2 < 0);

        Employee emp3 = new Employee(id, name2, dept, salary2);

        System.out.println("\nEMPLOYEE DETAILS");

        System.out.println("\nEmployee 1");
        emp1.display();

        System.out.println("\nEmployee 2");
        emp2.display();

        System.out.println("\nEmployee 3");
        emp3.display();

        sc.close();
    }
}