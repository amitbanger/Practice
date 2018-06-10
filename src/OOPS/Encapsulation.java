package OOPS;

public class Encapsulation {

	static int sal = 500000;
	static String name = "Amit Banger";

	public String getStuname()
	{
		return name;	
	}
	public int getSal()
	{
		return sal;
	}

	public void setstuname(String newname)
	{
		name = newname;
	}

	public void setsal(int newsal) {

		sal = newsal+500000;
	}
	public static void main(String[] args) {
		Encapsulation encapsu = new Encapsulation();
		encapsu.setstuname("Ramesh");
		encapsu.setsal(10000);
		System.out.println(encapsu.getStuname());
		System.out.println(encapsu.getSal());
	}
}
