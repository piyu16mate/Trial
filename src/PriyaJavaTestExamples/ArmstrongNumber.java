package PriyaJavaTestExamples;

public class ArmstrongNumber {

	public void ArmFunction(int num) {
		
		int temp=0;
		int result=1;
		int originalValue=num;
		int sum=0;
		while(num!=0)
		{
			temp=num%10;
			result=temp*temp*temp;
			
			num=num/10;
			sum=sum+result;
			
		}
		
		if(sum==originalValue)
		{
			System.out.println("Armstrong Number");
		}
		
		else
			System.out.println("Not an Armstrong Number");
		//return result;
		
	}
	
	public static void main(String[] args) {
		
		ArmstrongNumber obj= new ArmstrongNumber();
		obj.ArmFunction(153);

	}

}
