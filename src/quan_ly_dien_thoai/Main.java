package quan_ly_dien_thoai;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    // Dùng 1 ArrayList chung
    static ArrayList<Phone> dsDienThoai = new ArrayList<>();

    static {
        dsDienThoai.add(new DienThoaiCu("DTC001", "iPhone 8", 3500000, 6, "Apple", 90, "Máy đẹp, ít xước"));
        dsDienThoai.add(new DienThoaiCu("DTC002", "iPhone 15", 4000000, 12, "Apple", 98, "Máy đẹp còn nguyên"));
        dsDienThoai.add(new DienThoaiMoi("DTM003", "iPhone 15", 25000000, 12, "Apple", 5));
        dsDienThoai.add(new DienThoaiMoi("DTM004", "iPhone 16", 45000000, 12, "Apple", 5));
    }

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            menuChinh();
            choice = nhapSo(1, 9);
            switch (choice) {
                case 1:
                    xemDanhSach();
                    break;
                case 2:
                    themMoi();
                    break;
                case 3:
                    capNhat();
                    break;
                case 4:
                    xoa();
                    break;
                case 5:
                    menuSapXep();
                    break;
                case 6:
                    menuTimKiem();
                    break;
                case 7:
                    tinhTongTien();
                    break;
                case 8:
                   giamGiaDienThoaiCu();
                    break;
                case 9:
                    System.out.println("Thoát chương trình.");
                    break;
            }
        } while (choice != 9);
    }

    public static void menuChinh() {
        System.out.println("\n-- CHƯƠNG TRÌNH QUẢN LÝ ĐIỆN THOẠI --");
        System.out.println("1. Xem danh sách điện thoại");
        System.out.println("2. Thêm mới");
        System.out.println("3. Cập nhật");
        System.out.println("4. Xóa");
        System.out.println("5. Sắp xếp theo giá");
        System.out.println("6. Tìm kiếm");
        System.out.println("7. Tính tổng tiền");
        System.out.println("8. Giảm giá cho điện thoại cũ");
        System.out.println("9. Thoát");
        System.out.print("Chọn chức năng: ");
    }

    // ======= Xem danh sách =======
    public static void xemDanhSach() {
        System.out.println("\n--- DANH SÁCH ĐIỆN THOẠI ---");
        for (Phone dt : dsDienThoai) {
            dt.output();
        }
    }

    // ======= Thêm mới =======
    public static void themMoi() {
        System.out.println("\n--- THÊM MỚI ---");
        System.out.println("1. Thêm điện thoại cũ");
        System.out.println("2. Thêm điện thoại mới");
        System.out.print("Chọn: ");
        int choice = nhapSo(1, 2);

        if (choice == 1) {
            DienThoaiCu dt = new DienThoaiCu();
            dt.input();
            dsDienThoai.add(dt);
        } else {
            DienThoaiMoi dt = new DienThoaiMoi();
            dt.input();
            dsDienThoai.add(dt);
        }
        System.out.println("Đã thêm mới thành công!");
    }

    // ======= Cập nhật =======
    public static void capNhat() {
        System.out.print("Nhập ID cần cập nhật: ");
        String id = sc.nextLine().trim();

        for (Phone dt : dsDienThoai) {
            if (dt.getId().equalsIgnoreCase(id)) {
                System.out.println("Thông tin cũ:");
                dt.output();
                System.out.println("Nhập thông tin mới:");
                dt.input();
                System.out.println("Cập nhật thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy ID!");
    }

    // ======= Xóa =======
    public static void xoa() {
        System.out.print("Nhập ID cần xóa: ");
        String id = sc.nextLine().trim();

        for (Phone dt : dsDienThoai) {
            if (dt.getId().equalsIgnoreCase(id)) {
                System.out.print("Bạn có chắc muốn xóa? (y/n): ");
                String confirm = sc.nextLine();
                if (confirm.equalsIgnoreCase("y")) {
                    dsDienThoai.remove(dt);
                    System.out.println("Xóa thành công!");
                }
                return;
            }
        }
        System.out.println("Không tìm thấy ID!");
    }

    // ======= Sắp xếp =======
    public static void menuSapXep() {
        System.out.println("\n--- SẮP XẾP THEO GIÁ ---");
        System.out.println("1. Tăng dần");
        System.out.println("2. Giảm dần");
        System.out.print("Chọn: ");
        int choice = nhapSo(1, 2);

        // Interchange Sort
        for (int i = 0; i < dsDienThoai.size() - 1; i++) {
            for (int j = i + 1; j < dsDienThoai.size(); j++) {
                if ((choice == 1 && dsDienThoai.get(i).getGiaBan() > dsDienThoai.get(j).getGiaBan()) ||
                        (choice == 2 && dsDienThoai.get(i).getGiaBan() < dsDienThoai.get(j).getGiaBan())) {
                    Phone tmp = dsDienThoai.get(i);
                    dsDienThoai.set(i, dsDienThoai.get(j));
                    dsDienThoai.set(j, tmp);
                }
            }
        }
        System.out.println("Danh sách sau khi sắp xếp:");
        xemDanhSach();
    }

    // ======= Tìm kiếm =======
    public static void menuTimKiem() {
        int choice;
        do {
            System.out.println("\n--- TÌM KIẾM ---");
            System.out.println("1. Theo giá");
            System.out.println("2. Theo tên");
            System.out.println("3. Theo hãng");
            System.out.println("4. Trở về");
            System.out.print("Chọn: ");
            choice = nhapSo(1, 4);

            switch (choice) {
                case 1:
                    timTheoGia();
                    break;
                case 2:
                    timTheoTen();
                    break;
                case 3:
                    timTheoHang();
                    break;
            }
        } while (choice != 4);
    }

    public static void timTheoGia() {
        System.out.print("Nhập giá min: ");
        long min = Long.parseLong(sc.nextLine().trim());
        System.out.print("Nhập giá max: ");
        long max = Long.parseLong(sc.nextLine().trim());

        for (Phone dt : dsDienThoai) {
            if (dt.getGiaBan() >= min && dt.getGiaBan() <= max) {
                dt.output();
            }
        }
    }

    public static void timTheoTen() {
        System.out.print("Nhập tên cần tìm: ");
        String keyword = sc.nextLine().trim().toLowerCase();

        for (Phone dt : dsDienThoai) {
            if (dt.getTen().toLowerCase().contains(keyword)) {
                dt.output();
            }
        }
    }

    public static void timTheoHang() {
        System.out.print("Nhập hãng cần tìm: ");
        String hang = sc.nextLine().trim().toLowerCase();

        for (Phone dt : dsDienThoai) {
            if (dt.getHangSanXuat().toLowerCase().contains(hang)) {
                dt.output();
            }
        }
    }

    public static void tinhTongTien() {
        double tong = 0;
        for (Phone dt : dsDienThoai) {
            tong += dt.tinhTongGia();
        }
        System.out.printf("Tổng giá trị tất cả điện thoại trong cửa hàng = %,.0f VND\n", tong);
    }


    public static void giamGiaDienThoaiCu() {
        System.out.print("Nhập % giảm giá cho điện thoại cũ: ");
        double phanTram = Double.parseDouble(sc.nextLine().trim());
        boolean coDienThoaiCu = false; // Kiểm tra xem có điện thoại cũ nào không
        for (Phone dt : dsDienThoai) {
            if (dt instanceof KhuyenMai) {  // Kiểm tra nếu đối tượng là 1 Điện thoại cũ (có thể khuyến mãi)
                ((KhuyenMai) dt).khuyenMai(phanTram);  // Ép kiểu về KhuyenMai và gọi hàm
                coDienThoaiCu = true;
            }
        }

        if (coDienThoaiCu) {
            System.out.println("Đã áp dụng giảm giá " + phanTram + "% cho tất cả điện thoại cũ!");
            System.out.println(" DANH SÁCH SAU KHI GIẢM GIÁ ");
            xemDanhSach();
        } else {
            System.out.println("Không có điện thoại cũ nào trong danh sách để áp dụng giảm giá.");
        }
    }

    // Hàm nhập số chung
    public static int nhapSo(int min, int max) {
        int n;
        while (true) {
            try {
                String input = sc.nextLine().trim();
                n = Integer.parseInt(input);
                if (n >= min && n <= max) {
                    return n;
                }
                System.out.print("Giá trị không hợp lệ! Nhập lại (" + min + "-" + max + "): ");
            } catch (NumberFormatException e) {
                System.out.print("Không hợp lệ! Vui lòng nhập số từ " + min + " đến " + max + ": ");
            }
        }
    }

}
