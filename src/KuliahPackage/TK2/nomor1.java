package KuliahPackage.TK2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class nomor1 {
    public static void main(String[] args) {
        DateFormater("");
        System.out.println("=================================================");
        System.out.print("a. ");
        DateFormater("h:mm");

        System.out.print("b. ");
        DateFormater("H:mm");

        System.out.print("c. ");
        DateFormater("H:mm:ss");

        System.out.print("d. ");
        DateFormater("h:mm:ss:SSS");

        System.out.print("e. ");
        DateFormater("h:mm a");

        System.out.print("f. ");
        DateFormater("EEEE");

        System.out.print("g. ");
        DateFormater("E");

        System.out.print("h. ");
        DateFormater("M");

        System.out.print("i. ");
        DateFormater("MMM");

        System.out.print("j. ");
        DateFormater("MMMM");

        System.out.print("k. ");
        DateFormater("yy");

        System.out.print("l. ");
        DateFormater("y");

    }

    private static void DateFormater(String dateFormat) {
        Date date = new Date();

        if (dateFormat == "") {
            System.out.println("Format date asli --> " + date);
        } else {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);
            System.out.println(dateFormat + " --> " + simpleDateFormat.format(date));
        }
    }
}
