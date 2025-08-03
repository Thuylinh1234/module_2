package ss2_constructor.access_modifer;

public class Animal {
    private int id;
    String name;
    protected String color;
    public int age;

    void input(){
        this.id = 1;
        this.name = "abc";
        this.color = "red";
        this.age = 1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
