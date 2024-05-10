package StaticExamples;

public class Test {

	int x=10;
	static int y=20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test obj=new Test();
		obj.x++;
		System.out.println(obj.x);
		Test.y++;
		
		System.out.println(y);
		Test obj2=new Test();
		
		obj2.x++;
		System.out.println(obj.x);
		Test.y++;
		System.out.println(y);
		
		
		
		
	}

}
