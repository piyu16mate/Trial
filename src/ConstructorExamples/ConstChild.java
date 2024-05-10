package ConstructorExamples;

public class ConstChild extends ConstParent{

	
	public ConstChild()
	{
		System.out.println("Default constructor of Child class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ConstChild obj= new ConstChild();
		ConstParent obj= new ConstChild();
	}

}
