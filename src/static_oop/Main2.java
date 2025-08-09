package static_oop;

import bai_1_static_oop.Student;

import java.util.ArrayList;

public class Main2 {
    static ArrayList<Student> students = new ArrayList<>();
     static { // Khối static : khởi tạo giá trị cho biển static (static chạy trước main)
         students.add(new Student(1, "Nguyễn Văn A", 8));
     }

    public static void main(String[] args) {

    }
}
