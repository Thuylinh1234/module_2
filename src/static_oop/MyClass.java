package static_oop;

public class MyClass {
    static int a = 2; // thuộc về toàn bộ đối tượng
    int b = 2; // thuộc riêng cho từng đối tượng

    public static void main(String[] args) {
        MyClass s1 = new MyClass();
        MyClass s2 = new MyClass();

        s1.a++;
        s1.b++;

        s2.a++; // => dùng chung cho toàn bộ đối tượng
        s2.b++;

        System.out.println(s1.a);
        System.out.println(s2.b);
    }
}
