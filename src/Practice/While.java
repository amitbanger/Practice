package Practice;

public class While {
	public static void main(String[] args) {
		int i=10;
		while(i>0)
		{
			System.out.println(i);
			i--;
		}

		long fact = 1;//factorial using while loop
		int number = 5;
		int j=1;
		while(j<=number)
		{
			fact = fact*j;
			j++;	
		}
		System.out.println("factorial of a number:" +number + " is " + fact );
	}

}
