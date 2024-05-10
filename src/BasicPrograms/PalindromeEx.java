package BasicPrograms;

public class PalindromeEx {

	public void palindromeNumber(int num) {
		
		//Panindrome is when digits are reverse the value is same
		int originalvalue=num;
		int temp=0;
		int sum=0;
		while(num>0)
		{
			temp=num%10;//temp=1,5,1
			sum=(sum*10)+temp;//sum=1,(1*10)+5=15 ,(15*10)+1=151
			num=num/10;//15,1
			
			
		}
		
		if(originalvalue==sum)
		{
			System.out.println("Palindrome Number "+sum);
		}
		else
		{
			System.out.println("Not a Palidrome Number "+sum);
		}
			
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PalindromeEx obj=new PalindromeEx();
		obj.palindromeNumber(151);
		obj.palindromeNumber(123);
		obj.palindromeNumber(71);
	}

}
