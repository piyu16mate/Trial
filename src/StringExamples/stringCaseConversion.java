package StringExamples;

public class stringCaseConversion {

	public void ConvertCade(String str) {
		
		char c;
		for(int i=0;i<str.length();i++)
		{
			int asciiValue=str.charAt(i);
			
			if(asciiValue>=97 && asciiValue<=122)
			{
				asciiValue=asciiValue-32;
				c=(char)asciiValue;
				System.out.print(c);
			}
			else if (asciiValue>=65 && asciiValue<=90)
			{
				asciiValue=asciiValue+32;
				c=(char)asciiValue;
				System.out.print(c);
			}
			
		}
		
			
		
		
		
			
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str="JaVaSeLeNium";
		stringCaseConversion obj=new stringCaseConversion();
		obj.ConvertCade(str);
	}
	

}
