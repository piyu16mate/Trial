package Interface;

public class UserImplementation extends ParentCl implements UserEntry{

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UserImplementation obj= new UserImplementation();
		obj.Login("Priya", "Gondane");
		obj.Register("priyamate");
		obj.HomePage();
		System.out.println("========================");
		UserEntry e=new UserImplementation();
		e.Login("david", "ken");
		e.Register("abc@gmail.com");

	}

	@Override
	public void Login(String UserName, String Password) {
		// TODO Auto-generated method stub
		
		System.out.println("Hi "+UserName+Password);
		
	}

	@Override
	public void Register(String Email) {
		// TODO Auto-generated method stub
		System.out.println("you Register with "+Email);
	}

}
