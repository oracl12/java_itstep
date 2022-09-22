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
public class Second {
    static final SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd");

    public static void main(String[] args) throws ParseException {
        String start = "1939-09-01";
        String end = "1945-09-02";
        Date startDate = dt.parse(start);
        Date endDate = dt.parse(end);

        System.out.println((endDate.getTime() - startDate.getTime()) / (24 * 60 * 60 * 1000) + 1);
    }
}
