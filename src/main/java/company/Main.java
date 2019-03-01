package company;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<Person> employees = createEmployeesList();
        System.out.println("------------------- PRINTING EMPLOYEES --------------------");
        printEmployees(employees);
        System.out.println("------------------- PRINTING MANAGERS --------------------");
        printManagers(employees);
        System.out.println("------------------- PRINTING EMPLOYERS WITH SALARY OVER 3000 --------------------");
        printEmployeesWithSalaryOverX(employees);
        System.out.println("------------------- PRINTING MANAGERS AND THEIR EMPLOYEES --------------------");
        printAllManagersAndTheirEmployees(employees);
    }


    private static List<Person> createEmployeesList() {
        List<Person> personList = new ArrayList<>();
        personList.add(new Employee("Marek", 1500));
        personList.add(new Employee("Grzes", 3000));
        personList.add(new Employee("Marta", 2000));
        personList.add(new Manager("Czarek", 5000, personList));
        personList.add(new Employee("Lutek", 2000));
        personList.add(new Employee("stasiek", 1500));
        personList.add(new Manager("Marek", 8000, personList));

        return personList;
    }

    private static void printEmployees(List<Person> worker) {
        worker.stream().filter(c -> c instanceof Employee).forEach(c -> System.out.println(c.getName()));
    }

    private static void printManagers(List<Person> manager) {
        manager.stream().filter(c -> c instanceof Manager).forEach(c -> System.out.println(c.getName()));
    }

    private static void printEmployeesWithSalaryOverX(List<Person> employers) {
        employers.stream().filter(c -> c instanceof Employee).filter(c -> ((Employee) c).salary >= 3000)
                .forEach(c -> System.out.println(c.getName()));
    }

    private static void printAllManagersAndTheirEmployees(List<Person> people) {
        people.stream().filter(c -> c instanceof Manager)
                .forEach(c -> System.out.println("Manager " + c.getName() + " have employees " +
                        ((Manager) c).employeeList.toString()));
    }


}
