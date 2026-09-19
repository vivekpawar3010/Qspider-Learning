package Utilities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JavaUtility {

    // =====================================================
    // DYNAMIC NAME WITH DATE AND TIME
    // =====================================================

    public static String dynamicNameWithDateTime(String name) {

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern(
                        "yyyy-MM-dd_HH-mm-ss"
                );

        String datetime =
                LocalDateTime.now().format(formatter);

        return name + "_" + datetime;
    }

    // =====================================================
    // TODAY'S DATE
    // =====================================================

    public static String todaydate(String pattern) {

        LocalDate date =
                LocalDate.now();

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern(pattern);

        return date.format(formatter);
    }

    // =====================================================
    // FUTURE DATE
    // =====================================================

    public static String plusDate(
            long days,
            String pattern) {

        LocalDate date =
                LocalDate.now();

        LocalDate plus =
                date.plusDays(days);

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern(pattern);

        return plus.format(formatter);
    }
}