package bai_1_da_hinh_oop;

public class SinhVien extends HocVien{
    // Trường hợp 1: Override
    @Override
    public void a() {
        System.out.println("SinhVien: a()");
    }

    // Trường hợp 3: Không thể override aPrivate()

    // Trường hợp 5: Nếu đổi kiểu trả về thành int sẽ bị lỗi compile
    // public int aByte() { return 1; } // => lỗi

    // Trường hợp 6: Override với kiểu trả về con (Dog)
    @Override
    public Dog getAnimal() {
        return new Dog();
    }

    // Trường hợp 7: Overload (thêm phương thức a(int))
    public void a(int i) {
        System.out.println("SinhVien: a(int)");
    }

    // Trường hợp 8: static method -> không override mà chỉ ẩn
    public static void aStatic() {
        System.out.println("SinhVien: aStatic()");
    }

    // Trường hợp 9: Overload khác tham số
    public void a(double d, int c) {
        System.out.println("SinhVien: a(double, int)");
    }

    // Trường hợp 10: phương thức mới hoàn toàn
    public void b(double d, int c) {
        System.out.println("SinhVien: b(double, int)");
    }
}
