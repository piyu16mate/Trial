package BasicPrograms;

public class reverseNumber {

/*	public void reverseOrder(int n) 
	{
		int temp=1;
		String rev="";
		while(n>0)
		{
			temp=n%10;
			rev=rev+temp;
			n=n/10;
			
		}
		System.out.println(rev);
			
	}*/
	public String reverseNum(int num)
	{
		int n=0;
		String rev="";
		while(num>0)
		{
			n=num%10;
			rev=rev+n;
			num=num/10;
			
		}
		
		return rev;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseNumber obj=new reverseNumber();
		//obj.reverseOrder(123);
		String ouput=obj.reverseNum(112);
		System.out.println(ouput);
	}

}
