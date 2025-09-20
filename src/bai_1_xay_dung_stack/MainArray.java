package bai_1_xay_dung_stack;

public class MainArray { public static void main(String[] args) {
    MyStackArray<Integer> stack = new MyStackArray<>();

    stack.push(10);
    stack.push(20);
    stack.push(30);

    System.out.println(stack); // Stack: 10 20 30

    System.out.println("Peek: " + stack.peek()); // 30
    System.out.println("Pop: " + stack.pop());   // 30

    System.out.println(stack); // Stack: 10 20
}

}
