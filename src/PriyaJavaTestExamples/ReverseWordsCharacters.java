package PriyaJavaTestExamples;

public class ReverseWordsCharacters {

	public void reverseWords(String str) {
		
		String[] newstr=str.split(" ");
		String result="";
		for(int i=newstr.length-1;i>=0;i--)
		{
			result=reverseChar(newstr[i]);
			System.out.println(result);
			
		}
	}
	
	public String reverseChar(String str1) {
		
		String newstr="";
		
		for(int i=0;i<str1.length();i++)
		{
			newstr=str1.charAt(i)+newstr;
			
		}	
		return newstr;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReverseWordsCharacters obj=new ReverseWordsCharacters();
		String str="yes its my second trial string Program";
		obj.reverseWords(str);
	}

}
