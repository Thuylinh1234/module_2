package bai_3_student_tinh_bao_dong;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(1, "Thùy Linh", 8);

        System.out.println("Id: " + student.getId());
        System.out.println("Name: " + student.getName());
        System.out.println("Score: " + student.getScore());

        //thử nghiệm việc cập nhật thông tin qua các phương thức setter.
        student.setName("Linh");
        student.setScore(9);
        System.out.println("Sau khi cập nhật: ");
        System.out.printf("Id: " + student.getId());
        System.out.printf("\nName: " + student.getName());
        System.out.printf("\nScore: " + student.getScore());

        student.setName("Linh");
        student.setScore(11);

    }
}
