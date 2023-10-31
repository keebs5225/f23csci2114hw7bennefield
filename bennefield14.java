//837799
public class bennefield14 {
    public static void main(String[] args) {
        long maxSequenceLength = 0;
        long startingNumber = 0;

        for (long i = 1; i < 1_000_000; i++) {
            long n = i;
            long sequenceLength = 0;

            while (n != 1) {
                if (n % 2 == 0) {
                    n /= 2;
                } else {
                    n = 3 * n + 1;
                }
                sequenceLength++;
            }

            if (sequenceLength > maxSequenceLength) {
                maxSequenceLength = sequenceLength;
                startingNumber = i;
            }
        }

        System.out.println(startingNumber);
    }
}
