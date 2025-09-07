package list_generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
//        ArrayList<String> arrayList = new ArrayList<>();
//
//        arrayList.add("Hello");
//        arrayList.add("Apple");
//
//        System.out.println(arrayList);
//    }
        Queue<Integer> queue = new LinkedList<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);

        while (!queue.isEmpty()){
            System.out.println(queue.remove());
        }

    }
}
