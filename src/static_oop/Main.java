package static_oop;

public class Main {
    static int a = 10; // thuộc về class(Chung cho các đối tượng cùng loại)

    public static void main(String[] args) { // thuộc về class
        System.out.println(a);
    }

    void changeData(){ // non - static => thuộc về đối tượng
        a = 100;

    }
}
