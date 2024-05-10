package MethodOverLoadingEx;

public class MethodOverTest {

	void sum(int a,int b)
	{
		System.out.println("in INT method");
		System.out.println(a+b);
	}
	
	void sum(int a,long b)//changing the data type 
	{
		System.out.println("in Long method");
		System.out.println(a+b);
		
	}
	
	double sum(int a,int b,int c)// changing the number of arguments
	{
		System.out.println("in increase variab;e method");
		//System.out.println(a+b);
		return a+b+c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	MethodOverTest obj=new MethodOverTest();
	obj.sum(1, 2);//type promotion
	
obj.sum(1, 2,3);
	
	obj.sum(5, 6l);
	//int-long ,float,double	
	}

}
