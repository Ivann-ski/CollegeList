/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author jhnnn
 */
import java.util.Scanner;
public class CollegeList {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Press E for Employee, F for Faculty, or S for Student: ");
        String choice = scanner.nextLine().toUpperCase();

        Person person = null;

        switch (choice) {
            case "E":
                person = new Employee();
                System.out.println("Type employee's name, contact number, salary, and department.");
                System.out.print("Name: ");
                person.setName(scanner.nextLine());
                System.out.print("Contact Number: ");
                person.setContactNumber(scanner.nextLine());
                System.out.print("Salary: ");
                ((Employee) person).setSalary(Double.parseDouble(scanner.nextLine()));
                System.out.print("Department: ");
                ((Employee) person).setDepartment(scanner.nextLine());
                break;

            case "F":
                person = new Faculty();
                System.out.println("Type faculty's name, contact number, salary, department, and status.");
                System.out.print("Name: ");
                person.setName(scanner.nextLine());
                System.out.print("Contact Number: ");
                person.setContactNumber(scanner.nextLine());
                System.out.print("Salary: ");
                ((Faculty) person).setSalary(Double.parseDouble(scanner.nextLine()));
                System.out.print("Department: ");
                ((Faculty) person).setDepartment(scanner.nextLine());
                System.out.print("Is regular (Y/N)? ");
                ((Faculty) person).setRegular(scanner.nextLine().equalsIgnoreCase("Y"));
                break;

            case "S":
                person = new Student();
                System.out.println("Type student's name, contact number, program, and year level.");
                System.out.print("Name: ");
                person.setName(scanner.nextLine());
                System.out.print("Contact Number: ");
                person.setContactNumber(scanner.nextLine());
                System.out.print("Program: ");
                ((Student) person).setProgram(scanner.nextLine());

                // Year level input validation
                int yearLevel;
                while (true) {
                    System.out.print("Year Level (1-4): ");
                    yearLevel = Integer.parseInt(scanner.nextLine());
                    if (yearLevel >= 1 && yearLevel <= 4) {
                        ((Student) person).setYearLevel(yearLevel);
                        break; // valid input, exit loop
                    } else {
                        System.out.println("Invalid year level. Please enter a number between 1 and 4.");
                    }
                }
                break;

            default:
                System.out.println("Invalid choice.");
                return;
        }

        System.out.println("------------------------------");

        if (person instanceof Employee) {
            Employee employee = (Employee) person;
            System.out.println("Name: " + employee.getName());
            System.out.println("Contact Number: " + employee.getContactNumber());
            System.out.println("Salary: " + employee.getSalary());
            System.out.println("Department: " + employee.getDepartment());
        } else if (person instanceof Faculty) {
            Faculty faculty = (Faculty) person;
            System.out.println("Name: " + faculty.getName());
            System.out.println("Contact Number: " + faculty.getContactNumber());
            System.out.println("Salary: " + faculty.getSalary());
            System.out.println("Department: " + faculty.getDepartment());
            System.out.println("Status: " + (faculty.isRegular() ? "Regular" : "Not Regular"));
        } else if (person instanceof Student) {
            Student student = (Student) person;
            System.out.println("Name: " + student.getName());
            System.out.println("Contact Number: " + student.getContactNumber());
            System.out.println("Program: " + student.getProgram());
            System.out.println("Year Level: " + student.getYearLevel());
        }
    }
}
