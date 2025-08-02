package xu_ly_phan_so;

import java.util.Scanner;

/**
Viết chương trình nhập vào một phân số (gồm tử & mẫu).
    a. Viết method nhập, xuất cho phân số.
        i.  Đối với method nhập sẽ không cho nhập mẫu vào số 0
        ii. Đối với method xuất nên ở dạng rút gọn nhất (2/8 nên là 1/4, 8/-4 nên là -2, …)
    b. Tính Tổng, Hiệu, tích thương của 2 phân số
    c. Hãy cho biết phân số đó là phân số âm hay dương hay bằng không
 */
public class PhanSo {
    int mauSo;
    int tuSo;

    void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tử số: ");
        tuSo = Integer.parseInt(sc.nextLine());

        do {
            System.out.print("Nhập mẫu số(#0): ");
            mauSo = Integer.parseInt(sc.nextLine());
            if (mauSo < 0 ){
                System.out.println("Vui lòng nhập lại mẫu số!");
            }
        } while (mauSo == 0);
    }

    // Rút gọn phân số về
    void rutGon() {
        int ucln = uocChungLonNhat(Math.abs(tuSo), Math.abs(mauSo));

        tuSo /= ucln;
        mauSo /= ucln;

        if (mauSo < 0) {
            tuSo = -tuSo;
            mauSo = -mauSo;
        }
    }

    // Tìm ước chung lớn nhất
    int uocChungLonNhat(int a, int b) {
        if (a == 0) return b;
        if (b == 0) return a;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    void xuat() {
        rutGon();
        if (mauSo == 1) {
            System.out.println("Phân số: " + tuSo);
        } else if (tuSo == 0) {
            System.out.println("Phân số: 0");
        } else {
            System.out.println("Phân số: " + tuSo + "/" + mauSo);
        }
    }

    // tính tổng
    PhanSo tong(PhanSo phanSo) {
        PhanSo kq = new PhanSo();
        kq.tuSo = this.tuSo * phanSo.mauSo + phanSo.tuSo * this.mauSo;
        kq.mauSo = this.mauSo * phanSo.mauSo;
        return kq;
    }

    // tính hiệu
    PhanSo hieu(PhanSo phanSo) {
        PhanSo kq = new PhanSo();
        kq.tuSo = this.tuSo * phanSo.mauSo - phanSo.tuSo * this.mauSo;
        kq.mauSo = this.mauSo * phanSo.mauSo;
        return kq;
    }

    // tính tích
    PhanSo tich(PhanSo phanSo) {
        PhanSo kq = new PhanSo();
        kq.tuSo = this.tuSo * phanSo.tuSo;
        kq.mauSo = this.mauSo * phanSo.mauSo;
        return kq;
    }

    // tính thương
    PhanSo thuong(PhanSo phanSo) {
        PhanSo kq = new PhanSo();
        kq.tuSo = this.tuSo *  phanSo.mauSo;
        kq.mauSo = this.mauSo * phanSo.tuSo;
        return kq;
    }

    // phân số âm hay dương hay bằng không
    String tinhChat() {
        if (tuSo == 0) {
            return "Phân số bằng 0";
        } else if ((tuSo > 0 && mauSo > 0) || (tuSo < 0 && mauSo < 0)) {
            return "Phân số dương";
        } else {
            return "Phân số âm";
        }
    }
}
