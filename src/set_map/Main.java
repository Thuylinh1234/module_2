package set_map;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Student> students = new TreeSet<>();

        students.add(new Student(1, "Nguyễn Ngọc Quang", 5));
        students.add(new Student(2, "Nguyễn Ngọc A ", 3));
        students.add(new Student(3, "Nguyễn Ngọc B", 2));
        students.add(new Student(4, "Nguyễn Ngọc Ba", 2));
        students.add(new Student(5, "Nguyễn Ngọc Duy", 6));
        students.add(new Student(6, "Nguyễn Ngọc Duy", 6));
        students.add(new Student(7, "Nguyễn Ngọc Anh ", 3));

        System.out.println(students.size());
        for (Student student : students){
            System.out.println(student.getName() + " - " + student.getScore());
        }

    }
}
