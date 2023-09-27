//232792560
public class bennefield5 {
    public static void main(String[] args) {
        long result = findSmallestMultiple(20);
        System.out.println(result);
    }

    public static long findSmallestMultiple(int n) {
        long lcm = 1;

        for (int i = 1; i <= n; i++) {
            lcm = getLCM(lcm, i);
        }

        return lcm;
    }

    public static long getGCD(long a, long b) {
        while (b > 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static long getLCM(long a, long b) {
        return (a * b) / getGCD(a, b);
    }
}