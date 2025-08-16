package quan_ly_dien_thoai;

import java.util.Scanner;

public class DienThoaiCu extends Phone {
    private int tinhTrangPin;
    private String moTaThem;

    public DienThoaiCu() {
    }

    public DienThoaiCu(String id, String ten, double giaBan, int thoiGianBaoHanh, String hangSanXuat, int tinhTrangPin, String moTaThem) {
        super(id, ten, giaBan, thoiGianBaoHanh, hangSanXuat);
        this.tinhTrangPin = tinhTrangPin;
        this.moTaThem = moTaThem;
    }

    public int getTinhTrangPin() {
        return tinhTrangPin;
    }

    public void setTinhTrangPin(int tinhTrangPin) {
        this.tinhTrangPin = tinhTrangPin;
    }

    public String getMoTaThem() {
        return moTaThem;
    }

    public void setMoTaThem(String moTaThem) {
        this.moTaThem = moTaThem;
    }

    public void input() {
        super.input();

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập tình trạng pin(%): ");
        tinhTrangPin = Integer.parseInt(sc.nextLine());

        System.out.println("Mô tả thêm: ");
        moTaThem = sc.nextLine();
    }

    public void output() {
        super.output();
        System.out.println("Tình trạng pin(%): " + tinhTrangPin);
        System.out.println("Mô tả thêm: " + moTaThem);
    }
}
