package MethodOverridingEx;

public class B extends A{

	public B()
	{
		super();
		super.sum();
	}
	
	public void sum()
	{
		System.out.println("Sum method : in child class");
	}
	
	public static void main(String[] args) {
		
		A obj= new B();
		obj.sum();
		
		
		A obj1= new A();
		obj1.sum();
		
		C c= new C();
		c.add();

	}

}
