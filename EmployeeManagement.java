
import java.util.ArrayList;
import java.util.Scanner;

class Employee {

    int empID;
    String empName;
    int salary;
}

public class EmployeeManagement {

    static void addEmployee(Scanner sc, ArrayList<Employee> Employees) {
        Employee e = new Employee();

        System.out.println("Enter employee ID: ");
        e.empID = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter employee name: ");
        e.empName = sc.nextLine();

        System.out.println("Enter employee salary: ");
        e.salary = sc.nextInt();

        Employees.add(e);

        System.out.println("Employees Added Successfully!!!");

    }

    static void displayEmployee(ArrayList<Employee> Employees) {

        if (Employees.isEmpty()) {
            System.out.println("No Employee to Display");
            return;
        }

        System.out.println("Employee Details");

        for (Employee em : Employees) {
            System.out.println("----------------");
            System.out.println("Employee ID: " + em.empID);
            System.out.println("Employee Name: " + em.empName);
            System.out.println("Employee Salary: " + em.salary);
        }
    }

    static void searchEmployee(Scanner sc, ArrayList<Employee> Employees) {
        System.out.println("Enter ID to search: ");
        int SearchID = sc.nextInt();

        boolean found = false;

        for (Employee em : Employees) {
            if (SearchID == em.empID) {
                System.out.println("Emploee Found");
                System.out.println("Employee ID: " + em.empID);
                System.out.println("Employee Name: " + em.empName);
                System.out.println("Employee Salary: " + em.salary);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee did not exist");
        }
    }

    public static void main(String[] args) {
        ArrayList<Employee> Employees = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int choice = 0;

        do {
            System.out.println("-----MENU-----");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employee");
            System.out.println("3. Search Employee");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addEmployee(sc, Employees);
                    break;

                case 2:
                    displayEmployee(Employees);
                    break;

                case 3:
                    searchEmployee(sc, Employees);
                    break;

                case 4:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Enter Valid Number!!!");
            }
        } while (choice != 4);

    }
}
