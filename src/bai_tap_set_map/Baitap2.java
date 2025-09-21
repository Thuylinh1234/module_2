package bai_tap_set_map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 */
public class Baitap2 {
    // a. Đếm số lần xuất hiện của từ trong văn bản
    public static void demSoLanTu(String text) {
        String[] words = text.split("\\s+"); // tách từ theo khoảng trắng
        Map<String, Integer> map = new HashMap<>();

        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1); // đã có thì tăng thêm 1
            } else {
                map.put(word, 1); // chưa có thì gán bằng 1
            }
        }

        System.out.println("Số lần xuất hiện của từng từ:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    // b. Kiểm tra tính duy nhất của tên
    public static void kiemTraTen(String[] names) {
        Map<String, Integer> map = new HashMap<>();

        for (String name : names) {
            if (map.containsKey(name)) {
                map.put(name, map.get(name) + 1);
            } else {
                map.put(name, 1);
            }
        }

        System.out.println("Kết quả kiểm tra tính duy nhất:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey() + " là tên duy nhất");
            } else {
                System.out.println(entry.getKey() + " xuất hiện " + entry.getValue() + " lần");
            }
        }
    }
}
