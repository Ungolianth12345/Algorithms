package Lab1;

public class MyMath {
    public static int smallest(int a, int b, int c) {
        int min = a;
        if (min > b) {
            min = b;
        }
        if (min > c) {
            min = c;
        }
        return min;
    }

    public static int power(int a, int b) {
        int pow = 1;
        for (int i=0; i < b; i++) {
            pow *= a;
        }
        return pow;
    }

    public static int count(int n) {
        int result = 0;
        for (int j=1; j <= n; j++) {
            result += j;
        }
        return result;
    }

    public static boolean prime(double p) {
        int i = 3;
        boolean isPrime = true;
        // go up to sqrt(p)
        // continue lab 1
        while (isPrime && i < p/2  ) {
            if (p % i == 0) {
                isPrime = false;
            }
            else
                i++;
        }
        return isPrime;
    }
}
