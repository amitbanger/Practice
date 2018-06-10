package Practice;
import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);{
		System.out.println("Enter your number");
		int n = sc.nextInt();
		n = n-1;
		if(n%2==1) {
			System.out.println("This is Even number");
		}
		else{
			System.out.println("This is Odd number");
		}
		}
	}
	
}

