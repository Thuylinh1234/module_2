package bai_3_student_tinh_bao_dong;

/**
 * Xây dựng lớp Student thỏa mãn tính bao đóng
 * Thông tin của học sinh bao gồm:
 *     id: Không được phép chỉnh sửa.
 *     name: Bắt buộc nhập.
 *     score: Phải nằm trong khoảng từ 0 đến 10.
 *     Nếu không thỏa mãn, hiển thị thông báo lỗi và không cho phép cập nhật thông tin.
 *     Gợi ý: id không cài đặt setter, name & score xét điều kiện ở setter.
 */
public class Student {
    private  int id;
    private String name;
    private int score;

    public Student(int id, String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("\nTên không được để trống!");
        } else {
            this.name = name;
        }
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        if (score >= 0 && score <= 10) {
            this.score = score;
        } else {
            System.out.println("\nĐiểm phải nằm trong khoảng 0 đến 10!");
        }
    }
}
