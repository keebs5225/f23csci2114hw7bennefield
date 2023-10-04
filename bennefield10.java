//A
public class bennefield10 {
    public static void main(String[] args) {
        int limit = 2000000;
        int sum = sumPrimesBelowLimit(limit);
        
        System.out.println(sum);
    }

    public static int sumPrimesBelowLimit(int limit) {
        boolean[] isPrime = new boolean[limit];
        for (int i = 2; i < limit; i++) {
            isPrime[i] = true;
        }

        for (int p = 2; p * p < limit; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i < limit; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        int sum = 0;
        for (int i = 2; i < limit; i++) {
            if (isPrime[i]) {
                sum += i;
            }
        }

        return sum;
    }
}
