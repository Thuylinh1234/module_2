package quan_ly_dien_thoai;

import java.util.Scanner;

public abstract class Phone {
    private String id;
    private String ten;
    private double gia;
    private int thoiGianBaoHanh;
    private String hangSanXuat;

    public Phone() {
    }

    public Phone(String id, String ten, double gia, int thoiGianBaoHanh, String hangSanXuat) {
        this.id = id;
        this.ten = ten;
        this.gia = gia;
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.hangSanXuat = hangSanXuat;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public void input() throws EmptyFieldException, NegativeNumberException, MinLengthException {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Nhập tên điện thoại: ");
            ten = sc.nextLine().trim();
            if (ten.isEmpty()) {
                throw new EmptyFieldException("Tên điện thoại không được để trống");
            }

            System.out.print("Nhập giá: ");
            String giaStr = sc.nextLine().trim();
            if (giaStr.isEmpty()) {
                throw new EmptyFieldException("Giá không được để trống");
            }
            gia = Double.parseDouble(giaStr);
            if (gia < 0) {
                throw new NegativeNumberException("Giá không được âm");
            }

            System.out.print("Nhập thời gian bảo hành (tháng): ");
            String tgStr = sc.nextLine().trim();
            if (tgStr.isEmpty()) {
                throw new EmptyFieldException("Thời gian bảo hành không được để trống");
            }
            thoiGianBaoHanh = Integer.parseInt(tgStr);
            if (thoiGianBaoHanh < 0) {
                throw new NegativeNumberException("Thời gian bảo hành không được âm");
            }

        } catch (NumberFormatException e) {
            throw new NumberFormatException("Giá và thời gian bảo hành phải là số!");
        }
    }

    public void output() {
        System.out.println("ID: " + id);
        System.out.println("Tên: " + ten);
        System.out.println("Giá: " + gia);
        System.out.println("Bảo hành: " + thoiGianBaoHanh + " tháng");
        System.out.println("Hãng SX: " + hangSanXuat);
    }



}
