package arithmetic;

import java.util.Scanner;

public class Arithmetic {
    public static void arithmetic7() {
        //Вычислите 1/2+1/4
        System.out.println("Значение выражения 1/2+1/4= " + ((double) 1 / 2 + (double) 1 / 4));
    }

    public static void arithmetic8() {
        //Вычислите значение выражения (a+4b)(a-3b)+a^2 при a=2, b=3
        int a = 2;
        int b = 3;
        System.out.println("Значение выражения (a+4b)(a-3b)+a^2, при a=2, b=3, при а= " + a + ", b= " + b + ", равно " + (a + 4 * b) * (a - 3 * b) + Math.pow(a, 2));
    }

    public static void arithmetic9() {
        //Вычислите |x|+x^5, если x=-2
        int x = -2;
        System.out.println("Значение выражения |x|+x^5, если x=-2 равно:" + (int) (Math.abs(x) + Math.pow(x, 5)));
    }

    public static void arithmetic10(double x) {
        //Вычислите значение выражения (x+1)^2+3(x+1) при а)x=1.7 б)x=3
        System.out.println("Значение выражения (x+1)^2+3(x+1), при x= " + x);
        System.out.println(Math.pow(x + 1, 2) + 3 * (x + 1));
    }

    public static void arithmetic10(int x) {
        //Вычислите значение выражения (x+1)^2+3(x+1) при а)x=1.7 б)x=3
        System.out.println("Значение выражения (x+1)^2+3(x+1), при x= " + x);
        System.out.println((int) Math.pow(x + 1, 2) + 3 * (x + 1));
    }

    public static void arithmetic11(double x) {
        //Вычислите значение выражения (|x-5|- sin x)/3+(x^2+2014)^(0.5)cos2x-3, при x=-2.34
        double a = (Math.abs(x - 5) - Math.sin(x)) / 3;
        double b = Math.pow(x, 2) + 2014;
        double c = Math.pow(b, 0.5);
        System.out.println("Значение выражения (|x-5|- sin x)/3+(x^2+2014)^(0.5)cos2x-3, при x= " + x);
        System.out.printf("%.5f", a + c * Math.cos(2 * x) - 3);
        System.out.println();
    }

    public static void arithmetic12(double x) {
        //Вычислите значение выражения e^(х-2)+|sin(x)|-x^10*cos(1/x) при x=3.6
        double a = Math.exp(x - 2);
        double b = Math.sin(x);
        double c = Math.abs(b);
        double d = Math.pow(x, 10) * Math.cos(1 / x);
        System.out.println("Значение выражения e^(х-2)+|sin(x)|-x^10*cos(1/x), при x= " + x);
        System.out.printf("%.5f", a + c - d);
        System.out.println();
    }

    public static void arithmetic13(double a, double b, int x) {
        //Вычислите значение выражения (x^2+b)^(1/5)-(b^2sin^3(x+a))/x, при а=0.1, b=0.2 и x=1
        double s = Math.pow(x, 2) + b;
        double ss = Math.pow(s, 1 / 5);
        double t = Math.pow(b, 2);
        double k = Math.sin(x + a);
        double kk = Math.pow(k, 3);
        System.out.println("Значение выражения (x^2+b)^(1/5)-(b^2sin^3(x+a))/x, при a= " + a + " b= " + b + " x= " + x);
        System.out.printf("%.5f", ss - (t * kk) / x);
        System.out.println();
    }

    public static void arithmetic14() {
        //Пользователь вводит два числа. Найдите сумму и произведение данных чисел
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число x: ");
        int x = sc.nextInt();
        System.out.println("Введите число y: ");
        int y = sc.nextInt();
        System.out.println("Сумма чисел: " + (x + y) + " Произведение чисел: " + x * y);
    }

    public static void arithmetic15() {
        //Пользователь вводит число. Выведите на экран квадрат этого числа, куб этого числа
        System.out.println("Введите число z (для определения квадрата, куба числа): ");
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();
        System.out.println("Квадрат числа: " + (int) Math.pow(z, 2) + " Куб числа: " + (int) Math.pow(z, 3));
    }

