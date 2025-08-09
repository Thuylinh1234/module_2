package bai_3_static_oop;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate dateExample = LocalDate.of(2025, 12, 14);

        LocalDateUtil.fromString_ddMMyyyy("14/12/2025");
        LocalDateUtil.fromString_yyyyMMdd("2025/12/14");
        LocalDateUtil.toString_ddMMyyyy(dateExample);
        LocalDateUtil.toString_yyyyMMdd(dateExample);
    }
}
