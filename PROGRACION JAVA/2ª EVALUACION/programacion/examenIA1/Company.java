package examenIA1;

public class Company {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Pepe", "11111", 20, 1000);
        Employee employee2 = new Employee("Paco", "22222", 21, 2000);
        Employee employee3 = new Employee("Luis", "33333", 22, 3000);

        showInfo(employee1);
        showInfo(employee2);
        showInfo(employee3);

        employee1.setSalary(4000);
        employee3.setSalary(5000);

        showInfo(employee1);
        showInfo(employee2);
        showInfo(employee3);

        System.out.println("El salario más alto lo tiene: " + employee1.compareSalary(employee2));

        CompanyRegistry registry = CompanyRegistry.getInstance();
        registry.addEmployee(employee1);
        registry.addEmployee(employee2);
        registry.getEmployees();
        System.out.println();

        registry.removeEmployee(employee2);
        registry.getEmployees();
        System.out.println();

        registry.addEmployee(employee2);
        registry.addEmployee(employee3);
        registry.getEmployees();
    }

    public static void showInfo(Employee empleado) {
        System.out.printf("El employee %s con %s tiene %d años y un salario de %d euros.\n", empleado.getName(),
                empleado.getDni(), empleado.getAge(), empleado.getSalary());
    }
}
