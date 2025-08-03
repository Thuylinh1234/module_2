package ss2_constructor.access_modifer;

public class AnimalManagement {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.age = 14;
        animal.name = "abc";

        animal.setId(10);
        System.out.println("id: " + animal.getId());
    }
}
