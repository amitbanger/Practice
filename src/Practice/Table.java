package Practice;
import java.util.Scanner;
public class Table {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number: ");
		int num = sc.nextInt();
		for(int i=1; i<=10; i++) {
			System.out.println(num + "X" + i + " = " + (num*i));
		}
		
	}

}
