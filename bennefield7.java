//104743
public class bennefield7 {
	public static void main(String[] args) {

		int n = 10001;
		int count = 1;
		int primeNum = 3;

		while (count < n) {
			if (isPrime(primeNum)) {
				count++;
				if (count == n) {
					System.out.println(primeNum);
					break;
				}
			}
			primeNum += 2;
		}
	}
	//find prime num
	static boolean isPrime(int num) {
	if (num <= 1) {
		return false;
    	}
	if (num == 2) {
        return true;
    }
    if (num % 2 == 0) {
        return false;
    }

    // Check for prime by dividing only by odd numbers up to the square root of num
    for (int i = 3; i * i <= num; i += 2) {
        if (num % i == 0) {
            return false;
        }
    }

    return true;
	}
}