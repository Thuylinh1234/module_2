package quan_ly_dien_thoai;

import java.util.Scanner;

public class DienThoaiMoi extends Phone  {
    private int soLuong;

    public DienThoaiMoi() {
    }

    public DienThoaiMoi(String id, String ten, double gia, int thoiGianBaoHanh, String hangSanXuat, int soLuong) {
        super(id, ten, gia, thoiGianBaoHanh, hangSanXuat);
        this.soLuong = soLuong;
    }

    @Override
    public void input() throws EmptyFieldException, NegativeNumberException {
        try {
            super.input();
        } catch (MinLengthException e) {
            throw new RuntimeException(e);
        }
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Nhập số lượng: ");
            String slStr = sc.nextLine().trim();
            if (slStr.isEmpty()) {
                throw new EmptyFieldException("Số lượng không được để trống");
            }
            soLuong = Integer.parseInt(slStr);
            if (soLuong < 0) {
                throw new NegativeNumberException("Số lượng không được âm");
            }
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Số lượng phải là số!");
        }
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Số lượng: " + soLuong);
    }

}
