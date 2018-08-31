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
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число n");
        int n = 0;
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                System.out.println("Silence is golden");
            }
        }
        sc.close();
    }
}
