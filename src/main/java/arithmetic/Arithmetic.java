package arithmetic;

import java.util.Scanner;

public class Arithmetic {
    public static void arithmetic7() {
        //Вычислите 1/2+1/4
        System.out.println((double) 1 / 2 + (double) 1 / 4);
    }

    public static void arithmetic8(int a, int b) {
        //Вычислите значение выражения (a+4b)(a-3b)+a^2 при a=2, b=3
        System.out.println((a + 4 * b) * (a - 3 * b) + Math.pow(a, 2));
    }

    public static void arithmetic9(int x) {
        //Вычислите |x|+x^5, если x=-2
        System.out.println((int) (Math.abs(x) + Math.pow(x, 5)));
    }

    public static void arithmetic10(double x) {
        //Вычислите значение выражения (x+1)^2+3(x+1) при а)x=1.7 б)x=3
        System.out.println(Math.pow(x + 1, 2) + 3 * (x + 1));
    }

    public static void arithmetic10(int x) {
        //Вычислите значение выражения (x+1)^2+3(x+1) при а)x=1.7 б)x=3
        System.out.println((int) Math.pow(x + 1, 2) + 3 * (x + 1));
    }

    public static void arithmetic11(double x) {
        //Вычислите значение выражения (|x-5|- sin x)/3+(x^2+2014)^(0.5)cos2x-3, при x=-2.34
        double a = (Math.abs(x - 5) - Math.sin(x)) / 3;
        double b = Math.pow(x, 2) + 2014;
        double c = Math.pow(b, 0.5);
        System.out.println(a + c * Math.cos(2 * x) - 3);
    }

    public static void arithmetic12(double x) {
        //Вычислите значение выражения e^(х-2)+|sin(x)|-x^10*cos(1/x) при x=3.6
        double a = Math.exp(x - 2);
        double b = Math.sin(x);
        double c = Math.abs(b);
        double d = Math.pow(x, 10) * Math.cos(1 / x);
        System.out.println(a + c - d);
    }

    public static void arithmetic13(double a, double b, int x) {
        //Вычислите значение выражения (x^2+b)^(1/5)-(b^2sin^3(x+a))/x, при а=0.1, b=0.2 и x=1
        double s = Math.pow(x, 2) + b;
        double ss = Math.pow(s, 1 / 5);
        double t = Math.pow(b, 2);
        double k = Math.sin(x + a);
        double kk = Math.pow(k, 3);
        System.out.println(ss - (t * kk) / x);
    }

    public static void arithmetic14() {
        //Пользователь вводит два числа. Найдите сумму и произведение данных чисел
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число x: ");
        int x = sc.nextInt();
        System.out.println("Введите число y: ");
        int y = sc.nextInt();
        sc.close();
        System.out.println("Сумма чисел: " + (x + y) + " Произведение чисел: " + x * y);
    }

    public static void arithmetic15() {
        //Пользователь вводит число. Выведите на экран квадрат этого числа, куб этого числа
        Scanner scz = new Scanner(System.in);
        System.out.println("Введите число z: ");
        int s = scz.nextInt();
        scz.close();
        // System.out.println("Квадрат числа: "+Math.pow(z,2)+" Куб числа: "+Math.pow(z,3));
    }
}
