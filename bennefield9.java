//31875000
public class bennefield9 {
    public static void main(String[] args) {
        int targetSum = 1000;

        for (int a = 1; a < targetSum; a++) {
            for (int b = a + 1; b < targetSum; b++) {
                int c = targetSum - a - b;
                if (a * a + b * b == c * c) {
                    int product = (int) a * b * c;
                    System.out.println(product);
                    return; 
                }
            }
        }
    }
}
