package PriyaJavaTestExamples;

public class reverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="yes its my practise";
		
		String[] newStr=str.split(" ");
		
		for(int i=newStr.length-1;i>=0;i--)
		{
			System.out.println(newStr[i]);
		}

	}

}
