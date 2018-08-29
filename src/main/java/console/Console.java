package console;

import java.security.InvalidParameterException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Console {

    public static void consoleText() {
        /*Вывести на экран текст "Silence is golden" */
        System.out.println("Silence is golden");
    }

    public static void dataToday() {
        /*Вывести на экран текущее название дня недели, название месяца и свое имя.
        Каждое слово должно быть в отдельной строке.*/
        java.util.Calendar calendar = java.util.Calendar.getInstance(java.util.TimeZone.getDefault(), java.util.Locale.getDefault());
        calendar.setTime(new java.util.Date());
        String monthToday = Month.of(calendar.get(java.util.Calendar.MONTH)+1).getDisplayName(TextStyle.FULL_STANDALONE, Locale.forLanguageTag("ru"));
        String dayToday= calendar.getDisplayName(Calendar.DAY_OF_WEEK,Calendar.LONG, new java.util.Locale("RU"));
        System.out.println("День недели: " + dayToday.toUpperCase() + ";" +" Месяц: " +monthToday.toUpperCase()  + "; Имя: Робот");
    }

    public static void nullLine() {
        /*Вывести на экран пять строк из нулей, причем количество нулей в каждой строке равно номеру строки*/
        String myNull = "0";
        System.out.println(myNull);
        for (int i = 2; i <= 5; i++) {
            myNull = myNull.concat("0");
            System.out.println(myNull);
        }
    }

    public static void rectangle() {
        /*Вывести на экран прямоугольник, заполненный буквами А.
        Количество строк в прямоугольнике равно 5, количество столбцов равно 8.*/

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("A");
            }
            System.out.println();
        }
    }

    public static void w() {
        /*Вывести на экран букву "W" из символов  "*" (звездочка)*/

    }

    public static void rez() {
        /*Вывести на экран результат вычисления 1+2-4*/
    }
}