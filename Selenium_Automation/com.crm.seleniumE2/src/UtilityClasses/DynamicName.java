package UtilityClasses;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DynamicName {

    public static String todayDate(String pattern) {
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern(pattern);

        return today.format(formatter);
    }

    public static String plusDate(String pattern, int days) {
        LocalDate date = LocalDate.now().plusDays(days);
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern(pattern);

        return date.format(formatter);
    }
}