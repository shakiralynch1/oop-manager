package dkit.sd2;

import java.util.ArrayList;

/**
 * // October 2021
 * Demonstrates INHERITANCE
 * Manager class inherits from (extends) Employee class.
 */
public class App {
    public static void main(String[] args) {
        System.out.println("\n*** Inheritance Demo - Employee & Manager ***");
        App app = new App();
        app.start();
    }

    public void start() {
        Employee emp1 = new Employee("John Brady", 35, 123.45);
        Employee emp2 = new Employee("Mary Ryan", 20, 198.45);
        Employee emp3 = new Employee("Alice Reilly");

        Manager m1 = new Manager("Bob", 40, 123.5, 300);
        Manager m2 = new Manager("Martin", 35, 113.5, 200);

        System.out.println("m1 salary = " + m1.getSalary());

        // toString() test
        System.out.println("\ntoString() Test:");
        System.out.println(emp1);
        System.out.println(m1);
        System.out.println("\n\n");

        // An ArrayList of type Employee can store references to both Employee objects
        // and Manager objects, because a Manager is a "type-of" Employee.

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(m1);
        employees.add(m2);

//      Employee emp10 = null;
//      employees.add(emp10);       // what happens?

//      TODO#1 Write code to output all details from the arrayList (using toString())
        System.out.println("\nDetails from arraylist:");

//      TODO#2 Write code to display only the salaries of all employees (including Managers)
        System.out.println("\nAll salaries:");

//      TODO#3 Examine the following code

//        Employee e1 = m1;  // Is this OK - why or why not?
//
//        Manager m1  = e1;  // Is this OK - why or why not?

//        Dynamic type & declared type of an Object reference

//        TODO#4 Consider testing to see if two objects are equal

//        TODO#5 Output only the Managers  (use toString() )

//        TODO#6 Output only the Employees (use toString() )

//        TODO#5  Output only the name and bonus for all Managers (but not Employees)

    }
}
