package bai_2_dsa_list;

/**
 * Xây dựng lớp MyLinkedList với các chức năng sau:
 *     a. addFirst (int element)
 *     b. toString (): Trả về thông tin đối tượng
 *     c. addLast (int element)
 *     d. add (int index, int element)
 *     e. removeFirst ()
 *     f. removeLast ()
 *     g. remove (int index)
 *     h. getFirst ()
 *     i. getLast ()
 *     j. get (int index)
 *     k. set (int index, int element)
 *     l. indexOf (int element)
 *     m. lastIndexOf (int element)
 */
public class MyLinkedList {

    private class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

   private Node head;
   private Node tail;
   private int size;

    public int size() {
        return size;
    }

    //a. addFirst (int element)
    public void addFirst(int element) {
        Node newNode = new Node(element);
        if (head == null) { // trường hợp danh sách rỗng
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }
    //b. toString (): Trả về thông tin đối tượng
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

    // c. addLast(int element)
    public void addLast(int value) {
        Node newNode = new Node(value);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    // d. add (int index, int element)
    public void add(int index, int element) {
        if (index < 0 || index > size) ;
        if (index == 0) {
            addFirst(element);
        } else if (index == size) {
            addLast(element);
        } else {
            Node newNode = new Node(element);
            Node prev = head;
            for (int i = 0; i < index - 1; i++) {
                prev = prev.next;
            }
            newNode.next = prev.next;
            prev.next = newNode;
            size++;
        }
    }
    //e. removeFirst ()
    public Integer removeFirst() {
        if (head == null) {
            return null;
        }

        int value = head.value;
        head = head.next;

        if (head == null) {
            tail = null;
        }

        size--; // giảm kích thước
        return value; // trả về giá trị đã xóa
    }
    //f. removeLast ()
    public Integer removeLast() {
        if (tail == null) {
            return null;
        }
        if (head == tail) {
            int value = head.value;
            head = tail = null;
            size--;
            return value;
        }
        Node prev = head;
        while (prev.next != tail) {
            prev = prev.next;
        }
        int value = tail.value;
        tail = prev;
        tail.next = null;
        size--;
        return value;
    }
    //g. remove (int index)
    public Integer remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index ko hợp lệ");
            return null;
        }
        if (index == 0){
            return removeFirst();
        }
        if (index == size - 1){
            return removeLast();
        }

        Node prev = head;
        for (int i = 0; i < index - 1; i++) {
            prev = prev.next;
        }
        int value = prev.next.value;
        prev.next = prev.next.next;
        size--;
        return value;
    }
    //h. getFirst ()
    public Integer getFirst() {
        if (head == null){
            return null;
        }
        return head.value;
    }
    //i. getLast ()
    public Integer getLast() {
        if (tail == null){
            return null;
        }
        return tail.value;
    }
    //j. get (int index)
    public Integer get(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index ko hợp lệ");
            return null;
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.value;
    }
    //k. set (int index, int element)
    public void set(int index, int value) {
        if (index < 0 || index >= size) {
            System.out.println("Index ko hợp lệ");
            return;
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.value = value;
    }
    //l. indexOf (int element)
    public int indexOf(int element) {
        Node current = head;
        int index = 0;
        while (current != null) {
            if (current.value == element) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }
    //m. lastIndexOf (int element)
    public int lastIndexOf(int element) {
        Node current = head;
        int index = 0;
        int lastIndex = -1;
        while (current != null) {
            if (current.value == element){
                lastIndex = index;
            }
            current = current.next;
            index++;
        }
        return lastIndex;
    }


}
