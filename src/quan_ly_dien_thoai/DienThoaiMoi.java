package quan_ly_dien_thoai;

import java.util.Scanner;

public class DienThoaiMoi extends Phone {
    private int soLuong;

    public DienThoaiMoi(int soLuong) {
        this.soLuong = soLuong;
    }

    public DienThoaiMoi(String id, String ten, double giaBan, int thoiGianBaoHanh, String hangSanXuat, int soLuong) {
        super(id, ten, giaBan, thoiGianBaoHanh, hangSanXuat);
        this.soLuong = soLuong;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void input() {
        super.input();

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số lượng: ");
        soLuong = sc.nextInt();
    }

    public void output() {
        super.output();
        System.out.println("Số lượng: " + soLuong);
    }
}
