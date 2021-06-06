import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		double firstNumber = sc.nextInt();

		System.out.println("Enter operator: ");
		char operator = sc.next()
				.charAt(0);

		System.out.println("Enter second number: ");
		double secondNumber = sc.nextInt();

		sc.close();

		switch (operator) {
		case '+':
			double addition = firstNumber + secondNumber;
			System.out.println("The result is: " + addition);
			break;
		case '-':
			double subtraction = firstNumber - secondNumber;
			System.out.println("The result is: " + subtraction);
			break;
		case '*':
			double multiplication = firstNumber * secondNumber;
			System.out.println("The result is: " + multiplication);
			break;
		case '/':
			double division = firstNumber / secondNumber;
			System.out.println("The result is: " + division);
			break;
		default:
			System.out.println("The operator you have entered is invalid!");
		}

	}

}
