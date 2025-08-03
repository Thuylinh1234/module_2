package xu_ly_phan_so_contructor;

public class Main {
    public static void main(String[] args) {
        PhanSo ps1 = new PhanSo();
        ps1.xuat();

        PhanSo ps2 = new PhanSo(2);
        ps2.xuat();

        PhanSo ps3 = new PhanSo(2, 4);
        ps3.xuat();

        PhanSo ps4= new PhanSo(2, -1);
        ps4.xuat();

        PhanSo f = ps4.copy();
        f.cong(50);
        ps4.xuat();
        f.xuat();
    }

}
