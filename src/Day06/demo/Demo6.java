package Day06.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Demo6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String date;

        System.out.print("Nhap ngay thang: ");
        date = scanner.nextLine();

        Date date_system = new Date();
        System.out.println(date);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
        System.out.println(simpleDateFormat.format(date_system));

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date_system);
        int year_system = calendar.get(Calendar.YEAR);
        int month_system = calendar.get(Calendar.MONTH);
        int day_system = calendar.get(Calendar.DAY_OF_MONTH);

        try {
            SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("MM/dd/yyyy");
            Date date1 = simpleDateFormat1.parse(date);
            Calendar calendar1 = Calendar.getInstance();
            calendar1.setTime(date1);

            int year_user = calendar1.get(Calendar.YEAR);
            int year_calculate = year_system - year_user;
            int month_user = calendar1.get(Calendar.MONTH);
            int day_user = calendar1.get(Calendar.DAY_OF_MONTH);

            if (year_calculate >= 18) {
                System.out.println("Du 18 tuoi");
            } else {
                System.out.println("Khong du 18 tuoi");
            }

            if (day_system == day_user && month_system == month_user) {
                System.out.println("Chuc mung sinh nhat");
            } else {
                System.out.println("Hom nay khong phai sinh nhat");
            }

        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
