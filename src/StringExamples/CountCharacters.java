package StringExamples;

public class CountCharacters {
	
	public int countChar(String ch) {
		
		char[] c=ch.toCharArray();
		
		return c.length;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="This is my second program";
		CountCharacters ch=new CountCharacters();
		int count=ch.countChar(s);
		System.out.println(count);
	}
	
	

}
