//906609
public class bennefield4 {
    public static void main(String[] args) {
        int largestPalindrome = findLargestPalindromeProduct();
        System.out.println(largestPalindrome);
    }

    public static boolean isPalindrome(int num) {
        String numStr = Integer.toString(num);
        String reversedStr = new StringBuilder(numStr).reverse().toString();
        return numStr.equals(reversedStr);
    }

    public static int findLargestPalindromeProduct() {
        int largestPalindrome = 0;

        for (int i = 999; i >= 100; i--) {
            for (int j = 999; j >= 100; j--) {
                int product = i * j;

                if (isPalindrome(product) && product > largestPalindrome) {
                    largestPalindrome = product;
                }
            }
        }

        return largestPalindrome;
    }
}