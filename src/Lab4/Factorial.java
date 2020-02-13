package Lab4;

public class Factorial {
    // Recursive definition of method factorial
    public static int factorial( int n )
    {
        if ( n == 1 || n == 0 )  // base case
            return 1;
        else {
            int result1 = factorial(n-1);
            int result = n * result1;
            return result;
        }
    }

    public static double myPow(double x, int y)
    {
        if ( y == 1 )  // base case
            return x;
        else if (  y == 0 )
            return 1;
        else {
            double result2 = myPow(x, y-1);
            double result = x * result2;
            return result;
        }
    }

    public String reverse(String str)
    {
        //String reverseArray[] = new String[str.length()];
        int index = str.length();
        if (str.length() == 0)
            return str;
        else {
            String rev = str.substring(index-1);
            String result = 
        }
    }
}
