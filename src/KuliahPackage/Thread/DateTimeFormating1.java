package KuliahPackage.Thread;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeFormating1 {
    public static void main(String[] args) {
        Date date = new Date();
        String dateFormat = "HH:mm:ss a";

        SimpleDateFormat humanDate = new SimpleDateFormat(dateFormat);
        System.out.println("Now : " + humanDate.format(date));
    }
}
