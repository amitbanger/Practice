package Practice;
import java.util.Scanner;

public class SumOfTwoNumbers {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		System.out.println("Please input first number: ");
		int num1 = sc.nextInt();
		System.out.println("Please enter second number: ");		
		int num2 = sc.nextInt();
		int sum = num1+num2;
		int multi = num1*num2;
		int div = num1/num2;
		int sub = num1-num2;
		System.out.println("Sum of two numbers is: " + sum + '\n'+ "Multiplication of two numbers is: "+ multi +'\n'+ "Division of two numbers is: "+ div + '\n' + "Subtraction of two numbers is: " + sub + "Average of two integers is: " + (num1+num2)/2);
	//Max min logic
		if(num1>num2) 
			System.out.println("Max integer is: " + num1);
		else {
			System.out.println("Max integer is:" + num2 );
		} 
			
		
	}
}