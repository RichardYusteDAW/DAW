package examenIA3;

public class Person {
    protected String name, surname, id;

    public Person(String name, String surname, String id) {
        this.name = name;
        this.surname = surname;
        this.id = id;
    }

    public void showInfo() {
        System.out.println("Name: " + name +
                "\nSurname: " + surname +
                "\nID: " + id);
    }
}