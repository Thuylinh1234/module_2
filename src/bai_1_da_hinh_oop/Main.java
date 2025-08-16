package bai_1_da_hinh_oop;

public class Main {
    public static void main(String[] args) {
        HocVien hv = new HocVien();
        SinhVien sv = new SinhVien();
        HocVien hocVien = new SinhVien();

        // Trường hợp 1 + 2 + 4: Override
        hv.a();         // HocVien: a()
        sv.a();         // SinhVien: a()
        hocVien.a();    // SinhVien: a()

        // Trường hợp 3: private method -> không gọi được từ lớp con

        // Trường hợp 6: kiểu trả về con
        Animal a1 = hv.getAnimal(); // Animal
        Animal a2 = sv.getAnimal(); // Dog

        // Trường hợp 7: Overload
        sv.a(5); // SinhVien: a(int)

        // Trường hợp 8: static method
        HocVien.aStatic(); // HocVien: aStatic()
        SinhVien.aStatic(); // SinhVien: aStatic()

        // Trường hợp 9: Overload khác tham số
        sv.a(1.5, 2); // SinhVien: a(double, int)

        // Trường hợp 10: phương thức mới
        sv.b(3.0, 4); // SinhVien: b(double, int)
    }
}
