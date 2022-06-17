package sample;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class MyDateTimeFormat {
    public static final DateTimeFormatter DEFAULT_FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    public static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    public static final DateTimeFormatter TIME_FORMAT = DateTimeFormatter.ofPattern("HH:mm:ss");
}


public class LocalDateFormatter {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("now = " + now);
        System.out.println(now.format(MyDateTimeFormat.DEFAULT_FORMAT));
        System.out.println(now.format(MyDateTimeFormat.DATE_FORMAT));
        System.out.println(now.format(MyDateTimeFormat.TIME_FORMAT));
    }

}

