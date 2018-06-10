package Practice;

public class Overloading {
	public void disp(String c)
	{
		System.out.println("I am first definition of disp method");
	}
	public void disp(int c)
	{
		System.out.println("I am second definition of disp method");
	}
	public void Example1(int a, int b) {
		System.out.println(a +"\n"+ b);
	}
	public void Exmaple2(char c, String d, int e) {
	System.out.println(c +"\n" +d +"\n"+e);
	}
	
	public static void main(String[] args) {
		Overloading ol = new Overloading();
		ol.disp("amit banger");
		ol.disp(1);
		ol.Example1(100, 200);
		ol.Exmaple2('O', "Method overloading With string type", 400);
	}
}

