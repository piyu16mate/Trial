package PriyaJavaTestExamples;

public class FactorialNumber {

	public int Fact(int num) {
		
		int sum=1;
		for(int i=1;i<=8;i++)
		{
			sum=sum*i;
			
		}
		return sum;
		
	}
	
	public int Factorial(int num) {
		
		if(num==0)
			return 1;
		
		else
			return (num*Factorial(num-1));
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FactorialNumber abc= new FactorialNumber();
		
		System.out.println("Factorial output="+abc.Fact(8));
		System.out.println("Recurrsive Factorial Number"+abc.Factorial(10));
		

	}

}
