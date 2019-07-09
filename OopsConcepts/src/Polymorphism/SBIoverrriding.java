package Polymorphism;

public class SBIoverrriding extends RBIbank{
	
	public static void main(String[] args) {
		
		SBIoverrriding obj = new SBIoverrriding();
		obj.getHomeLoan();
		
	}
	
	public void getHomeLoan () {
		
		System.out.println( 7.5 + " SBI" );
		
	}
	
	

}
