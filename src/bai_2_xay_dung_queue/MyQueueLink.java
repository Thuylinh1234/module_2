package bai_2_xay_dung_queue;

/**
 *  * Xây dựng lớp MyQueue với các chức năng sau.
 *  *     a. add(): thêm
 *  *     b. peek(): lấy ra xem
 *  *     c. poll(): lấy ra xem vào xóa
 *  *     d. isEmpty(): kiểm tra rỗng
 *  *     e. size(): trả về số lượng phần tử
 *  * @param <E>
 */
public class MyQueueLink<E> {
    private class Node {
        E value;
        Node next;

        public Node(E value) {
            this.value = value;
        }
    }

    Node head;
    Node tail;
    private int size;

    public int size() {
        return size;
    }

    // a. push(): thêm
    public void push(E element) {
        Node newNode = new Node(element);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    //   b. peek(): lấy ra xem
    public E peek() {
        return (head == null) ? null : head.value;
    }
    //  c. pop(): lấy ra xem và xóa
    public E pop() {
        if (head == null) return null;

        E value = head.value;
        head = head.next;

        if (head == null) {
            tail = null;
        }
        size--;
        return value;
    }

    //  d. isEmpty(): kiểm tra rỗng
    public boolean isEmpty() {
        return size == 0;
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Node temp = head;
        while (temp != null) {
            stringBuilder.append(temp.value).append("\t");
            temp = temp.next;
        }
        return stringBuilder.toString();
    }

}
