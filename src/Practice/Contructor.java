package Practice;

public class Contructor {
	String name;
	int age;

	public Contructor() {
		// TODO Auto-generated constructor stub
		this.name = "Amit banger";
		this.age = 28;
	}
	public static void main(String[] args) {
		Contructor c1 = new Contructor();
		System.out.println(c1.age);
		System.out.println(c1.name);	
		Contructor c2 = new Contructor("Suresh", 29);
		c2.info();
		}
	//*********************Parameterized constructor*************************//

	Contructor(String s, int a)
	{
		name = s;
		age = a;
	}
	void info() {
		System.out.println("name is: " + name + "Age is: " + age);
	}
}
