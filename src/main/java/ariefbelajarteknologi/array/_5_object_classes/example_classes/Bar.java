package ariefbelajarteknologi.array._5_object_classes.example_classes;

public class Bar {

    private String id;

    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Bar() {
    }

    public Bar(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
