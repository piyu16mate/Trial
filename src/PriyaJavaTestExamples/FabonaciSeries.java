package PriyaJavaTestExamples;

public class FabonaciSeries {
	
	public int fabo(int value) {
		
		int a=0;
		int b=1;
		int sum=0;
		
		// a0 b1 c1 2 3 5 8
		
		for(int i=1;i<=value;i++)
		{
			sum=a+b;
			System.out.print(sum+" ");
			a=b;
			b=sum;
			
		}
		
		return sum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	FabonaciSeries obj= new FabonaciSeries();
	obj.fabo(8);

	}

}
