package bai_1_da_hinh_oop;

public class HocVien {
    // Trường hợp 1, 2, 4: public void a()
    public void a() {
        System.out.println("HocVien: a()");
    }

    // Trường hợp 3: private method -> không thể override
    private void aPrivate() {
        System.out.println("HocVien: aPrivate()");
    }

    // Trường hợp 5: trả về byte
    public byte aByte() {
        return 1;
    }

    // Trường hợp 6: trả về Animal
    public Animal getAnimal() {
        return new Animal();
    }

    // Trường hợp 8: static method
    public static void aStatic() {
        System.out.println("HocVien: aStatic()");
    }

    // Trường hợp 9: có tham số (int, int)
    public void a(int b, int c) {
        System.out.println("HocVien: a(int, int)");
    }
}
