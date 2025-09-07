package list_generics;

public class MyLinkedList <E>{

    private class Node {
        E value;
        Node next;

        public Node(E value) {
            this.value = value;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public int size() {
        return size;
    }

    // a. addFirst(E element)
    public void addFirst(E element) {
        Node newNode = new Node(element);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    // b. toString()
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

    // c. addLast(E element)
    public void addLast(E value) {
        Node newNode = new Node(value);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    // d. add(int index, E element)
    public void add(int index, E element) {
        if (index < 0 || index > size) {
            System.out.println("Index không hợp lệ");
            return;
        }
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

    // e. removeFirst()
    public E removeFirst() {
        if (head == null) return null;

        E value = head.value;
        head = head.next;

        if (head == null) {
            tail = null;
        }
        size--;
        return value;
    }

    // f. removeLast()
    public E removeLast() {
        if (tail == null) return null;

        if (head == tail) {
            E value = head.value;
            head = tail = null;
            size--;
            return value;
        }

        Node prev = head;
        while (prev.next != tail) {
            prev = prev.next;
        }

        E value = tail.value;
        tail = prev;
        tail.next = null;
        size--;
        return value;
    }

    // g. remove(int index)
    public E remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index ko hợp lệ");
            return null;
        }
        if (index == 0) return removeFirst();
        if (index == size - 1) return removeLast();

        Node prev = head;
        for (int i = 0; i < index - 1; i++) {
            prev = prev.next;
        }
        E value = prev.next.value;
        prev.next = prev.next.next;
        size--;
        return value;
    }

    // h. getFirst()
    public E getFirst() {
        return (head == null) ? null : head.value;
    }

    // i. getLast()
    public E getLast() {
        return (tail == null) ? null : tail.value;
    }

    // j. get(int index)
    public E get(int index) {
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

    // k. set(int index, E element)
    public void set(int index, E value) {
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

    // l. indexOf(E element)
    public int indexOf(E element) {
        Node current = head;
        int index = 0;
        while (current != null) {
            if (current.value.equals(element)) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    // m. lastIndexOf(E element)
    public int lastIndexOf(E element) {
        Node current = head;
        int index = 0;
        int lastIndex = -1;
        while (current != null) {
            if (current.value.equals(element)) {
                lastIndex = index;
            }
            current = current.next;
            index++;
        }
        return lastIndex;
    }
}
