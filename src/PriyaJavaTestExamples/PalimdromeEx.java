package PriyaJavaTestExamples;

public class PalimdromeEx {

	public static void isPalindrome(int num)
	{
		int temp=0;
		int sum=0;
		int originalValue=num;
		while(num!=0)
		{
			temp=num%10;
			sum=(sum*10)+temp;
			num=num/10;
			
			
		}
		if(originalValue==sum)
		{
			System.out.println(sum+"="+ "its Palindrome");
		}
		else
			System.out.println(sum+"="+ "its not Palindrome");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isPalindrome(151);
		isPalindrome(123);
		

	}

}
