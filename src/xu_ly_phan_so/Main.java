package xu_ly_phan_so;

import quan_ly_thong_tin_sv.Student_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<PhanSo> phanSos = new ArrayList<>();

        System.out.print("Nhập số lượng phân số: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.printf("\nNhập phân số thứ %d \n", i );
            PhanSo ps = new PhanSo();
            ps.nhap();
            phanSos.add(ps);
        }

        System.out.print("\nHiện thị phân số đã nhập \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("Thông tin phân số thứ %d:\n", i + 1);
            phanSos.get(i).xuat();
        }

        PhanSo tong = phanSos.get(0).tong(phanSos.get(1));
        System.out.println("Tổng 2 phân số: ");
        tong.xuat();

        PhanSo hieu = phanSos.get(0).hieu(phanSos.get(1));
        System.out.println("Hiệu 2 phân số: ");
        hieu.xuat();

        PhanSo tich = phanSos.get(0).tich(phanSos.get(1));
        System.out.println("Tích 2 phân số: ");
        tich.xuat();

        PhanSo thuong = phanSos.get(0).thuong(phanSos.get(1));
        System.out.println("Thương 2 phân số: ");
        thuong.xuat();

        System.out.println("\nTính chất các phân số:");
        for (int i = 0; i < n; i++) {
            System.out.printf("Phân số thứ %d: %s\n", i + 1, phanSos.get(i).tinhChat());
        }


    }
}
