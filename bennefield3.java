//600851475067 
public class bennefield3 {
    public static void main(String[] args) {
        long number = 600851475143L;
        long largestPrimeFactor = findLargestPrimeFactor(number);

        System.out.println(largestPrimeFactor);
    }

    public static long findLargestPrimeFactor(long number) {
        long largestPrime = -1;

        // Divide the number by 2 while it's even
        while (number % 2 == 0) {
            largestPrime = 2;
            number /= 2;
        }

        // Check for prime factors starting from 3
        for (long i = 3; i <= Math.sqrt(number); i += 2) {
            while (number % i == 0) {
                largestPrime = i;
                number /= i;
            }
        }

        // If the remaining number is greater than 2, it's a prime factor
        if (number > 2) {
            largestPrime = number;
        }

        return largestPrime;
    }
}
