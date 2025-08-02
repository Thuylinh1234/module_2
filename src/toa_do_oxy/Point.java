package toa_do_oxy;

import java.util.Scanner;

/**
 * Viết chương trình nhập vào tọa độ của hai điểm trong mặt phẳng OXY và tính khoảng cách giữa hai điểm đó.
 */
public class Point {
    double x;
    double y;

    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tọa độ x: ");
        x = sc.nextDouble();

        System.out.print("Nhập tọa độ y: ");
        y = sc.nextDouble();

    }
    double distanceTo(Point p){
        return Math.sqrt(Math.pow(p.x - x, 2) + Math.pow(p.y - y, 2));
    }
}
