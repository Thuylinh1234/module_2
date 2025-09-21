package xu_ly_file;

import java.io.IOException;
import java.io.*;

/**
 * a. Viết chương trình đọc vào tất cả các dòng của 1 file. Sau đó hiển thị tất cả thông tin đọc được trên cùng 1 dòng.
 * <p>
 * b. Viết chương trình đọc vào đúng 3 dòng của 1 file. Sau đó hiển thị các dòng đọc được ra màn hình console.
 * <p>
 * c. Viết chương trình đếm số lần xuất hiện của 1 từ nào đó trong 1 file. Mỗi từ được đặt ở trên 1 dòng của file.
 * <p>
 * d. Viết chương trình kiểm tra xem 1 đường dẫn đang chỉ đến 1 file hay 1 thư mục.
 * <p>
 * e. Viết chương trình xóa 1 file hoặc 1 thư mục cho trước.
 * <p>
 * f. Viết chương trình đổi tên 1 file hoặc 1 thư mục cho trước.
 */
public class XuLyFile {
    // a. Đọc tất cả các dòng trong file rồi in ra trên cùng 1 dòng
    public static void readAllLinesInOne(String path) throws IOException {
        File file = new File(path);
        FileReader fileReader = new FileReader(file.toString());
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        StringBuilder result = new StringBuilder();
        while ((line = bufferedReader.readLine()) != null) {
            result.append(line).append(" ");
        }
        bufferedReader.close();

        System.out.println("Nội dung file (trên 1 dòng):");
        System.out.println(result.toString().trim());
    }
    // b. Đọc đúng 3 dòng đầu của file
    public static void readFirst3Lines(String path) throws IOException {
        File file = new File(path);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        int count = 0;
        System.out.println("3 dòng đầu của file:");
        while ((line = bufferedReader.readLine()) != null && count < 3) {
            System.out.println(line);
            count++;
        }
        bufferedReader.close();
    }

    // c. Đếm số lần xuất hiện của 1 từ trong file (mỗi từ nằm trên 1 dòng)
    public static void countWord(String path, String word) throws IOException {
        File file = new File(path);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        int count = 0;
        while ((line = bufferedReader.readLine()) != null) {
            if (line.contains(word)) {
                count++;
            }
        }
        bufferedReader.close();

        System.out.println("Số lần xuất hiện của từ \"" + word + "\": " + count);
    }

    // d. Kiểm tra đường dẫn là file hay thư mục
    public static void checkPath(String path) {
        File file = new File(path);
        if (file.exists()) {
            if (file.isFile()) {
                System.out.println(path + " là file.");
            } else if (file.isDirectory()) {
                System.out.println(path + " là thư mục.");
            }
        } else {
            System.out.println("Đường dẫn không tồn tại!");
        }
    }

    // e. Xóa file hoặc thư mục
    public static void deletePath(String path) {
        File file = new File(path);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("Đã xóa thành công: " + path);
            } else {
                System.out.println("Không thể xóa: " + path);
            }
        } else {
            System.out.println("Đường dẫn không tồn tại!");
        }
    }

    // f. Đổi tên file hoặc thư mục
    public static void renamePath(String oldPath, String newPath) {
        File oldFile = new File(oldPath);
        File newFile = new File(newPath);

        if (oldFile.exists()) {
            if (oldFile.renameTo(newFile)) {
                System.out.println("Đổi tên thành công: " + newPath);
            } else {
                System.out.println("Không thể đổi tên!");
            }
        } else {
            System.out.println("Đường dẫn cũ không tồn tại!");
        }
    }
}

