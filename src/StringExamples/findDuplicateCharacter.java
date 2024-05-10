package StringExamples;

public class findDuplicateCharacter {

	public void FindDuplicate(String str) {
		
		
		char ch[]=str.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			count=1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
					ch[j]=0;
				}
			}
				
			if(count>1 && ch[i]!=0)
			{
				System.out.println(ch[i]+"="+count);
				//System.out.print(ch[i]+count);//remove duplicate elements
			}
		}
		
			
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="JavaseleniumPythonnnn";
		
		findDuplicateCharacter obj=new findDuplicateCharacter();
		obj.FindDuplicate(str);
	}
	

}
