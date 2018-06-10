package OOPS;

public class Assignment03 {
	public static void main(String[] args) {
		for(int i=1; i<=100; i++)
		{
			if(i%3==0) {
				System.out.println(i + " divisible by 3 : ");
			}else if(i%5==0){
				System.out.println(i + " divisible by 5 : ");
			}
			else
				System.out.println(i + " neither divisible by 3 nor 5: ");
		}


	}
}
