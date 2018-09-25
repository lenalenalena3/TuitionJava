package cycle;

import java.util.Scanner;

public class Cycle {

    public static void cycle75() {
        //Вывести на экран 10 раз фразу "You are welcome!"
        for (int i = 0; i < 10; i++) {
            System.out.println("You are welcome!");
        }
    }

    public static void cycle76() {
        //Вывести на экран n раз фразу "Silence is golden". Число n вводит пользователь.
        System.out.println("Введите число n для вывода фразы: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                System.out.println("Silence is golden");
            }
        }
    }

    public static void cycle77() {
        //Выведите на экран прямоугольник из нулей. Количество строк вводит пользователь, количество столбцов равно 5
        System.out.println("Введите количество строк n для прямоугольника из нулей:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("0");
            }
            System.out.println();
        }
        sc.close();
    }

    public static void cycle78(int n) {
        //Вывести на экран фигуру из звездочек:
        //квадрат из n строк, в каждой строке n звездочек
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void cycle79() {
        //Вывести на экран ряд чисел 1,2,3,4...,20
        for (int i = 1; i <= 20; i++) {
            if (i == 20) {
                System.out.println(i);
            } else {
                System.out.print(i + ", ");
            }
        }
    }

    public static void cycle80() {
        //Вывести на экран ряд чисел 1001, 1004, 1007, ...1025
        for (int i = 1001; i <= 1025; i = i + 3) {
            if (i == 1025) {
                System.out.println(i);
            } else {
                System.out.print(i + ", ");
            }
        }
    }

    public static void cycle81() {
        //Вывести на экран ряд числа 100,96,92,...до последнего положительного включительно
        String str = "";
        for (int i = 100; i >= 0; i = i - 4) {
            str = str + i + ", ";
        }
        System.out.print(str.substring(0, str.length() - 2));
        System.out.println();
    }

    public static void cycle82() {
        //Вывести на экран ряд числа 1.2,1.4,1.6,...,2.8
        for (double i = 1.2; i <= 2.8; i = i + 0.2) {
            if (i == 2.8) {
                System.out.println(i);
            } else {
                System.out.printf("%.1f", i);
                System.out.print(", ");
            }
        }
    }

    public static void cycle83() {
        //Выведите следующие строки.
        // Первая: 25 25.5 24.8
        // Вторая: 26 26.5 25.8
        //И так далее. Последняя строка: 35 35.5 34.8
        for (int i = 25; i <= 35; i++) {
            System.out.print(i + " " + (i + 0.5) + " " + (i - 1 + 0.8) + "\n");
        }
        System.out.println();
    }

    public static void cycle86(int n) {
        //Для данного n найти сумму 1+2+3+...+n. Например, для n=10 ответ равен 55
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("Сумма 1.." + n + "= " + sum);
    }

    public static void cycle87() {
        //Найти сумму 10+11+12+13+...+88
        int sum = 0;
        for (int i = 10; i <= 88; i++) {
            sum = sum + i;
        }
        System.out.println("Сумма 10+11+...+88= " + sum);
    }

    public static void cycle88() {
        //Найти произведение 5*6*7*...*13
        int p = 1;
        for (int i = 5; i <= 13; i++) {
            p = p * i;
        }
        System.out.println("Произведение 5*6*...*13 равно " + p);
    }

    public static void cycle89() {
        //Найти сумму 1+4+7+11+...+112
        int sum = 0;
        for (int i = 1; i <= 112; i = i + 3) {
            sum = sum + i;
        }
        System.out.println("Сумма 1+4+7+...112" + sum);
    }

    public static void cycle90() {
        //найти сумму cos3/5+cos5/7+cos7/9+...+cos111/113
        double sum = 0;
        for (int i = 3; i <= 111; i++) {
            sum = sum + Math.cos((double) i / (i + 2));
        }
        System.out.println("Сумма cos3/5+cos5/7+cos7/9+...+cos111/113: " + sum);
    }

    public static void cycle91() {
        //Найти сумму 2/3+3/4+4/5+...+9/10
        double sum = 0;
        for (int i = 2; i <= 9; i++) {
            sum = sum + (double) i / (i + 1);
        }
        System.out.println("Сумма 2/3+3/4+4/5+...+9/10: " + sum);
    }

    public static void cycle94(int n) {
        //Найдите сумму 1+1/2+1/3+...+1/n
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + (double) 1 / (i);
        }
        System.out.println("Cумма 1+1/2+1/3+...+1/n :" + sum);
    }

    public static void cycle97(int n) {
        //Вычислите 1*2+2*3*4+...n*(n+1)*...*2n
        double sum=0;
        for (int i = 1; i <= n; i++) {
            sum=sum*2;
        }
        System.out.println(sum);
    }

    public static void cycle99() {
        //Вывести на экран числа от 1000 до 9999 такие, что все цифры различны
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        for (int i = 1000; i <= 9999; i++) {
            a = i / 1000;
            d = i % 10;
            c = (i - d) / 10 % 10;
            b = (i - a * 1000) / 100;
            if ((a != b) && (a != c) && (a != d) && (b != c) && (b != d) && (c != d)) {
                System.out.print(i + ", ");
            }
        }
        System.out.println();
    }

    public static void cycle100() {
        //Вывести на экран числа от 1000 до 9999 такие, что среди цифр нет цифр 5 и цифры 6
        for (int i = 1000; i <= 9999; i++) {
            String str = Integer.toString(i);
            if ((str.indexOf("5") == -1) && (str.indexOf("6") == -1)) {
                System.out.print(i + ", ");
            }
        }
    }

    public static void all() {
        //  System.out.println("\nЗадание 75");
        //  System.out.println("\nЗадание 76");
        //   System.out.println("\nЗадание 77");
        System.out.println("\nЗадание 78");
        Cycle.cycle78(3);
        System.out.println("\nЗадание 79");
        Cycle.cycle79();
        System.out.println("\nЗадание 80");
        Cycle.cycle80();
        System.out.println("\nЗадание 81");
        Cycle.cycle81();
        System.out.println("\nЗадание 82");
        Cycle.cycle82();
        System.out.println("\nЗадание 83");
        Cycle.cycle83();
        System.out.println("\nЗадание 86");
        Cycle.cycle86(10);
        System.out.println("\nЗадание 87");
        Cycle.cycle87();
        System.out.println("\nЗадание 88");
        Cycle.cycle88();
        System.out.println("\nЗадание 90");
        Cycle.cycle90();
        System.out.println("\nЗадание 91");
        Cycle.cycle91();
        System.out.println("\nЗадание 94");
        Cycle.cycle94(10);
        System.out.println("\nЗадание 99");
        Cycle.cycle99();
        System.out.println("\nЗадание 100");
        Cycle.cycle100();
    }
}
