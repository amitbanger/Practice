package Practice;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		int temp;
		boolean isPrime = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check prime or not");
		int num = sc.nextInt();
		sc.close();
		for (int i=2; i<num/2; i++)
		{
          temp = num%i;
          if(temp==0)
          {
        	  isPrime = false;
        	  break;
          }
		}
		if(isPrime)
		{
			System.out.println(num + " Is prime number");
		}else {
			System.out.println(num + " Is not a prime number");
		}
	}

}
