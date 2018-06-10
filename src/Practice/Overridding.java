package Practice;

public class Overridding {
	public void classA()
	{
		System.out.println("I am eating");
	}
}

class Boy extends Overloading
{
	void classA()
	{
		System.out.println("I have already eaten");
	}
	
	public static void main(String[] args) {
		Boy b = new Boy();
		b.classA();
	}
}
