package ss2_constructor.constructor;

public class StudentManagement {
    public static void main(String[] args) {
//        System.out.println("Hello world");
//
//        Student s1 = new Student("Nam", 12, "Nam");
//        s1.output();

        Student student = new Student();
        student.setName("Nguyễn Văn A");
        System.out.println("Tên: " + student.getName());


    }
}
