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
    private int size;       // số phần tử add vào (Cho người dùng thấy)

    private int[] emptyArray = {};  // tái sử dụng nhiều lần

    public int size() {
        return size;
    }

    public MyArrayList() {
        elementData = emptyArray;
        capacity = 10;
    }

    // Hàm tự viết để tăng capacity khi cần
    private void ensureCapacity() {
        if (size == capacity) {
            if (capacity == 0) {
                capacity = 1;
            } else if (capacity == 1) {
                capacity = 2;
            } else {
                capacity = (int) (capacity * 1.5);
            }
            int[] newArr = new int[capacity];
            for (int i = 0; i < size; i++) {
                newArr[i] = elementData[i];
            }
            elementData = newArr;
        }
    }

    // a. add(int element): Thêm phần tử vào cuối
    public void add(int element) {
        if (elementData == emptyArray) {
            elementData = new int[capacity];
        }
        ensureCapacity();
        elementData[size] = element;
        size++;
    }

    // b. toString (): Trả về thông tin đối tượng
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < size; i++) {
            stringBuilder.append(elementData[i]).append("\t");
        }
        return stringBuilder.toString();
    }

    // c. add (int index, int element): Thêm phần tử vào vị trí index
    public void add(int index, int element) {
        if (index < 0 || index > size) {
            System.out.println("Index không hợp lệ");
            return;
        }
        ensureCapacity();
        for (int i = size; i > index; i--) {
            elementData[i] = elementData[i - 1];
        }
        elementData[index] = element;
        size++;
    }
    //d. set (int index, int element): Thay thế phần tử tại vị trí index
    public void set(int index, int element) {
        if (index < 0 || index >= size) {
            System.out.println("Index không hợp lệ!");
            return;
        }
        elementData[index] = element;
    }

    //e. get (int index): Trả về phần tử tại index
    public int get(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index không hợp lệ!");
            return -1;
        }
        return elementData[index];
    }
    //f. indexOf (int element): Lấy vị trí index phần tử đầu tiên tìm thấy
    public int indexOf(int element) {
        for (int i = 0; i < size; i++) {
            if (elementData[i] == element) {
                return i;
            }
        }
        return -1;
    }
    //g. lastIndexOf (int element o): Lấy vị trí index phần tử cuối cùng tìm thấy
    public int lastIndexOf(int element) {
        for (int i = size - 1; i >= 0; i--) {
            if (elementData[i] == element) {
                return i;
            }
        }
        return -1;
    }
    //h. remove (int index): Xóa phần tử lại vị trí index
    public void remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index không hợp lệ");
            return;
        }
        for (int i = index; i < size - 1; i++) {
            elementData[i] = elementData[i + 1];
        }
        size--;
    }
    //i. removeElement (int element): Xóa tất cả phần tử element
    public void removeElement(int element) {
        int newS = 0;
        for (int i = 0; i < size; i++) {
            if (elementData[i] != element) {
                elementData[newS++] = elementData[i];
            }
        }
        size = newS;
    }
}
