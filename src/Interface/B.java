package Interface;

public class B implements A {

	
	public void check()
	{
		System.out.println("Check into Child class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A obj= new B();//Method Overriding,Type Promotion(Guranted By Parent Interface)
		obj.Display();
		obj.show();
		B obj1= new B();
		obj1.check();
		

	}
	@Override
	public void Display() {
		// TODO Auto-generated method stub
		System.out.println("In Interface Method");
		
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		
		System.out.println("In show");
	}

}
