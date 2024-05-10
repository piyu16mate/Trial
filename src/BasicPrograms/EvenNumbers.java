package BasicPrograms;

public class EvenNumbers {

	public int sumOfNumbers(int a,int b) {
		
		int sum=0;
		for(int i=a;i<=b;i++)			
		{
			if(i%2==0)
			{
				System.out.println(i);
				sum=sum+i;//sum of even numbers
				
			}
		}
		//System.out.println("sum of even numbers"+sum);
		return sum;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EvenNumbers even=new EvenNumbers();
		int result=even.sumOfNumbers(2,20);
		System.out.println("sum is "+result);
		
			
		
	}

}
