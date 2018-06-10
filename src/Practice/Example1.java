package Practice;

public interface Example1 {
	public void say();
	public void speak();
	public void hello();
}


interface Example2 extends Example1{
	}

abstract class Example3 implements Example2{
	public void say() {
		System.out.println("Hello Interface");
	}
}