package StaticExamples;

public class StaticProg {
   
	static int x;
	void increment()
	{
		x++;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticProg p=new StaticProg();
		
		StaticProg p2=new StaticProg();
		
		p.x=0;
		
		p.increment();
		p2.increment();
		
		System.out.println(p.x+" "+p2.x);
		
	}
	

}
