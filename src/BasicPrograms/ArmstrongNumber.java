package BasicPrograms;


public class ArmstrongNumber {

	//Armstrong is number is equal to sum of cubes of digits
	
	
	/*public void armstrong(int n) {
		
		//153 =3*3*3//1*1*1*+5*5*5+3*3*3
		int temp=1;
		int sum=0;
		int num=1;
		int original=n;
		while(n>0)
		{
			temp=n%10;
			num=temp*temp*temp;
			n=n/10;
			sum=sum+num;
			
		}
		if(original==sum)
		{
			System.out.println("Armstrong Numbr");
		}
		else
			System.out.println("Not an Armstrong Number");
			
		
		
		
		
	}*/
	public static void main(String[] args) {
		
		//ArmstrongNumber obj=new ArmstrongNumber();
	//	obj.armstrong(151);
		
		int n=153;
		int temp=1;
		int num=1;
		int newv;
		int sum=0;
		newv=n;
		while(n>0)
		{
			temp=n%10;
			num=temp*temp*temp;
			n=n/10;
			sum=sum+num;
		}
		
		if(newv==sum)
		{
			System.out.println(newv+"Armstrong number");
		}
		else
			System.out.println("not armstriong");
	}

	

}
