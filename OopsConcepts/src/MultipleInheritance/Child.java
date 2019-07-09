package MultipleInheritance;

public class Child  extends ParentClass1 implements Interface1 , Interface2 {

	@Override
	public void show() {
		
		System.err.println("Child method ");
		
	}
	
	public static void main(String[] args) {
		
		Child obj = new Child();
		obj.show();
		
		
	}
	

	
}
