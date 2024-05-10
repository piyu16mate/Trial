package SingletonExample;

 

public class ParentTest {
	
	int x=90;
	static ParentTest p=null;
	private ParentTest()
	
	{
		System.out.println("Parent class constructor");
	}
	
	public static ParentTest getObjOfParent()
	{
		if(p==null)
		{
			p=new ParentTest();
			return p;
		}
		else
			return p;
	}

}
