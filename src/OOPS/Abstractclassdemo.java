package OOPS;

 abstract class Abstractclassdemo {

	public abstract void disp();
	public abstract void disp1();
}
 class Demo extends Abstractclassdemo{
	 
	 public void disp() {
		 System.out.println("This is first disp");
	 }
	 public void disp1() {
		 System.out.println("This is second disp1");
	 }
	 public static void main(String[] args) {
		Abstractclassdemo obj = new Demo();
		obj.disp();
		obj.disp1();
	}
 }
