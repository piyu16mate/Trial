package MethodOverLoadingEx;

public class B extends A{
	
	 public void name(int a,int b) {
			
			System.out.println("addtion of diff data type");
		}
	 

	public static void main(String[] args) {
		
		B b= new B();
		b.name(0,0);
		b.name(0, 0);
	}

}
