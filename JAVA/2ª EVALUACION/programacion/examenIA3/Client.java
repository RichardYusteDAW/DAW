package examenIA3;

public class Client extends Person {
    private String email, phone;

    public Client(String name, String surname, String id, String email, String phone) {
        super(name, surname, id);

        this.email = email;
        this.phone = phone;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("email: " + email +
                "\nphone: " + phone);
    }
}