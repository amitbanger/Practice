package Practice;

import java.util.Scanner;

public class Calculator {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		double num1, num2, output;
		System.out.println("Please enter first number: ");
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextDouble();
		System.out.println("Please enter second number: ");
		num2 = sc.nextDouble();
		System.out.println("Enter an operator(+, -, *, /):");
		char operator = sc.next().charAt(0);
		sc.close();
		switch(operator)
		{
		case '+':
			output = num1+num2;
			break;
		case '-':
			output = num1-num2;
			break;
		case '*':
			output = num1*num2;
			break;
		case '/':
			output = num1/num2;
			break;
		default:
			System.out.println("You have entered an wrong operator");		
			return;
		}
		System.err.println(num1 +""+ operator+ "" + num2 + ": " +output);
	}

}