package SingletonExample;

public class singletonEX2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SingletonEx obj=SingletonEx.getObject();
		System.out.println(obj.x++);
		
		SingletonEx obj2=SingletonEx.getObject();
		System.out.println(obj2.x);
		
	}

}
