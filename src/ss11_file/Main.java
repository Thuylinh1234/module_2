package ss11_file;

import ss11_file.data.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
    showList();
    CreateList();
    showList();
    }

    public  static void showList() throws IOException {
        //Bước 1: Đọc dữ liệu từ file đưa vào list Student
        File file = new File("src/ss11_file/data/student/student.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        Student student;
        List<Student> students = new ArrayList<>();
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line); //
            String[] info = line.split(",");
            students.add(new Student(Integer.parseInt(info[0]), info[1],
                    Double.parseDouble(info[2])));
        }

        bufferedReader.close();
        fileReader.close();

        // Bước 2: Show List
        for (int i = 0; i < students.size(); i++) {
            System.out.printf(" \nThông tin sinh viên thứ %d", i + 1);
            students.get(i).output();

        }
    }
        // Tạo mới
        public  static void CreateList() throws IOException {
            //Bước 1: Đọc dữ liệu từ file đưa vào list Student
            File file = new File("src/ss11_file/data/student/student.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            Student student;
            List<Student> students = new ArrayList<>();
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line); //
                String[] info = line.split(",");
                students.add(new Student(Integer.parseInt(info[0]), info[1],
                        Double.parseDouble(info[2])));
            }

            bufferedReader.close();
            fileReader.close();

            // Bước 2: Thêm Student vào List
            Student student1 = new Student();
            student1.input();
            students.add(student1);

            // Bước 3 : Write toàn bộ list student vào file
             file = new File("src/ss11_file/data/student/student.txt");
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (Student s : students){
                bufferedWriter.write(s.toString() + "\n");
            }

            bufferedWriter.close();
            fileWriter.close();

    }
}