    public static void arithmetic16() {
        //Пользователь вводит три числа. Увеличьте первое число в два раза, второе число уменьшите на 3,
        // третье число возведите в квадрат и затем найдите сумму новых трех чисел
        System.out.println("Введите 3 числа: ");
        Scanner sc = new Scanner(System.in);
        int one = sc.nextInt();
        int two = sc.nextInt();
        int three = sc.nextInt();
        System.out.println("a*2+b-3+c*c: " + (one * 2 + two - 3 + three * three));
    }

    public static void arithmetic17() {
        //Пользователь вводит три числа. Найдите среднее арифметическое этих чисел,
        // а также разность удвоенной суммы первого и третьего чисел и утроенного второго числа
        System.out.println("Введите 3 числа: ");
        Scanner sc = new Scanner(System.in);
        int one = sc.nextInt();
        int two = sc.nextInt();
        int three = sc.nextInt();
        System.out.println("Среднее арифметическое: " + (one + two + three) / 3);
    }

    public static void arithmetic18() {
        //Пользователь вводит сторону квадрата. Найдите периметр и площадь квадрата
        System.out.println("Введите сторону квадрата: ");
        Scanner sc = new Scanner(System.in);
        int square = sc.nextInt();
        System.out.println("Периметр квадрата: " + square * 4 + " Площадь квадрата: " + square * square);
    }

    public static void arithmetic19(double priceSweets, int priceBiscuit) {
        //Пользователь вводит цены 1 кг конфет и 1 кг печенья. Найдите стоимость:
        //а) одной покупки из 300 г конфет и 400 г печенья;
        //б) трех покупок, каждая из 2 кг печенья и 1 кг 800 г конфет
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите цены");
    }

    public static void arithmetic20() {
        //Пользователь вводит время в минутах и расстояние в километрах. Найдите скорость в м/с.
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите время в минутах");
        int min = sc.nextInt();
        System.out.println("Введите расстояние в километрах");
        int km = sc.nextInt();
        System.out.println(km * 1000 / (min * 60) + " м/с");
    }

    public static void arithmetic21() {
        //Даны катеты прямоугольника. Найдите площадь, периметр и гипотенузу треугольника.
        int x = 4;
        int y = 3;
        double z = Math.pow(x * x + y * y, 0.5);
        System.out.println("Площадь прямоугольника с катетами " + x + " и " + y + " равна " + x * y / 2);
        System.out.println("Периметр прямоугольника с катетами " + x + " и " + y + " равен " + (int) (x + y + z));
        System.out.println("Гипотенуза прямоугольного треугольника с катетами " + x + " и " + y + " равна " + (int) z);
    }

    public static void arithmetic22() {
        //Дано значение температуры в градусах Цельсия. Вывести температуру в градусах Фаренгейта.
        double temperatureC = 36.6;
        double temperatureF = 1.8 * temperatureC + 32;
        System.out.println("Температура в градусах Цельсия " + temperatureC + " = " + String.format("%.2f", temperatureF) + " в градусах Фаренгейта");
    }

    public static void arithmetic23(){
        //Известно, что X кг конфет стоит A рублей. Определить, сколько стоит Y кг этих конфет, а также
        //сколько кг конфет можно купить на k рублей. Все значения вводит пользователь.
    }

    public static void arithmetic24(){
        //Пользователь вводит количество дней, указывает процент скидки и вводит сумму. Рассчитать прибыль,
        // если за каждый день сумма увеличивается на 3 $ и затем применяется скидка, то есть итоговая сумма
        // еще увеличивается на данное число процентов.
    }

    public static void arithmetic25(int week, int month, int day) {
        //Пользователь вводит количество недель, месяцев, лет и получает количество дней за это время.
        //Считать, что в месяце 30 дней.

    }

    public static void arithmetic26() {
        //Даны две переменные с некоторыми значениями. Поменять местами значения этих переменных.
        int a, b, c;
        a = 17;
        b = 18;
        System.out.println("Даны числа: " + a + " " + b);
        c = a;
        a = b;
        b = c;
        System.out.println("Поменяли местами: " + a + " " + b);
    }

    public static void arithmetic27() {
        //Даны три переменные a, b, c. Изменить значения этих переменных так, чтобы в "a" хранилось значение a+b,
        // а в "b" хранилась разность старых значений c-a, а в "c" хранилось сумма старых значений a+b+c.
        // Например, a=0, b=2, c=5, тогда новые значения a=2, b=3 и c=7.
    }

