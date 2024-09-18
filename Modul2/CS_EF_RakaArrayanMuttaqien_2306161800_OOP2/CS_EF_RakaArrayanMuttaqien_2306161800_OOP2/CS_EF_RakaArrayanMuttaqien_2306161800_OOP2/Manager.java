package CS_EF_RakaArrayanMuttaqien_2306161800_OOP2;

// import java.util.ArrayList;
// import java.util.List;
// import java.util.ArrayList;
// import java.util.List;
import java.util.*;

public class Manager extends Person {
    private List<Employee> employees;

    public Manager(String name, int id) {
        super(name, id);
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void assignTask(Employee employee, String task) {
        if (employees.contains(employee)) {
            employee.receiveTask(task);
        } else {
            System.out.println("Employee not managed by this manager.");
        }
    }

    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("ID: " + getId());
        System.out.println("Employees Managed:");

        for (Employee daftar : employees) {
            System.out.println("- " + daftar.getName());
        }
    }
}

