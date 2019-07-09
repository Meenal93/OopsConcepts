package Polymorphism;

public class overloadingExample {

	public static void main(String[] args) {
		
		overloadingExample obj = new overloadingExample();
		obj.add(2 , 8);
		
		
	}
	
	public void add(int a, int b) {
		System.out.println(a + b);
	}
	
	public void add (byte a , byte b) {
		System.out.println(a + b);
		
	}
}
