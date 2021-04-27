package Day06.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Demo5 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println(simpleDateFormat.format(date));

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) +1 ; //Java luon lay gia tri thang tu 0 nen phai cong them 1
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day of month: " + day);


        try {
            String s = "04/27/2020";
            SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("MM/dd/yyyy");
            Date date1 = simpleDateFormat1.parse(s);
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd/MM/yyyy");
            System.out.println("Date: " + simpleDateFormat2.format(date1));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
