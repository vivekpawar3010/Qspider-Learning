package UtilityClasses;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JavaUtility {
	
    public static String dynamicNameWithDateTime(String name){
        String datetime = LocalDateTime.now().toString().replace(':', '-');
        return name+datetime;
    }
    
    public static String todayDate(String pattern){
        LocalDate date= LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return date.format(formatter);
    }
    
    public static String plusDate(long days, String pattern){
        LocalDate date= LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        LocalDate plus = date.plusDays(days);
        return plus.format(formatter);
    }
        
}