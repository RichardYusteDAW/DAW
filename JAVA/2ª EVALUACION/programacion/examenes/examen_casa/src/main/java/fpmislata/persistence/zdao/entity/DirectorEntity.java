package fpmislata.persistence.zdao.entity;

public class DirectorEntity {
    private Integer id;
    private String name;
    private String surname;

    public DirectorEntity(Integer id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "\u001B[32m" + "Director [name=" + name + ", surname=" + surname + "]" + "\u001B[0m";
    }
}
