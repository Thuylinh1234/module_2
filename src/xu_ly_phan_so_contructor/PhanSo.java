package xu_ly_phan_so_contructor;

/**
 * Tạo lớp PhanSo có các constructor và phương thức xuat() để đáp ứng yêu cầu đề bài.
 */
public class PhanSo {
    private int mauSo;
    private int tuSo;

    public PhanSo() {
        tuSo = 0;
        mauSo = 1;
    }

    public PhanSo(int tuSo) {
        this.tuSo = tuSo;
        this.mauSo = 1;
    }

    public PhanSo( int tuSo,int mauSo) {
        this.mauSo = mauSo;
        this.tuSo = tuSo;
        rutGon();
    }

    void rutGon() {
        int ucln = uocChungLonNhat(Math.abs(tuSo), Math.abs(mauSo));

        tuSo /= ucln;
        mauSo /= ucln;

        if (mauSo < 0) {
            tuSo = -tuSo;
            mauSo = -mauSo;
        }
    }

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

    public void xuat() {
        if (tuSo == 0) {
            System.out.println("0");
        } else if (mauSo == 1) {
            System.out.println(tuSo);
        } else {
            System.out.println(tuSo + "/" + mauSo);
        }
    }

    public PhanSo copy() {
        return new PhanSo(tuSo, mauSo);
    }

    public void cong(int value) {
        tuSo += value * mauSo;
        rutGon();
    }

}
