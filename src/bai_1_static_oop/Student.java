package bai_1_static_oop;

/**
 * Viết một lớp Student đại diện cho sinh viên, bao gồm các thông tin sau:
 *
 * Mã số sinh viên
 * Tên
 * Điểm
 * Sử dụng biến tĩnh (static) để đếm số lượng sinh viên đã được tạo ra và viết phương thức tĩnh để truy xuất số lượng sinh viên.
 */
public class Student {
    private  int id;
    private String name;
    private int score;
    private static int studentCount = 0;

    public Student(int id, String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
        studentCount++;
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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public static int getStudentCount(){
        return studentCount;
    }
}
