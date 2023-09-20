//233168
public class bennefield1 {
	public static void main(String[] args) {
		int limit = 1000;
		int sum = 0;

		for (int i = 1; i < limit; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}

		System.out.println(sum);
	}
}
