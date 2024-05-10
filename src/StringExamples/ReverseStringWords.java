package StringExamples;

public class ReverseStringWords {

	public void reverse(String arr) {
		
		
		String [] newArr=arr.split(" ");
		String reversestri="";
		for(int i=newArr.length-1;i>=0;i--)
		{
			
			//System.out.println(newArr[i]);
			reversestri=reverseorderChar(newArr[i]);
			System.out.println(reversestri);
		}
			
		
	}
	
	public String reverseorderChar(String newArr) {
		
		String newstr="";
		for(int i=0;i<newArr.length();i++)
		{
			newstr=newArr.charAt(i)+newstr;
		}
		return newstr;
			
	}
		
		
	

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		ReverseStringWords words=new ReverseStringWords();
		String str="This is my String related Program";
		words.reverse(str);
	
     }
	
}

	