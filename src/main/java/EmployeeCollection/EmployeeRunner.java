package EmployeeCollection;

import java.util.*;

public class EmployeeRunner {

    static List<Employee> employees = new ArrayList<>();
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
                    generateEmployees();
                    break;
                case 3 :
                    printEmployee();
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
        System.out.println("Press 2 to add random employees");
        System.out.println("Press 3 to print a list of all employees");
        System.out.println("Press 4 to print a list of employees who work more then x years");
        System.out.println("Press 5 to delete each odd employee");
        System.out.println("Press 0 to exit the program");
        System.out.println("**********************************");

    }

    private static void addEmployee(Collection<Employee> employees) {
        System.out.println("Enter the name: ");
        String name = "";
        while (name.equals("")){
            name = input.readText();
        }
        System.out.println("Enter the surname:");
        String surname = "";
        while (surname.equals("")){
            surname = input.readText();
        }
        System.out.println("Enter the enrollment date as DD-MM-YYYY:");
        String date= new ReadInput().readText();
        int[] dateOfEnrollment = new int[3];
        try {
            dateOfEnrollment[0] = Integer.parseInt(date.substring(0,2));
            dateOfEnrollment[1] = Integer.parseInt(date.substring(3,5));
            dateOfEnrollment[2] = Integer.parseInt(date.substring(6));
        }
        catch (NumberFormatException exception){
            System.out.println("Incorrect date format. Employee wasn't added.");
        }
        employees.add(new Employee(name, surname,dateOfEnrollment[0], dateOfEnrollment[1], dateOfEnrollment[2]));
    }

    private static void generateEmployees() {
        System.out.println("Enter the number of employees: ");
        Random random = new Random();
        int amount = input.readNumber();
        for (int i = 1; i <= amount; i++) {
            employees.add(new Employee("name" + i, "surname" + i,
                    random.nextInt(27) + 1, random.nextInt(11) + 1,
                    random.nextInt(2021 - 1990) + 1990));
        }
    }

    private static void printEmployee() {
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }

    public static void printEmployeeWithExperience(){
        System.out.println("Enter minimal experience value: ");
        int years = new ReadInput().readNumber();
        Iterator<Employee> employeeIterator = employees.iterator();
        while (employeeIterator.hasNext()) {
            Employee employee = employeeIterator.next();
            if (employee.getExperience() >= years){
                System.out.println(employee.printExperience());
            }
        }
    }

    private static void deleteEmployees() {
        ListIterator<Employee> iterator = employees.listIterator();
        int counter = employees.size();
        while (iterator.hasNext()){
            iterator.next();
        }
        while (iterator.hasPrevious()){
            iterator.previous();
            if (counter % 2 == 1){
                iterator.remove();
            }
            counter--;
        }
        System.out.println("List of employees after removal:");
        printEmployee();
    }
}
