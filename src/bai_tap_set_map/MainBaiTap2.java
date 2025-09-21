package bai_tap_set_map;

import java.util.Arrays;
import java.util.List;

public class MainBaiTap2 {
    public static void main(String[] args) {
        String text = "Em lười hocjcc quạ ";
        String[] names = {"An", "Bình", "Linh", "Vy", "Huy", "Lợi", "Bảo"};

        // a. Đếm từ trong văn bản
        Baitap2.demSoLanTu(text);
        System.out.println();

        // b. Kiểm tra tính duy nhất của tên
        Baitap2.kiemTraTen(names);
    }
}
