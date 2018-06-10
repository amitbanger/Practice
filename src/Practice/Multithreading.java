package Practice;

public class Multithreading extends Thread{
	public void run()
	{
		System.out.println("This is my first multithreading class");
	}
	public static void main(String[] args) {
		Multithreading obj = new Multithreading();
		obj.start();
	}
	
	class count extends Thread{
		
		count()
		{
			super("My extending thread");
			System.out.println("my thread created"+ this);
			start();
		}
		
		}

}
