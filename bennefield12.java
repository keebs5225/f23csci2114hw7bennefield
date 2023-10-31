//76576500
public class bennefield12 {
    public static void main(String[] args) {
        int n = 1; // Current natural number
        int triangleNumber = 0; // Current triangle number
        int divisorCount;

        while (true) {
            triangleNumber += n;
            divisorCount = countDivisors(triangleNumber);

            if (divisorCount > 500) {
                System.out.println(triangleNumber);
                break;
            }

            n++;
        }
    }

    public static int countDivisors(int num) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                count += 2; // Count both divisors i and num/i
            }
        }
        // If num is a perfect square, the loop will count the square root twice, so we subtract 1.
        if (Math.sqrt(num) * Math.sqrt(num) == num) {
            count--;
        }
        return count;
    }
}
