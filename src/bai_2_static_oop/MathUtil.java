package bai_2_static_oop;

/**
 * Viết một lớp MathUtil chứa các phương thức tĩnh (static) để thực hiện các chức năng sau:
 * <p>
 * Cộng 2 số.
 * Trừ 2 số.
 * Nhân 2 số.
 * Chia 2 số.
 */
public class MathUtil {
    // cộng
    public static double add(double a, double b) {
        return a + b;
    }

    // trừ
    public static double subtract(double a, double b) {
        return a - b;
    }

    // nhân
    public static double multiply(double a, double b) {
        return a * b;
    }

    // chia
    public static double divide(double a, double b) {
        return a / b;
    }
}
