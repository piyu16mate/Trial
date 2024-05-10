package PriyaJavaTestExamples;

public class PrimeNumber {

	public static boolean PrimeEx(int a) {
		
		if(a<=1)
			return false;
		
		
		for(int i=2;i<a;i++)
		{
			if(a%2==0)
			{
				return false;
				
			}
			
			
		}
		return true;
		
		
	}
	
	public void getPrimeNumbers(int num)
	{
		for(int i=2;i<=num;i++)
		{
			if(PrimeEx(i))
			{
				System.out.print(i+" ");
			}
		}
		//return num;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrimeNumber abc=new PrimeNumber();
		/*System.out.println(abc.PrimeEx(10));
		System.out.println(abc.PrimeEx(13));
		System.out.println(abc.PrimeEx(7));
		System.out.println(abc.PrimeEx(2));*/
		
		abc.getPrimeNumbers(20);
	}

}
