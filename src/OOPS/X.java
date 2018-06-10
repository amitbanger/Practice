package OOPS;

public class X {
	void method(int a)
	{
		System.out.println("One");
	}
	void method(double b)//method overloading same method with different parameters
	{
		System.out.println("Two");
	}
}

class Y extends X{//inheritance

	void method(double b)//method overriding same method but with different behavior
	{
		System.out.println("Overriding class X method");
	}
	public static void main(String[] args) {
		X x = new X();
		x.method(1);
		Y y = new Y();
		y.method(0.0);

	}
}
