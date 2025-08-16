package bai_2_static_oop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2;

        System.out.print("Nhập số thứ nhất: ");
        num1 = sc.nextDouble();
        do {
            System.out.print("Nhập số thứ hai: ");
            num2 = sc.nextDouble();

            if (num2 == 0) {
                System.out.println("Số b không được bằng 0. Nhập lại!");
            }
        } while (num2 == 0);


        double sum = MathUtil.add(num1, num2);
        double difference = MathUtil.subtract(num1, num2);
        double product = MathUtil.multiply(num1, num2);
        double quotient = MathUtil.divide(num1, num2);

        System.out.println("Tổng: " + sum);
        System.out.println("Hiệu: " + difference);
        System.out.println("Tích: " + product);
        System.out.println("Thương:  " + quotient);

    }
}
