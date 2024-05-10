package StringExamples;

public class FindOcurrenceVowelsConsonants {

	public void findVowels(String str) {
		
		char currentCh;
		int Vowelcount=0;
		int Consonantcount=0;
		int spaces=0;
		for(int i=0;i<str.length();i++)
		{
			currentCh=str.charAt(i);
			
	if(currentCh=='a'||currentCh=='e'||currentCh=='i'||currentCh=='o'||currentCh=='u')
	{
		//System.out.print(currentCh);
		Vowelcount++;
	}
	else if(currentCh==' ')
	{
		System.out.println(spaces++);
	}
	
	else
		Consonantcount++;
	
		}
		
		System.out.println("Total vowels are :"+Vowelcount);
		System.out.println("Total consonants are :"+Consonantcount);
		System.out.println("Total spaces are :"+spaces);
		
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="vbfgttt ae io khgff";
		
		FindOcurrenceVowelsConsonants obj=new FindOcurrenceVowelsConsonants();
		obj.findVowels(str);
	}

}
