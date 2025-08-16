package quan_ly_dien_thoai;

import java.util.Scanner;

public class Phone {
    private String id;
    private String ten;
    private double giaBan;
    private int thoiGianBaoHanh;
    private String hangSanXuat;

    public Phone() {

    }

    public Phone(String id, String ten, double giaBan, int thoiGianBaoHanh, String hangSanXuat) {
        this.id = id;
        this.ten = ten;
        this.giaBan = giaBan;
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.hangSanXuat = hangSanXuat;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public int getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("ID: ");
        id = sc.nextLine();

        System.out.print("Tên điện thoại: ");
        ten = sc.nextLine();

        System.out.print("Giá bán: ");
        giaBan = Double.parseDouble(sc.nextLine());

        System.out.print("Thời gian bảo hành (tháng): ");
        thoiGianBaoHanh = Integer.parseInt(sc.nextLine());

        System.out.print("Hãng sản xuất: ");
        hangSanXuat = sc.nextLine();
    }

    public void output() {
        System.out.println("ID: " + id);
        System.out.println("Tên: " + ten);
        System.out.println("Giá: " + giaBan);
        System.out.println("Bảo hành: " + thoiGianBaoHanh + " tháng");
        System.out.println("Hãng: " + hangSanXuat);
    }
}
