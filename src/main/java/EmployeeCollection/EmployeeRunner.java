package EmployeeCollection;

import java.util.*;

public class EmployeeRunner {

    static List<Employee> employees = new LinkedList<>();
    static ReadInput input = new ReadInput();

    public static void run() {
        while (true) {
            showMessage();
            switch (input.readNumber()){
                case 0 :
                    System.exit(0);
                    break;
                case 1 :
                    addEmployee(employees);
                    break;
                case 2 :
                    System.out.println("Enter the number of employees:\n");
                    generateEmployees();
                    break;
                case 3 :
                    System.out.println(employees.toString());
                    break;
                case 4 :
                    printEmployeeWithExperience();
                    break;
                case 5:
                    deleteEmployees();
                    break;
                default:
                    break;
            }
        }
    }

    private static void showMessage() {
        System.out.println("**********************************");
        System.out.println("Press 1 to add employee");
        System.out.println("Press 2 to create a test list of employees");
        System.out.println("Press 3 to print a list of all employees");
        System.out.println("Press 4 to print a list of employees who work more then x years");
        System.out.println("Press 5 to delete each odd employee");
        System.out.println("Press 0 to exit the program");
        System.out.println("**********************************");

    }

    private static void addEmployee(Collection<Employee> employees) {

    }

    private static void generateEmployees() {
        Random random = new Random();
        int amount = input.readNumber();
        for (int i = 1; i <= amount; i++) {
            employees.add(new Employee("name" + i, "surname" + i,
                    random.nextInt(27) + 1, random.nextInt(11) + 1, random.nextInt(2021 - 1990) + 1990));

        }
    }

    public static void printEmployeeWithExperience(){
        System.out.println("Enter minimal experience");
        int years = new ReadInput().readNumber();
        Iterator<Employee> employeeIterator = employees.iterator();
        while (employeeIterator.hasNext()) {
            Employee employee = employeeIterator.next();
            if (employee.getExperience() >= years){
                System.out.println(employee);
            }
        }
    }
    private static void deleteEmployees() {

        }
}
