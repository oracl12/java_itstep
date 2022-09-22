package program2_task8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
1.Вивести на екран дні тижня (Sunday, Monday, etc.) Вашого дня народження в наступні
5 років.
2.Визначити кількість днів тривалості Другої світової війни (враховувати дні початку
та завершення війни). sssss
*/
public class First {
    static final SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd");

    public static void main(String[] args) throws ParseException {
        String myBirthday = "2003-09-23";
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        Date date = dt.parse(myBirthday);

        for (int i = 0; i < 5; i++) {
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            cal.add(Calendar.YEAR, (i + (currentYear - (date.getYear() + 1900))));

            showDay(cal.get(Calendar.YEAR), cal.get(Calendar.DAY_OF_WEEK));
        }
    }

    public static void showDay(int birthdayDate, int numberDay) {
        switch (numberDay) {
            case (1) -> System.out.println(birthdayDate + " Sunday");
            case (2) -> System.out.println(birthdayDate + " Monday");
            case (3) -> System.out.println(birthdayDate + " Tuesday");
            case (4) -> System.out.println(birthdayDate + " Wednesday");
            case (5) -> System.out.println(birthdayDate + " Thursday");
            case (6) -> System.out.println(birthdayDate + " Friday");
            case (7) -> System.out.println(birthdayDate + " Saturday");
        }
    }
}
