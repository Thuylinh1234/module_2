package bai_2_xay_dung_queue;

/**
 * Xây dựng lớp MyQueue với các chức năng sau.
 *     a. add(): thêm
 *     b. peek(): lấy ra xem
 *     c. poll(): lấy ra xem vào xóa
 *     d. isEmpty(): kiểm tra rỗng
 *     e. size(): trả về số lượng phần tử
 * @param <E>
 */
public class MyQueueArray<E> {
    private int capacity;          // dung lượng mảng
    private Object[] elementData;  // mảng lưu dữ liệu
    private int size;              // số phần tử hiện có

    private static final int DEFAULT_CAPACITY = 10;

    public MyQueueArray() {
        elementData = new Object[DEFAULT_CAPACITY];
        capacity = DEFAULT_CAPACITY;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    // Tự tăng capacity khi đầy
    private void ensureCapacity() {
        if (size == capacity) {
            capacity = (capacity == 0) ? 1 : capacity * 2;
            Object[] newArr = new Object[capacity];
            for (int i = 0; i < size; i++) {
                newArr[i] = elementData[i];
            }
            elementData = newArr;
        }
    }

    // a. add: thêm vào cuối hàng đợi
    public void add(E element) {
        ensureCapacity();
        elementData[size++] = element;
    }

    // b. peek: xem phần tử đầu tiên
    public E peek() {
        if (isEmpty()) {
            System.out.println("Queue rỗng!");
            return null;
        }
        return (E) elementData[0];
    }

    // c. poll: lấy và xóa phần tử đầu tiên
    public E poll() {
        if (isEmpty()) {
            System.out.println("Queue rỗng!");
            return null;
        }
        E front = (E) elementData[0];
        for (int i = 0; i < size - 1; i++) {
            elementData[i] = elementData[i + 1];
        }
        elementData[--size] = null; // tránh memory leak
        return front;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Queue: ");
        for (int i = 0; i < size; i++) {
            sb.append(elementData[i]).append(" ");
        }
        return sb.toString();
    }
}
