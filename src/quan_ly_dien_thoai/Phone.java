package quan_ly_dien_thoai;

import java.util.Scanner;

public class Phone {
    protected String ten;
    protected double gia;
    protected int thoiGianBaoHanh;

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

    public void display() {
        System.out.println("Tên: " + ten);
        System.out.println("Giá: " + gia);
        System.out.println("Bảo hành: " + thoiGianBaoHanh + " tháng");
    }
}
