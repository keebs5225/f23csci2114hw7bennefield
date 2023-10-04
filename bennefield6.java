//25164150
public class bennefield6 {
	public static void main(String[] args) {
		int n = 100;
		int sumOfSquares = 0;
		int squareOfSum = 0;

		for (int i = 1; i <= n; i++) {
            sumOfSquares += i * i;
            squareOfSum += i;
        }

        squareOfSum = squareOfSum * squareOfSum;

        int difference = squareOfSum - sumOfSquares;
        System.out.println(difference);
	}
}