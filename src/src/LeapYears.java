import java.util.Scanner;

public class LeapYears {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type year: ");
		int year = sc.nextInt();

		if (year >= 1900 && year <= 2016 && year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("February has 29 days!");
		} else if (year >= 2016 || year <= 1900) {
			System.out.println("The year you have entered is not valid!");
		} else {
			System.out.println("February has 28 days!");
		}
		sc.close();

	}

}
