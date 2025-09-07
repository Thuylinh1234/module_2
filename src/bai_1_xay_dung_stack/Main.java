package bai_1_xay_dung_stack;

public class Main {
    public static void main(String[] args) {
        MyStackArray<String> stack = new MyStackArray<>();

        stack.push("10");
        stack.push("20");
        stack.push("30");

        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }


    }
}
