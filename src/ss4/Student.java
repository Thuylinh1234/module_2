package ss4;

import java.util.Scanner;

public class Student extends Person {
    private double score;

    public Student() {
        super();
    }

    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào điểm: ");
        this.score = Double.parseDouble(sc.nextLine());
    }
}
