package set_map;


import java.util.Objects;

public class Student implements Comparable<Student> {

    private int id;
    private String name;
    private int score;

    // Constructor
    public Student(int id, String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    // Getters & Setters
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return id == student.id && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public int compareTo(Student o){
        /*
        = 0 : 2 phần tử giống nhau
        < 0 : phần tử trước lớn hơn phần tử sau => hoán vị
        > 0 : phần tử sau lớn hơn phần tử trước => ko cần hoán vị
         */

//        if (this.score > o.score){
//            return  -1;
//        } else if (this.score == o.score){
//            return 0;
//        }else {
//            return  1;
//        }

        // sắp sắp theo điểm
        int scoreCompare = Double.compare(this.score, o.score);
        if (scoreCompare != 0){
            return scoreCompare; // điểm khác nhau rồi => cứ sắp xếp bth
        }
        // Điểm giống nhau => so sánh theo tên
        return  this.name.compareTo(o.name); // Nếu tên và điểm trùng nhau => Loại bỏ theo đặc điểm

    }
}
