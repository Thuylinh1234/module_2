package bai_1_dsa_list;

public class Main {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);

        System.out.println(list); // [10, 20, 30, 20]

        list.add(1, 15);
        System.out.println(list); // [10, 15, 20, 30, 20]

        list.set(2, 25);
        System.out.println(list); // [10, 15, 25, 30, 20]

        System.out.println("get(3): " + list.get(3)); // 30
        System.out.println("indexOf(20): " + list.indexOf(20)); // 4
        System.out.println("lastIndexOf(20): " + list.lastIndexOf(20)); // 4

        list.remove(1);
        System.out.println(list); // [10, 25, 30, 20]

        list.removeElement(20);
        System.out.println(list); // [10, 25, 30]
    }
}
