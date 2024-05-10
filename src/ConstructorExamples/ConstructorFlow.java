package ConstructorExamples;

public class ConstructorFlow {

	{
		System.out.println("Non static block");
	}
	
	static
	{
		System.out.println("static block");
	}
	
	ConstructorFlow()
	{
		System.out.println("default constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorFlow obj= new ConstructorFlow();
	}

}
