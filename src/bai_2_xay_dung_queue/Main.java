package bai_2_xay_dung_queue;

public class Main {
    public static void main(String[] args) {
        MyQueueArray<Integer> q = new MyQueueArray<>();

        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println(q); // Queue: 10 20 30
        System.out.println("Peek: " + q.peek()); // 10
        System.out.println("Poll: " + q.poll()); // 10
        System.out.println(q); // Queue: 20 30
    }
}
