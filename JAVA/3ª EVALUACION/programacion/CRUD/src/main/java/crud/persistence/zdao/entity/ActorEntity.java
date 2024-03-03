package crud.persistence.zdao.entity;

public class ActorEntity {

    private int id;
    private String name;

    public ActorEntity(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ActorEntity [id=" + id + ", name=" + name + "]";
    }

}
