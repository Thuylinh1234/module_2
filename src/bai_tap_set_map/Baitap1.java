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
    public static void main(String[] args) {
        // a. Loại bỏ các phần tử trùng lặp
        int[] arr1 = {1, 2, 3, 2, 4, 1, 5};
        Set<Integer> uniqueSet = new HashSet<>();
        for (int num : arr1) {
            uniqueSet.add(num);
        }
        System.out.println("a. Các phần tử duy nhất: " + uniqueSet);

        // b. Tính tổng của các phần tử không trùng lặp
        int[] arr2 = {1, 2, 2, 3, 4, 4, 5};
        Set<Integer> sumSet = new HashSet<>();
        int sum = 0;
        for (int num : arr2) {
            sumSet.add(num);
        }
        for (int num : sumSet) {
            sum += num;
        }
        System.out.println("b. Tổng các phần tử không trùng lặp: " + sum);

        // c. Tìm các phần tử chung trong hai mảng
        int[] arr3 = {1, 2, 3, 4, 5};
        int[] arr4 = {3, 4, 5, 6, 7};
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int num : arr3) set1.add(num);
        for (int num : arr4) set2.add(num);

        set1.retainAll(set2); // giữ lại phần tử chung
        System.out.println("c. Các phần tử chung: " + set1);

        // d. Tìm phần tử lớn nhất và nhỏ nhất
        int[] arr5 = {10, 3, 25, 7, 15};
        Set<Integer> minMaxSet = new HashSet<>();
        for (int num : arr5) {
            minMaxSet.add(num);
        }
        int min = Collections.min(minMaxSet);
        int max = Collections.max(minMaxSet);
        System.out.println("d. Min = " + min + ", Max = " + max);
    }
}
