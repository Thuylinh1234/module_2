package quan_ly_dien_thoai;

import java.util.Scanner;

public class DienThoaiMoi extends Phone {
    private int soLuong;

    public DienThoaiMoi() {
        super();
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
        soLuong = Integer.parseInt(sc.nextLine());
    }

    public void output() {
        super.output();
        System.out.println("Số lượng: " + soLuong);
    }

    @Override
    public double tinhTongGia() {
        // Đối với điện thoại mới, tổng giá trị = giá bán * số lượng
        return this.getGiaBan() * this.getSoLuong();
    }

}
