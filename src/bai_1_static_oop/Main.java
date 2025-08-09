package bai_1_static_oop;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(1, "Thùy Linh", 8);
        Student student2 = new Student(2, "Tường Vy", 8);
        Student student3 = new Student(3, "Phước Lợi", 8);

        System.out.println("Số lượng: " + Student.getStudentCount());
    }
}
