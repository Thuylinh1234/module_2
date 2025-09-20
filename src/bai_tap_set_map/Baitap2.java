package bai_tap_set_map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Baitap2 {
    public static void demSoLanXuatHien(String text) {
        Map<String, Integer> wordCount = new HashMap<>();

        // Chia chuỗi theo khoảng trắng và loại bỏ dấu câu đơn giản
        String[] words = text.toLowerCase().replaceAll("[^a-zA-Z0-9\\s]", "").split("\\s+");

        for (String word : words) {
            if (!word.isEmpty()) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }

        System.out.println("Kết quả đếm từ:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    // b. Kiểm tra tính duy nhất của tên
    public static void kiemTraTen(List<String> names) {
        Map<String, Integer> nameCount = new HashMap<>();

        for (String name : names) {
            nameCount.put(name, nameCount.getOrDefault(name, 0) + 1);
        }

        System.out.println("Kết quả kiểm tra tên:");
        for (Map.Entry<String, Integer> entry : nameCount.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey() + " là duy nhất");
            } else {
                System.out.println(entry.getKey() + " xuất hiện " + entry.getValue() + " lần");
            }
        }
    }
    public static void main(String[] args) {
        // a. Test đếm từ
        String text = "Java is fun and Java is powerful. Fun fun fun!";
        demSoLanXuatHien(text);

        System.out.println();

        // b. Test kiểm tra tên
        List<String> names = Arrays.asList("An", "Bình", "An", "Lan", "Bình", "Mai");
        kiemTraTen(names);
    }
}
