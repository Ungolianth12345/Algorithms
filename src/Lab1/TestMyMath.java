package Lab1;

public class TestMyMath {
    public static void main(String[] args) {
        int result = MyMath.smallest(3, 14, 22);
        System.out.println(result); //expect 3

        int result2 = MyMath.smallest(34, 23, 78);
        System.out.println(result2); //expect 23

        int result3 = MyMath.smallest(12, 45, 2);
        System.out.println(result3); //expect 2

        int pow1 = MyMath.power(2, 3);
        System.out.println(pow1); //expect 8

        int pow2 = MyMath.power(2, 1);
        System.out.println(pow2); //expect 2

        int pow3 = MyMath.power(10, 0);
        System.out.println(pow3); //expect 1

        int count = MyMath.count(1);
        System.out.println(count); //expect 1

        int count2 = MyMath.count(2);
        System.out.println(count2); //expect 3

        int count3 = MyMath.count(10);
        System.out.println(count3); //expect 55

        boolean prime1 = MyMath.prime(121);
        System.out.println(prime1); //expect false

        boolean prime2 = MyMath.prime(73);
        System.out.println(prime2); //expect true

        boolean prime3 = MyMath.prime(1679);
        System.out.println(prime3); //expect false
    }
}