    public static void arithmetic28() {
        //Пользователь вводит сумму вклада в банк и годовой процент. Найдите сумму вклада через 5 лет
        // (рассмотреть два способа начисления процентов)
    }

    public static void arithmetic29() {
        //Поменяйте местами значения двух переменных, не используя дополнительных переменных
        int a = 17;
        int b = 18;
        System.out.println("Даны числа: " + a + " " + b);
        a = a + b - (b = a);
        System.out.println("Поменяли местами: " + a + " " + b);
    }

    public static void arithmetic30(int a) {
        //Дано число а. Не пользуясь никакими арифметическими операциями кроме умножения, получите:
        //а^4 за две операции;
        //a^6 за три операции;
        //а^15 за пять операций;
        int a2=a*a;     //1
        int a4=a2*a2;   //2
        int a6=a4*a2;   //3
        int a2_15=a*a;
        int a3_15=a2_15*a;
        int a6_15=a3_15*a3_15;
        int a12_15=a6_15*a6_15;
        int a15_15=a12_15*a3_15;
        System.out.println("а^4 за две операции "+a4+", при а= "+a);
        System.out.println("a^6 за три операции "+a6+", при а= "+a);
        System.out.println("а^15 за пять операций "+a15_15+", при а= "+a);
    }

    public static void arithmetic31() {
        //Дан прямоугольник размером 647*170. Сколько квадратов со стороной 30 можно вырезать из него?
        int n170 = 170 / 30;
        int n647 = (647 - n170*30) / 30;
        System.out.println("Количество квадратов: "+(n647 + n170));
    }

    public static void arithmetic32(int y) {
        //Из трехзначного числа x вычли его последнюю цифру. Когда результат разделили на 10,
        // а к частному слева приписали последнюю цифру числа x, то получилось число 237. Найти число x.
        int lastNumeral = Integer.valueOf(y / 100);
        int remain = Integer.valueOf(y % 100);
        System.out.println(remain * 10 + lastNumeral);
    }

    public static void all_arif() {
        System.out.println("\nЗадание 7");
        Arithmetic.arithmetic7();
        System.out.println("\nЗадание 8");
        Arithmetic.arithmetic8();
        System.out.println("\nЗадание 9");
        Arithmetic.arithmetic9();
        System.out.println("\nЗадание 10");
        Arithmetic.arithmetic10(1.7);
        Arithmetic.arithmetic10(3);
        System.out.println("\nЗадание 11");
        Arithmetic.arithmetic11(-2.34);
        System.out.println("\nЗадание 12");
        Arithmetic.arithmetic12(3.6);
        System.out.println("\nЗадание 13");
        Arithmetic.arithmetic13(0.1, 0.2, 1);
    }

    public static void all_input() {
        System.out.println("\nЗадание 14");
        //    Arithmetic.arithmetic14();
        System.out.println("\nЗадание 15");
        //    Arithmetic.arithmetic15();
        System.out.println("\nЗадание 16");
        //    Arithmetic.arithmetic16();
        System.out.println("\nЗадание 17");
        //    Arithmetic.arithmetic17();
        System.out.println("\nЗадание 18");
        //    Arithmetic.arithmetic18();
        System.out.println("\nЗадание 19");
        // Arithmetic.arithmetic19();
        System.out.println("\nЗадание 20");
        // Arithmetic.arithmetic20();
        System.out.println("\nЗадание 21");
        Arithmetic.arithmetic21();
        System.out.println("\nЗадание 22");
        Arithmetic.arithmetic22();
        System.out.println("\nЗадание 23");
        Arithmetic.arithmetic23();
        System.out.println("\nЗадание 24");
        Arithmetic.arithmetic24();
        System.out.println("\nЗадание 25");
     //   Arithmetic.arithmetic25();
        System.out.println("\nЗадание 26");
        Arithmetic.arithmetic26();
        System.out.println("\nЗадание 27");
        Arithmetic.arithmetic27();
        System.out.println("\nЗадание 28");
        Arithmetic.arithmetic28();
        System.out.println("\nЗадание 29");
        Arithmetic.arithmetic29();
        System.out.println("\nЗадание 30");
        Arithmetic.arithmetic30(2);
        System.out.println("\nЗадание 31");
        Arithmetic.arithmetic31();
        System.out.println("\nЗадание 32");
        Arithmetic.arithmetic32(237);
    }
}
