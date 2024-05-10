package ConstructorSuper;

public class B extends A{

	
	public B() {
		
	super(10);
	System.out.println(super.x);
		super.m1();	
		
	}
	
	public void Caseee()
	{
		System.out.println("inside B method");
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B b=new B();
		
		
		
	}

}
