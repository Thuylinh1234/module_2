package bai_2_xay_dung_queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main_Link {
    public static void main(String[] args) {
        MyQueueLink<Integer> q = new MyQueueLink<>();

        q.push(10);
        q.push(20);
        q.push(30);

        System.out.println(q); // Queue: 10 20 30
        System.out.println("Peek: " + q.peek()); // 10
        System.out.println("Poll: " + q.pop()); // 10
        System.out.println(q); // Queue: 20 30
    }

}
