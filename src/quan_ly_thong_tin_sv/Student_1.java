package quan_ly_thong_tin_sv;

import java.util.Scanner;

/*
Viết chương trình cho phép nhập thông tin học sinh,
 bao gồm: tên học sinh, điểm toán, và điểm văn. Tính điểm trung bình và hiển thị kết quả.
 */
public class Student_1 {
    String name;
    double mathScore;
    double literatureScore;

    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tên: ");
        name = sc.nextLine();

        System.out.print("Nhập điểm toán: ");
        mathScore = Double.parseDouble(sc.nextLine());

        System.out.print("Nhập điểm văn: ");
        literatureScore = Double.parseDouble(sc.nextLine());
    }

    double calculateAverageScore(){
        return (mathScore + literatureScore) / 2;
    }

    void output(){
        System.out.println("Tên: " + name);
        System.out.println("Điểm toán: " + mathScore);
        System.out.println("Điểm Văn: " + literatureScore);
        System.out.println("Điểm trung bình: " + calculateAverageScore());
    }
}
