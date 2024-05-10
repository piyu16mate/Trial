package SingletonExample;

public class B{

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Singleton Design,here we are creating only one object and this 
		 * single copy used amony multiple classes through calling method*/
		 
		
		
		A obj1=A.getParentObj();
		System.out.println(obj1.x);
		
		A obj2=A.getParentObj();
		System.out.println(obj1.x);

	}

}
