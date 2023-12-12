package examenIA1;

public class Employee {
    private String name, dni;
    private int age, salary;

    public Employee(String name, String dni, int age, int salary) {
        this.name = name;
        this.dni = dni;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDni() {
        return this.dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int increaseSalary(int increase) {
        salary += increase;
        return salary;
    }

    public Employee compareSalary(Employee employee2) {
        if (salary > employee2.salary) {
            return this;
        }
        return employee2;
    }

    @Override
    public String toString() {
        return "Employee{" + "name='" + name + '\'' + ", dni='" + dni + '\'' + ", age=" + age + ", salary=" + salary
                + '}';
    }
}
