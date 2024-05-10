package SingletonExample;

public class ChildTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ParentTest obj2=ParentTest.getObjOfParent();
		System.out.println(obj2.x);
		
		ParentTest obj3=ParentTest.getObjOfParent();
		System.out.println(obj3.x);
		
		ParentTest obj34=ParentTest.getObjOfParent();
		System.out.println(obj34.x);
		
		
	}

}
