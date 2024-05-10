package StaticExamples;

public class Test2 {
	
	{
		System.out.println("in nonstatic block");
	}
	
	public void m1()
	{
		System.out.println("in non sttaic m1 method");
	}
	static
	{
		System.out.println("in static block");
	}
	
	
	public static void m2()
	{
		System.out.println("in static m2 method");
		
		int a;
		
		//static int p=20;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test2 obj=new Test2();
		obj.m1();
		Test2.m2();
		
		Test2 obj2=new Test2();//here static block wont execute again as its in class loads in memory only once
		//and non sttaic block will execute again as we create object again
		
	}

}
