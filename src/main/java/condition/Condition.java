package condition;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Condition {

    public static void condition33() {
        //Вычислите (x-(y)^0.5)^0.5, если x и y вводит пользователь. Перед вычислением выполнить проверку
        // на существование квадратных корней.
    }

    public static void condition34(int x) {
        //Дано число. Если оно больше 3, то увеличить число на 10, иначе уменьшить на 10.
        if (x > 3) {
            x = x + 10;
        } else {
            x = x - 10;
        }
        System.out.println("+10, если >3; иначе -10: " + x);
    }

    public static void condition35(int x) {
        //Дано число. Если оно меньше 7, то вывести Yes, если больше 10, то вывести No,
        // если равно 9, то вывести Error.
        String res = "";
        if (x < 7) {
            res = "Yes";
        } else if (x > 10) {
            res = "No";
        } else if (x == 9) {
            res = "Error";
        }
        System.out.println(res);
    }

    public static void condition36() {
        //Пользователь вводит номер месяца, вывести название месяца.
        System.out.println("Введите номер месяца для определения его названия: ");
        Scanner sc = new Scanner(System.in);
        int numberMonth = sc.nextInt();
        System.out.println(Month.of(numberMonth).getDisplayName(TextStyle.FULL_STANDALONE, Locale.forLanguageTag("ru")).toUpperCase());
    }

    public static void condition37(int x, int y) {
        //Дано два числа. Вывести наибольшее из них.
        int max = (x > y) ? x : y;
        System.out.println("Max =" + max);
    }

    public static void condition38(int x, int y) {
        //Дано два числа. Вывести yes, если они отличаются на 100, иначе вывести No.
        String bool;
        bool = (Math.abs(x - y) == 100) ? "Yes" : "No";
        System.out.println("Значения отличаются на 100: " + bool);
    }

    public static void condition39() {
//Даны два числа. Если первое число больше второго, то вывести yes, иначе поменять значения этих переменных
//и вывести их на экран
    }

    public static void condition40() {

    }

    public static void condition41() {

    }

    public static void condition42() {

    }

    public static void condition43() {
        //Пользователь вводит номер месяца. Вывести название поры года (весна, лето и тд)
        System.out.println("Введите номер месяца для определения поры года: ");
        Scanner sc = new Scanner(System.in);
        int numberMonth = sc.nextInt();
        switch (numberMonth) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Не существует такого месяца");
                break;
        }
    }

    public static void condition44() {

    }

    public static void condition45() {

    }

    public static void condition46() {

    }

    public static void condition47(int a, int b, int c) {
        //Даны три числа. Найдите наибольшее число из них.
        int max = 0;
        if (a > b) {
            if (a > c) {
                max = a;
            } else {
                max = c;
            }
        } else if (b > c) {
            max = b;
        } else {
            max = c;
        }
        System.out.println("Максимальное из " + a + ", " + b + ", " + c + ": " + max);
    }

    public static void condition48() {

    }

    public static void condition49() {

    }

    public static void condition50(int number1, int number2, int number3) {
        //Даны три числа. Написать "yes", если среди них есть одинаковые.
        if ((number1 == number2) || (number1 == number3) || (number2 == number3)) {
            System.out.println("yes");
        }
    }

    public static void condition55() {
        //Дано три числа. Найти количество положительных чисел среди них.
    }

    public static void condition60(int number) {
        //Дано трехзначное число. Переставьте первую и последнюю цифры.
        int a = number / 100;
        int z = number % 10;
        int b = (number - z - a * 100) / 10;
        System.out.println("Для трехзначного числа переставлены первая и последняя буква: " + (z * 100 + b * 10 + a));
    }

    public static void condition61(int number) {
        //Дано четырехзначное число. Определите, есть ли одинаковые цифры в нем.
        int a = number / 1000;
        int d = number % 10;
        int c = (number - d) / 10 % 10;
        int b = (number - d - c * 10) / 100 % 10;
        if ((a == b) || (a == c) || (a == d) || (b == c) || (b == d) || (c == d)) {
            System.out.println("В заданном числе есть одинаковые цифры: " + number);
        } else {
            System.out.println("В заданном числе нет одинаковых цифрр: " + number);
        }
    }

    public static void condition62() {
        //Дано пятизначное число. Цифры на четных позициях занулить. Н-р, из 12345 получается число 10305.
    }

    public static void condition63() {

    }

    public static void condition64(int number) {
        //Дано четырехзначное число. Если оно читается слева направо и справа налево одинаково, то вывести yes, иначе no
        int a = number / 1000;
        int d = number % 10;
        int c = (number - d) / 10 % 10;
        int b = (number - d - c * 10) / 100 % 10;
        String bool;
        bool = (number == d * 1000 + c * 100 + b * 10 + a) ? "yes" : "no";
        System.out.println(bool);
    }

    public static void condition65(int number) {
        //Дано четырехзначное число. Переставьте местами так, чтобы сначала оказались цифры, меньше пяти.

    }

    public static void condition66(int number1, int number2) {
        //Даны два трехзначных числа. Получите новое число присоединением второго числа справа к первому без
        //последних цифр у каждого. Например, 123 и 456 Ответ: 1245
        number1 = number1 / 10;
        number2 = number2 / 10;
        System.out.println(number1 * 100 + number2);
    }

    public static void condition67(int number) {
        //Дано четырехзначное число. Поменяйте местами наименьшую и наибольшую цифры.
        int a = number / 1000;
        int b = (number - a * 1000) / 100;
        int d = number % 10;
        int c = (number - d) / 10 % 10;
        System.out.println("Введенное число: " + a + b + c + d);
        int[] massiv = new int[]{a, b, c, d};
        int imax = 0;
        int imin = 0;
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] > massiv[imax]) {
                imax = i;
            } else if (massiv[i] < massiv[imin]) {
                imin = i;
            }
        }
        int z = massiv[imax];
        massiv[imax] = massiv[imin];
        massiv[imin] = z;
        System.out.println("Новое число: " + massiv[0] + massiv[1] + massiv[2] + massiv[3]);
    }

    public static void condition68() {

    }

    public static void condition69() {

    }

    public static void condition70() {

    }

    public static void condition71() {

    }

    public static void condition72() {

    }

    public static void condition73() {

    }

    public static void condition74() {

    }

    public static void all() {
        System.out.println("\nЗадание 34");
        Condition.condition34(5);
        Condition.condition34(2);
        System.out.println("\nЗадание 35");
        Condition.condition35(4);
        Condition.condition35(11);
        Condition.condition35(9);
        System.out.println("\nЗадание 36");
        //  Condition.condition36();
        System.out.println("\nЗадание 37");
        Condition.condition37(70, 50);
        System.out.println("\nЗадание 38");
        Condition.condition38(13, 113);
        System.out.println("\nЗадание 39");
        System.out.println("\nЗадание 43");
        //  Condition.condition43();
        System.out.println("\nЗадание 47");
        Condition.condition47(10, 2, 3);
        Condition.condition47(1, 20, 3);
        Condition.condition47(1, 2, 30);
        System.out.println("\nЗадание 48");
        System.out.println("\nЗадание 50");
        Condition.condition50(10,20,10);
        System.out.println("\nЗадание 53");
        System.out.println("\nЗадание 54");
        System.out.println("\nЗадание 55");
        System.out.println("\nЗадание 58");
        System.out.println("\nЗадание 59");
        System.out.println("\nЗадание 60");
        Condition.condition60(123);
        System.out.println("\nЗадание 61");
        Condition.condition61(1234);
        Condition.condition61(1214);
        System.out.println("\nЗадание 64");
        Condition.condition64(1234);
        Condition.condition64(1221);
        System.out.println("\nЗадание 66");
        Condition.condition66(123, 456);
        System.out.println("\nЗадание 67");
        Condition.condition67(5710);
    }
}
