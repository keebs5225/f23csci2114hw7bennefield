//4613732
public class bennefield2 {
    public static void main(String[] args) {
        int limit = 4000000;
        long sum = 0;
        int prev = 1;
        int current = 1;

        while (current <= limit) {
            if (current % 2 == 0) {
                sum += current;
            }

            int next = prev + current;
            prev = current;
            current = next;
        }

        System.out.println(sum);
    }   
}