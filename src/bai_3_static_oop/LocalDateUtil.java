package bai_3_static_oop;

import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 * Tạo một lớp LocalDateUtil gồm các phương thức tĩnh (static) để thực hiện các chức năng sau:
 *
 * Chuyển đổi chuỗi với định dạng dd/MM/yyyy sang LocalDate.
 * Chuyển đổi chuỗi với định dạng yyyy/MM/dd sang LocalDate.
 * Chuyển đổi LocalDate với định dạng sang chuỗi với định dạng dd/MM/yyyy.
 * Chuyển đổi LocalDate với định dạng sang chuỗi với định dạng yyyy/MM/dd.
 */
public class LocalDateUtil {
   public static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
   public static DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    public static void fromString_ddMMyyyy(String date) {
        try {
            LocalDate localDate = LocalDate.parse(date, formatter);
            System.out.println("LocalDate (dd/MM/yyyy): " + localDate);
        } catch (DateTimeParseException e) {
            System.out.println("Sai định dạng ngày dd/MM/yyyy: " + date);
        }
    }


    public static void fromString_yyyyMMdd(String date) {
        try {
            LocalDate localDate = LocalDate.parse(date, formatter1);
            System.out.println("LocalDate (yyyy/MM/dd):  " + localDate);
        } catch (DateTimeParseException e) {
            System.out.println("Sai định dạng ngày yyyy/MM/dd: " + date);
        }
    }


    public static void toString_ddMMyyyy(LocalDate date) {
        if (date == null) {
            System.out.println("Nhập sai, không định dạng được");
            return;
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("dd/MM/yyyy:  " + date.format(formatter));
    }


    public static void toString_yyyyMMdd(LocalDate date) {
        if (date == null) {
            System.out.println("Nhập sai, không định dạng được");
            return;
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        System.out.println("yyyy/MM/dd:  " + date.format(formatter));
    }
}
