package quan_ly_thong_tin_sv;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student_1> students = new ArrayList<>();

        System.out.print("Nhập số lượng sinh viên: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.printf("\nNhập thông tin sinh viên thứ %d \n", i + 1);
            Student_1 student = new Student_1();
            student.input();
            students.add(student);
        }

        System.out.print("\nDANH SÁCH SINH VIÊN \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("Thông tin sinh viên thứ %d:\n", i + 1);
            students.get(i).output();
        }
    }
}
