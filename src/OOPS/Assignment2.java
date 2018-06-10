package OOPS;

import java.util.Scanner;

public class Assignment2 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check even :");
		int number = sc.nextInt();
		if(number % 2 == 0)
			System.out.println("1");
		else
			System.out.println("0");
	}

}
