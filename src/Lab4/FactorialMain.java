package Lab4;

public class FactorialMain {
    public static void main(String[] args) {
        int result = Factorial.factorial(5);
        System.out.println(result); // expect 120

        int result2 = Factorial.factorial(10);
        System.out.println(result2); // expect 3628800

        int result3 = Factorial.factorial(3);
        System.out.println(result3); //expect 6

        double pow = Factorial.myPow(2, 10);
        System.out.println(pow); //expect 1024

        double pow2 = Factorial.myPow(10, 1);
        System.out.println(pow2); //expect 10

        double pow3 = Factorial.myPow(100, 0);
        System.out.println(pow3); // expect 1

        double pow4 = Factorial.myPow(0.5, 2);
        System.out.println(pow4); // expect 0.25
    }
}
