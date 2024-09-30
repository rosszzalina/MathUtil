public class Main {
    public static void main(String[] args) {
        // Testing static methods
        System.out.println("Static Method Tests:");
        System.out.println("Is 7 prime? " + MathUtil.isPrime(7));
        System.out.println("Is 18 prime? " + MathUtil.isPrime(18));

        System.out.println("GCD of 48 and 18: " + MathUtil.gcd(48, 18));
        System.out.println("GCD of 56 and 98: " + MathUtil.gcd(56, 98));
        System.out.println("GCD of 13 and 17: " + MathUtil.gcd(13, 17));

        System.out.println("LCM of 4 and 5: " + MathUtil.lcm(4, 5));
        System.out.println("LCM of 12 and 15: " + MathUtil.lcm(12, 15));
        System.out.println("LCM of 7 and 11: " + MathUtil.lcm(7, 11));

        System.out.println("Fibonacci of 5: " + MathUtil.fibonacci(5));
        System.out.println("Fibonacci of 10: " + MathUtil.fibonacci(10));
        System.out.println("Fibonacci of 15: " + MathUtil.fibonacci(15));

        System.out.println("Factorial of 5: " + MathUtil.factorial(5));
        System.out.println("Factorial of 60: " + MathUtil.factorial(60));
        System.out.println("Factorial of 17: " + MathUtil.factorial(17));

        // Creating an instance of MathUtil to test non-static methods
        MathUtil mathUtil = new MathUtil();

        // Testing non-static methods
        System.out.println("\nNon-Static Method Tests:");
        System.out.println("Is 28 a perfect number? " + mathUtil.isPerfectNumber(28));
        System.out.println("Is 6 a perfect number? " + mathUtil.isPerfectNumber(6));

        System.out.println("Sum of digits in 12345: " + mathUtil.sumOfDigits(12345));
        System.out.println("Sum of digits in -56789: " + mathUtil.sumOfDigits(-56789));

        System.out.println("Reverse of 1234: " + mathUtil.reverseNumber(1234));
        System.out.println("Reverse of -1234: " + mathUtil.reverseNumber(-1234));

        System.out.println("Is 153 an Armstrong number? " + mathUtil.isArmstrongNumber(153));
        System.out.println("Is 100 a Armstrong number? " + mathUtil.isArmstrongNumber(100));

        System.out.println("Next prime after 10: " + mathUtil.nextPrime(10));
        System.out.println("Next prime after 20: " + mathUtil.nextPrime(20));

    }
}