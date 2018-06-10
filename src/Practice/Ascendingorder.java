package Practice;

import java.util.Scanner;

public class Ascendingorder {
	public static void main(String[] args) {
		for(int i=20; i>0; i--)
		{
			System.out.println("The Ascending order is as follows: " + i);
		}

		int arr[] = {1, 2, 3, 4, 5, 6};//Enhanced for loop
		for(int num: arr)
		{
			System.out.println(num);
		}
		String arr1[] = {"Hello", "Amit"};
		for (String str:arr1)
		{
			System.out.println(str);
		}

		int j = 5;//factorial of a number
		long fact = 1;
		for (int k=1; k<=j; k++)
		{
			fact = fact*k;
		}
		System.out.println("Factorial of: " + j +" is " + fact);

		int number;//factorial of user given input
		long fact1 = 1;
		System.out.println("Please enter a number you wish to have factorial");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		number =  sc.nextInt();
		for(int l = 1; l<=number; l++)
			fact1 = fact1*l;
		{
			System.out.println("Factorial of given number:"+ number +" is " +fact1);
		}
		//Sum of natural numbers

	}

}
