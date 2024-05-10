package MethodOverridingEx;

public class SBIClient extends companyTest {
	
	
	public static void main(String args[]) 
	{
		//SBIClient obj= new SBIClient();
		//obj.login();
		//obj.Encryption();
		
		/*companyTest obj = new companyTest();
		obj.login();
		obj.Encryption();*/
		
		companyTest test=new SBIClient();
		test.login();
		test.Encryption();
		
		
	}

}
