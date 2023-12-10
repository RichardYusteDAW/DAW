package examenIA1;

import java.util.ArrayList;
import java.util.List;

public class CompanyRegistry {
    private static CompanyRegistry instance;
    private List<Employee> employees = new ArrayList<>();

    private CompanyRegistry() {
    }

    public static CompanyRegistry getInstance() {
        if (instance == null) {
            instance = new CompanyRegistry();
        }

        return instance;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        int position = employees.indexOf(employee);
        employees.remove(position);
    }

    public void getEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}