package PriyaJavaTestExamples;

public class ReverseNumber {
	
	public String Rev(int num) {
		
		int n=0;
		String Rev="";
		while(num!=0)
		{
				n=num%10;
				Rev=Rev+n;
				num=num/10;
		}
		
		return Rev;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReverseNumber obj=new ReverseNumber();
		System.out.println("Reverse Number of value="+obj.Rev(132));
		
		
	}

}
