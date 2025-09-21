package ss11_file.data;

import java.util.Scanner;

public class Student {
    private  int id;
    private String name;
    private double score;

    public Student() {
    }

    public Student(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public void output(){
        System.out.println("\nId: " + id);
        System.out.println("Tên: " + name);
        System.out.println("Điểm: " + score);
    }

    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập Id: ");
        id = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập tên: ");
        name = sc.nextLine();

        System.out.print("Nhập điểm : ");
        score = Double.parseDouble(sc.nextLine());

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String toString(){
        return String.format("%s,%s,%s", id,name,score);
    }

}

