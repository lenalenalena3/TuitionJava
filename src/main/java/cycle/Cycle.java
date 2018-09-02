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

    public static void cycle78() {
        //Вывести на экран фигуру из звездочек:
    }
}
