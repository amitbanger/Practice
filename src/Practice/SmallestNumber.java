package Practice;
import java.util.Scanner;

public class SmallestNumber {
		public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter first number:");
		    int a = sc.nextInt();
		    System.out.println("Enter second number:");
		    int b = sc.nextInt();
		    System.out.println("Enter third number");
		    int c = sc.nextInt();		
		    if(a>b){
		    	if (a>c) {
		    		System.out.println("The largest number is = "+ a);
		    	}else {
		    		System.out.println(a +" Is not the largest number");
		    	}
		    }
		    else {
		    	if(b>a) {
		    		if(b>c) {
		    			System.out.println("The largest number is = " + b);
		    		}else {
		    			System.out.println(b + "Is not the largest number");
		    		}
		    		
		    	}else {
		    		if(c>a && c>b) {
		    			System.out.println(c + "Is the largest number");
		    		}else {
		    			System.out.println(c + "IS not the largest number");
		    		}
		    	}
		    }
	}	
}
