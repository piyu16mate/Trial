package SingletonExample;

public class A {
	
	int x=10;
	static A obj=null;// here to share single copy of obj among multiple class will make static
	private A()
	{
		System.out.println("Default constructor of Parent class");
		
	}

	public static A getParentObj()
	{
		if(obj==null)
		{
			obj=new A();
			return obj;
		}
		else
			return obj;
		
		
	}


}