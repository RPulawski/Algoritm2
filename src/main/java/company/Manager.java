package company;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee {
    List<Person> employeeList = new ArrayList<>();


    public Manager(String name, double salary, List<Person> employeeList) {
        super(name, salary);
        this.employeeList = employeeList;
    }

    public List<Person> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Person> employeeList) {
        this.employeeList = employeeList;
    }

}
