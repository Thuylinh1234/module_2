package bai_tap_set_map;

public class MainBaiTap1 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 4, 5, 5, 6};
        int[] arr2 = {4, 5, 6, 7, 8};

        System.out.println("a. Loại bỏ trùng lặp ");
        Baitap1.removeDuplicates(arr1);

        System.out.println("\nb. Tính tổng phần tử không trùng lặp ");
        Baitap1.sumUnique(arr1);

        System.out.println("\nc. Phần tử chung ");
        Baitap1.findCommonElements(arr1, arr2);

        System.out.println("\n d. Min & Max ");
        Baitap1.findMinMax(arr1);
    }
}
