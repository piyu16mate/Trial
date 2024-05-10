package MethodOverridingEx;

public class ICICIClient extends companyTest{

	
	int a=30;
	@Override
	public void Encryption()
	{
		System.out.println("Use ICICI own Encryption method");
		
	}
	
	public void checkout()
	{
		System.out.println("Use checkout of ICICI Bank");
	}
	
	public static void main(String args[]) 
	{
		companyTest obj=new ICICIClient();//Upcasting
		
		obj.login();
		System.out.println(obj.a);//it will call parent class variable a
		obj.Encryption();
		
		
		
		
		
		
	}
}
