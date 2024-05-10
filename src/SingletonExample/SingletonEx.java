package SingletonExample;

public class SingletonEx {
	
	int x=10;
	 static SingletonEx E =null;
	
	 private SingletonEx()
	 {
		 System.out.println("Default constructor");
	 }
	public static SingletonEx getObject()
	{
		if(E==null)
		{
			E=new SingletonEx();
			return E;
		}
		else
			return E;
	}


}
