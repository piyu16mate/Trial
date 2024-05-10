package StringExamples;

public class seggerigatestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str="abc123**((";
		
		char alpha;
		char num;
		char special;
		for(int i=0;i<str.length();i++)
		{
			int ascii=str.charAt(i);
			if(ascii>=65 && ascii<=122)
			{
				alpha=(char)ascii;
				System.out.print(alpha+"");
			}
			else if (ascii>=0 && ascii<=127)
			{
				num=(char)ascii;
				System.out.print(num+"");
			}
			else {
				System.out.println("specail smbols are ");
			}
		}
		
	//	System.out.println("alphabets are "+aplha);
	//	System.out.println("numbers are "+num);
		
	}

}
