package Practice;

import java.util.Scanner;

public class NaturalNumbersSum {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int number;
		int count = 1;
		int total = 0;
		System.out.println("Please enter your number");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		while(count <= number)
		{
			total = total+count;
			count++;
		}
System.err.println("Sum of natural number"+ number+ " is " + total);
	}



}
