package KuliahPackage.Thread;

import java.text.DateFormatSymbols;

public class DateTimeFormatting2 {
    public static void main(String[] args) {
        String[] shortMonths = new DateFormatSymbols().getShortMonths();
        String[] fullMonths = new DateFormatSymbols().getMonths();
        for (int i = 0; i < (shortMonths.length - 1); i++) {
            String shortMonth = shortMonths[i];
            String fullMonth = fullMonths[i];
            System.out.println("Short Months of " + fullMonth + " is " + shortMonth);
        }
    }
}
