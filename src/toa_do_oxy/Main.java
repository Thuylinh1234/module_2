package toa_do_oxy;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point();

        System.out.println("Nhập tọa độ thứ nhất: ");
        p1.input();

        System.out.println("Nhập tọa đồ thứ 2: ");
        p2.input();

        double d = p1.distanceTo(p2);
        System.out.println("Khoảng cách giữa 2 điểm là: " + d);
    }
}
