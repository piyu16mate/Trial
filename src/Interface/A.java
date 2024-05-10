package Interface;

public interface A {
	public abstract void Display();
	public void show();
	
	default void check()// from java8 version we can define through static & default 
	{
		System.out.println("check");
	}
	
	static void check2()
	{
		System.out.println("static keyword check");
	}

}
