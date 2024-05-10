package ConstructorThis;

public class Test {

	
	int x;
	
	public Test()
	{
		System.out.println("in default constructor");
	}
	
	public void m1()
	{
		System.out.println("in m1 method");
	}
	public Test(int x)
	{
		this();//It will invoke current class default constructor
		this.x=x;//It will invoke current class's Instance variable x
		this.m1();//It will invoke current class's method
		System.out.println(x);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test obj= new Test(10);
		
	}

}
