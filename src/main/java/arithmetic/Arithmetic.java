package arithmetic;

public class Arithmetic {
    public static void arithmetic7() {
        //Вычислите 1/2+1/4
        System.out.println((double)1/2+(double)1/4);
    }
    public static void arithmetic8(){
        //Вычислите значение выражения (a+4b)(a-3b)+a^2 при a=2, b=3
        int a=2;
        int b=3;
        System.out.println((a+4*b)*(a-3*b)+Math.pow(a, 2));
    }
}
