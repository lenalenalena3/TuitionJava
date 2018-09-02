package console;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.Calendar;
import java.util.Locale;

public class Console {
    public static void consoleText() {
        /*Вывести на экран текст "Silence is golden" */
        System.out.println("Silence is golden");
    }

    public static void dataToday() {
        /*Вывести на экран текущее название дня недели, название месяца и свое имя.
        Каждое слово должно быть в отдельной строке.*/
        Calendar cdar = Calendar.getInstance();
        String cdarMonth = Month.of(cdar.get(Calendar.MONTH) + 1).getDisplayName(TextStyle.FULL_STANDALONE, Locale.forLanguageTag("ru"));
        String cdarDayOfWeek = cdar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.forLanguageTag("ru"));
        System.out.println("День недели: " + cdarDayOfWeek.toUpperCase() + ";" + " Месяц: " + cdarMonth.toUpperCase() + "; Имя: Робот");
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
        System.out.println("*     *     *\n *   * *   * \n  * *   * *  \n   *     *   ");

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 13; j++) {
                if (((i == 1) && ((j == 1) || (j == 7) || (j == 13)))
                        ||
                        ((i == 2) && ((j == 2) || (j == 6) || (j == 8) || (j == 12)))
                        ||
                        ((i == 3) && ((j == 3) || (j == 5) || (j == 9) || (j == 11)))
                        ||
                        ((i == 4) && ((j == 4) || (j == 10)))) {
                    System.out.print("*");
                } else System.out.print(" ");
            }
            System.out.println();
        }


    }

    public static void rez() {
        /*Вывести на экран результат вычисления 1+2-4*/
        System.out.println(1 + 2 - 4);
    }

    public static void all() {
        System.out.println("\nЗадание 1");
        Console.consoleText();
        System.out.println("\nЗадание 2");
        Console.dataToday();
        System.out.println("\nЗадание 3");
        Console.nullLine();
        System.out.println("\nЗадание 4");
        Console.rectangle();
        System.out.println("\nЗадание 5");
        Console.w();
        System.out.println("\nЗадание 6");
        Console.rez();
    }

    public static void decomposePrimeNumbers(int x) {
        //  System.out.println(x+" = ");
    //    System.out.println("Этап 1 " + x);
        for (int i = 2; i <= x; i++) {
      //      System.out.println("Этап 2 цикл начало " + x + "; " + i + "; " + x + "%" + i + "=" + x % i);
            if (x % i == 0) {
       //         System.out.println("Этап 3 делится без остатка");
         //       System.out.println("Этап 4 находим остаток " + x + " / " + i);
                System.out.print(i+" ");
                x = x / i;
       //         System.out.println("Этап 5 остаток " + x);
                decomposePrimeNumbers(x);
                break;
            }
        }
    }
}
