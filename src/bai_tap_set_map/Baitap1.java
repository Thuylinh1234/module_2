package bai_tap_set_map;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * a. Loại bỏ các phần tử trùng lặp
 * Viết một chương trình nhận vào một mảng số nguyên và sử dụng Set để loại bỏ các phần tử trùng lặp, sau đó hiển thị danh sách các phần tử duy nhất.
 *
 * b. Tính tổng của các phần tử không trùng lặp
 * Viết một chương trình nhận vào một mảng số nguyên và sử dụng Set để tính tổng của các phần tử không trùng lặp trong mảng.
 *
 * c. Tìm các phần tử chung trong hai mảng
 * Viết một chương trình nhận vào hai mảng số nguyên và sử dụng hai Set để tìm các phần tử chung giữa hai mảng.
 *
 * d. Tìm phần tử lớn nhất và nhỏ nhất
 * Viết một chương trình nhận vào một mảng số nguyên và sử dụng Set để tìm phần tử lớn nhất và nhỏ nhất trong mảng.
 */
public class Baitap1 {
    // a. Loại bỏ các phần tử trùng lặp
    public static void removeDuplicates(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        System.out.println("Các phần tử duy nhất: " + set);
    }

    // b. Tính tổng các phần tử không trùng lặp
    public static void sumUnique(int[] arr) {
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        for (int num : arr) {
            // Chỉ cộng nếu chưa có trong set
            if (set.add(num)) {
                sum += num;
            }
        }
        System.out.println("Tổng các phần tử không trùng lặp: " + sum);
    }

    // c. Tìm phần tử chung giữa 2 mảng
    public static void findCommonElements(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : arr1) set1.add(num);
        for (int num : arr2) set2.add(num);

        // Giao giữa 2 set
        set1.retainAll(set2);

        System.out.println("Các phần tử chung: " + set1);
    }

    // d. Tìm phần tử lớn nhất và nhỏ nhất
    public static void findMinMax(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        int min = Collections.min(set);
        int max = Collections.max(set);

        System.out.println("Phần tử nhỏ nhất: " + min);
        System.out.println("Phần tử lớn nhất: " + max);
    }
}
