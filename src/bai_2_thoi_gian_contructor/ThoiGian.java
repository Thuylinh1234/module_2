package bai_2_thoi_gian_contructor;

/**
 * Tạo lớp ThoiGian với các constructor và phương thức xuat() để đáp ứng yêu cầu đề bài.
 */
public class ThoiGian {
    private int gio;
    private int phut;
    private int giay;

    // contrucstor mặc định
    public ThoiGian() {
        gio = 0;
        phut = 0;
        giay = 0;
    }

    // contrucstor 1 tham số
    public ThoiGian(int gio) {
        this.gio = gio;
        phut = 0;
        giay = 0;
    }

    // contrucstor 2 tham số

    public ThoiGian(int gio, int phut) {
        this.gio = gio;
        this.phut = phut;
        giay = 0;
    }

    // contrucstor 3 tham số
    public ThoiGian(int gio, int phut, int giay) {
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }

    // Constructor sao chép
    public ThoiGian(ThoiGian tg) {
        this.gio = tg.gio;
        this.phut = tg.phut;
        this.giay = tg.giay;
    }

    public void xuat() {
        System.out.printf("%02d:%02d:%02d\n", gio, phut, giay);
    }
}
