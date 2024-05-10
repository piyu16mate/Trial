package BasicPrograms;

public class PrimeNumbers {


	public void CheckPrimeNumber(int number)
	{
		boolean flag=false;
		
		
		if(number==1 || number==0)
		{
			flag=true;
			
		}
		for(int i=2;i<number/2;i++)
		{
			if(number%i==0)
			{
				flag=true;
				break;
			}
		}
		
		if(flag)
		{
		System.out.println(number+"="+"not a Prime");
			
		}
		else
		{
			System.out.println(number+"="+"prime");
			
		}
		
		
		
	}
	
	public void PrimeFun(int num)
	{
		
		for(int i=2;i<=num;i++)
		{
			CheckPrimeNumber(i);
			
		}
	}
	public static void main(String[] args) {
		
		/*PrimeNumbers a=new PrimeNumbers();
		 
		System.out.println(a.PrintPrimeNUmbers(11));*/
		
		PrimeNumbers p= new PrimeNumbers();
		p.PrimeFun(1);
		
		
	
	
	

	}

}
