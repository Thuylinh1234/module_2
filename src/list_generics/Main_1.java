package list_generics;

public class Main_1 {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.addFirst("10");
        list.addFirst("20");
        list.addFirst("30");
        System.out.println(list);
    }
}
