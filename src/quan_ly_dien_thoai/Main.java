package quan_ly_dien_thoai;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<DienThoaiCu> dsDienThoaiCu = new ArrayList<>();
    static ArrayList<DienThoaiMoi> dsDienThoaiMoi = new ArrayList<>();

    static {
        dsDienThoaiCu.add(new DienThoaiCu("DTC001", "iPhone 8", 3500000, 6, "Apple", 90, "Máy đẹp, ít xước"));
        dsDienThoaiCu.add(new DienThoaiCu("DTC002", "iPhone 15", 4000000, 12, "Apple", 98, "Máy đẹp còn nguyên"));

        dsDienThoaiMoi.add(new DienThoaiMoi("DTM003", "iPhone 15", 25000000, 12, "Apple", 5));
        dsDienThoaiMoi.add(new DienThoaiMoi("DTM004", "iPhone 16", 45000000, 12, "Apple", 5));
    }

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            menuChinh();
            choice = nhapSo(1, 9);
            switch (choice) {
                case 1:
                    menuXemDanhSach();
                    break;
                case 2:
                    menuThemMoi();
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
                    System.out.println("Chức năng Tính tổng tiền !");
                    break;
                case 8:
                    System.out.println("Chức năng Giảm giá cho điện thoại cũ!");
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

    public static void menuXemDanhSach() {
        int choice;
        do {
            System.out.println("\n--- XEM DANH SÁCH ---");
            System.out.println("1. Xem tất cả");
            System.out.println("2. Xem điện thoại cũ");
            System.out.println("3. Xem điện thoại mới");
            System.out.println("4. Trở về menu chính");
            System.out.print("Chọn: ");
            choice = nhapSo(1, 4);

            switch (choice) {
                case 1:
                    System.out.println("\n--- TẤT CẢ ĐIỆN THOẠI ---");
                    for (DienThoaiCu dt : dsDienThoaiCu) dt.output();
                    for (DienThoaiMoi dt : dsDienThoaiMoi) dt.output();
                    break;
                case 2:
                    System.out.println("\nĐIỆN THOẠI CŨ");
                    for (DienThoaiCu dt : dsDienThoaiCu) dt.output();
                    break;
                case 3:
                    System.out.println("\nĐIỆN THOẠI MỚI");
                    for (DienThoaiMoi dt : dsDienThoaiMoi) dt.output();
                    break;
            }
        } while (choice != 4);
    }

    public static void menuThemMoi() {
        int choice;
        do {
            System.out.println("\n--- THÊM MỚI ---");
            System.out.println("1. Thêm mới điện thoại cũ");
            System.out.println("2. Thêm mới điện thoại mới");
            System.out.println("3. Trở về menu chính");
            System.out.print("Chọn: ");
            choice = nhapSo(1, 3);

            if (choice == 1) {
                DienThoaiCu dt = new DienThoaiCu();
                dt.input();
                dsDienThoaiCu.add(dt);
                System.out.println("Đã thêm điện thoại cũ.");
            } else if (choice == 2) {
                DienThoaiMoi dt = new DienThoaiMoi(0);
                dt.input();
                dsDienThoaiMoi.add(dt);
                System.out.println("Đã thêm điện thoại mới.");
            }
        } while (choice != 3);
    }

    public static void capNhat() {
        System.out.print("Nhập ID điện thoại cần cập nhật: ");
        String id = sc.nextLine();

        if (!id.matches("DT[CM]\\d{3}")) {
            System.out.println("Sai format ID! (Ví dụ: DTC001 hoặc DTM001)");
            return;
        }

        if (id.startsWith("DTC")) {
            for (DienThoaiCu dt : dsDienThoaiCu) {
                if (dt.getId().equals(id)) {
                    System.out.println("Thông tin cũ:");
                    dt.output();
                    System.out.println("Nhập thông tin mới:");
                    dt.input();
                    System.out.println("Cập nhật thành công!");
                    return;
                }
            }
        } else if (id.startsWith("DTM")) {
            for (DienThoaiMoi dt : dsDienThoaiMoi) {
                if (dt.getId().equals(id)) {
                    System.out.println("Thông tin cũ:");
                    dt.output();
                    System.out.println("Nhập thông tin mới:");
                    dt.input();
                    System.out.println("Cập nhật thành công!");
                    return;
                }
            }
        }
        System.out.println("Không tìm thấy ID trong danh sách!");
    }

    public static void xoa() {
        System.out.print("Nhập ID điện thoại cần xóa: ");
        String id = sc.nextLine();

        if (!id.matches("DT[CM]\\d{3}")) {
            System.out.println("Sai format ID! (Ví dụ: DTC001 hoặc DTM001)");
            return;
        }

        if (id.startsWith("DTC")) {
            for (DienThoaiCu dt : dsDienThoaiCu) {
                if (dt.getId().equals(id)) {
                    System.out.print("Bạn có chắc chắn muốn xóa? (y/n): ");
                    String confirm = sc.nextLine();
                    if (confirm.equalsIgnoreCase("y")) {
                        dsDienThoaiCu.remove(dt);
                        System.out.println("Xóa thành công!");
                    }
                    return;
                }
            }
        } else if (id.startsWith("DTM")) {
            for (DienThoaiMoi dt : dsDienThoaiMoi) {
                if (dt.getId().equals(id)) {
                    System.out.print("Bạn có chắc chắn muốn xóa? (y/n): ");
                    String confirm = sc.nextLine();
                    if (confirm.equalsIgnoreCase("y")) {
                        dsDienThoaiMoi.remove(dt);
                        System.out.println("Xóa thành công!");
                    }
                    return;
                }
            }
        }
        System.out.println("Không tìm thấy ID trong danh sách!");
    }
    public static void menuSapXep() {
        int choice;
        do {
            System.out.println("\n--- SẮP XẾP THEO GIÁ ---");
            System.out.println("1. Tăng dần");
            System.out.println("2. Giảm dần");
            System.out.println("3. Trở về menu chính");
            System.out.print("Chọn: ");
            choice = nhapSo(1, 3);
        } while (choice != 3);
    }

    public static void menuTimKiem() {
        int choice;
        do {
            System.out.println("\n--- TÌM KIẾM ---");
            System.out.println("1. Tìm kiếm tất cả điện thoại");
            System.out.println("2. Tìm kiếm điện thoại cũ");
            System.out.println("3. Tìm kiếm điện thoại mới");
            System.out.println("4. Trở về menu chính");
            System.out.print("Chọn: ");
            choice = nhapSo(1, 4);

            if (choice >= 1 && choice <= 3) {
                menuTimKiemChiTiet();
            }
        } while (choice != 4);
    }

    public static void menuTimKiemChiTiet() {
        int choice;
        do {
            System.out.println("\n--- TÌM KIẾM CHI TIẾT ---");
            System.out.println("1. Tìm kiếm theo giá");
            System.out.println("2. Tìm kiếm theo tên");
            System.out.println("3. Tìm kiếm theo hãng");
            System.out.println("4. Trở về menu Tìm kiếm");
            System.out.print("Chọn: ");
            choice = nhapSo(1, 4);
        } while (choice != 4);
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
                } else {
                    System.out.print("Giá trị không hợp lệ! Nhập lại (" + min + "-" + max + "): ");
                }
            } catch (NumberFormatException e) {
                System.out.print("Không hợp lệ! Vui lòng nhập số từ " + min + " đến " + max + ": ");
            }
        }
    }

}
