package bai_2_dsa_list;

public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);

//        list.addLast(20);
//        list.addLast(30);
//        list.add(3, 40);

        System.out.println(list);
        System.out.println(list.size());
        MyLinkedList emptyList = new MyLinkedList();
        emptyList.addLast(5);
        System.out.println("Danh sách rỗng sau khi thêm: " + emptyList.toString());
    }
}
