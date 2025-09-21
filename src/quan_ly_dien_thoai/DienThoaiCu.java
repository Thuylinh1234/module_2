package quan_ly_dien_thoai;

import java.util.Scanner;

public class DienThoaiCu extends Phone implements KhuyenMai {
    private int tinhTrangPin;   // từ 0 - 100
    private String moTaThem;

    public DienThoaiCu() {

    }


    public DienThoaiCu(String id, String ten, double gia, int thoiGianBaoHanh, String hangSanXuat, int tinhTrangPin, String moTaThem) {
        super(id, ten, gia, thoiGianBaoHanh, hangSanXuat);
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

    @Override
    public void input() throws EmptyFieldException, MinLengthException {
        try {
            super.input();
        } catch (NegativeNumberException e) {
            throw new RuntimeException(e);
        }
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Nhập tình trạng pin (%): ");
            String pinStr = sc.nextLine().trim();
            if (pinStr.isEmpty()) {
                throw new EmptyFieldException("Tình trạng pin không được để trống");
            }
            tinhTrangPin = Integer.parseInt(pinStr);

            if (tinhTrangPin < 0 || tinhTrangPin > 100) {
                throw new NumberOutOfRangeException("Pin phải nằm trong khoảng 0 - 100%");
            }

            System.out.print("Mô tả thêm: ");
            moTaThem = sc.nextLine().trim();
            if (moTaThem.isEmpty()) {
                throw new EmptyFieldException("Mô tả thêm không được để trống");
            }
            if (moTaThem.length() < 10) {
                throw new MinLengthException("Mô tả thêm phải có ít nhất 10 ký tự");
            }

        } catch (NumberFormatException e) {
            throw new NumberFormatException("Tình trạng pin phải là số!");
        } catch (NumberOutOfRangeException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Tình trạng pin: " + tinhTrangPin + "%");
        System.out.println("Mô tả thêm: " + moTaThem);
    }
    @Override
    public void khuyenMai(double phanTram) {
        double giaMoi = getGia() * (1 - phanTram / 100);
        setGia(giaMoi);
    }
}
