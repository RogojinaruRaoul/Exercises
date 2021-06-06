import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert the limit: ");
		int n = sc.nextInt();
		for (int i = 2; i <= n; i++) {
			boolean primeNumber = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					primeNumber = false;
					break;
				}
			}

			if (primeNumber) {
				System.out.println(i);
			}
		}

		sc.close();
	}

}
