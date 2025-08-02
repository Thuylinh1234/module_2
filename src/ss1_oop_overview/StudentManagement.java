package ss1_oop_overview;

import java.util.ArrayList;

public class StudentManagement {
    public static void main(String[] args) {
        // Nhập số lượng học sinh
        int n = 2;
        ArrayList<Student> students = new ArrayList<>(n);
        Student student;
        for (int i = 0; i < n; i++){
            System.out.printf("\n\nNhập thông tin sinh viên thứ %d \n", i);
            student = new Student();
            student.input();
            students.add(student);
        }

        for (int i = 0; i < n; i++){
            System.out.printf("\n\nNhập thông tin sinh viên thứ %d \n", i );
            students.get(i - 1).output();
        }

//        Student s1 = new Student();
//        Student s2 = new Student();
//
//        System.out.println("Nhập thông tin nhân viên thứ 1: ");
//        s1.input();
//        System.out.println("Nhập thông tin nhân viên thứ 2: ");
//        s2.input();
//
//        System.out.println("thông tin nhân viên thứ 1: ");
//        s1.output();
//        System.out.println("thông tin nhân viên thứ 2: ");
//        s2.output();


//        Student s1 = new Student("Nguyễn Văn A", 15, "nam");
//        Student s2 = new Student("Nguyễn Văn B", 12, "nữ");
//
//        s1.output();;
//        s2.output();

    }
}
