package recursion;

public class Recursion {

    public static String decomposePrimeNumbers(int x) {
        for (int i = 2; i <= x; i++) {
            if (x % i == 0) {
                x = x / i;
                return Integer.toString(i) +" "+ decomposePrimeNumbers(x);
            }
        }
        return "";
    }

    public static String factorial(int x){
        return "";

    }

    public static void all(){
        System.out.println("Задание Разложить число на простые числа");
        System.out.println("18 раскладывается на простые числа:");
        System.out.println(Recursion.decomposePrimeNumbers(18));
        // System.out.println("16 раскладывается на простые числа:" );
        //Console.decomposePrimeNumbers(16);
        System.out.println("30 раскладывается на простые числа:" );
        System.out.println(Recursion.decomposePrimeNumbers(30));
        System.out.println("147 раскладывается на простые числа:" );
        System.out.println(Recursion.decomposePrimeNumbers(147));
    }
}
