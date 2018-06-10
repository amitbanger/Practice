package OOPS;

import java.util.Scanner;

public class Assignment06 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int n=sc.nextInt();
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			System.out.println(j);
			
			System.out.println("");
		}
	
	}
	
}
