package bai_1_dsa_list;

/**
 * Xây dựng lớp MyArrayList với các chức năng sau:
 * a. add (int element): Thêm phần tử element vào cuối.
 * b. toString (): Trả về thông tin đối tượng
 * c. add (int index, int element): Thêm phần tử vào vị trí index
 * d. set (int index, int element): Thay thế phần tử tại vị trí index
 * e. get (int index): Trả về phần tử tại index
 * f. indexOf (int element): Lấy vị trí index phần tử đầu tiên tìm thấy
 * g. lastIndexOf (int element o): Lấy vị trí index phần tử cuối cùng tìm thấy
 * h. remove (int index): Xóa phần tử lại vị trí index
 * i. removeElement (int element): Xóa tất cả phần tử element
 */
public class MyArrayList {
    private int capacity;   // kích thước thực tế (Không cho người dùng biết)
    private int[] elementData;      // Mảng lưu dữ liệu
    private int size;       // số phần thử add vào (Cho người dùng thấy)

    private int[] emptyArray = {};  // tái sử dụng nhiều lần

    public int size() {
        return size;
    }

    public MyArrayList() {
        emptyArray = elementData;
        capacity = 10;
    }

    // a. add(int element): Thêm phần tử vào cuối
    public void add(int element) {
        // trường hợp 1: size == capacity
        if (elementData == emptyArray) {
            capacity = 10;
            elementData = new int[capacity];
        }

        if (size == capacity) {
            // tránh trươờng hợp 0
            if (capacity == 0) {
                capacity = 1;
            } else if (capacity == 1) {
                capacity = 2;
            } else {
                // tạo ra mảng mới gấp 50%
                capacity = (int) (capacity * 1.5);
            }
//            if (capacity == size) { // tránh trường hợp capacity = 0,1
//                capacity++;
//            }
            int[] temp = new int[capacity];

            // đổ dữ liệu qua mảng mới
            for (int i = 0; i < elementData.length; i++) {
                temp[i] = elementData[i];
            }

            // tham chiếu tới vùng nhớ mới
            elementData = temp;

            // trường hợp 2: size < capacity
            elementData[size] = element;
            size++;
        }

    }

    //b. toString (): Trả về thông tin đối tượng
    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < size; i++) {
            stringBuilder.append(elementData[i]).append("\t");
        }
        return stringBuilder.toString();

//        if (size == 0) {
//            return "[]";
//        }
//        StringBuilder sb = new StringBuilder("[");
//        for (int i = 0; i < size; i++) {
//            sb.append(elementData[i]);
//            if (i < size - 1) {
//                sb.append(", ");
//            }
//        }
//        sb.append("]");
//        return sb.toString();
    }

    //c. add (int index, int element): Thêm phần tử vào vị trí index
}
