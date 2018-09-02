import arithmetic.Arithmetic;
import console.Console;
import cycle.Cycle;

public class Start {
    public static void main(String[] args) {
        //     Console.all();
        // Arithmetic.all_arif();
        Arithmetic.all_input();
        System.out.println("\nЗадание 75");
        Cycle.cycle75();
        System.out.println("\nЗадание 76");
        //    Cycle.cycle76();
        System.out.println("\nЗадание 77");
        //    Cycle.cycle77();
        System.out.println();
        System.out.println("18 раскладывается на простые числа:");
        Console.decomposePrimeNumbers(18);
        System.out.println();
        System.out.println("16 раскладывается на простые числа:" );
        Console.decomposePrimeNumbers(16);
        System.out.println();
        System.out.println("30 раскладывается на простые числа:" );
        Console.decomposePrimeNumbers(30);
    }
}
