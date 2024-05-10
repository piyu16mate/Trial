package JavaInterviewCode;

public class RemoveSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1.remove spaces using Built in Merhod
		String s1="nsdjfk sjsd sdfs";
		
		System.out.println(s1.replaceAll("\\s",""));
		
		
		
		//2.remove spaces without using Built in Merhod
		
		/*String s1="nsdjfk sjsd sdfs";
		char ch[]=s1.toCharArray();
		
		String appstr="";
		
		for(int i=0;i<s1.length();i++)
		{
			if(ch[i]!=' ' && ch[i]!='\t')
			{
			appstr=appstr+ch[i];
				
			}
		}
		System.out.println(s1);
		System.out.println(appstr);*/
		
	}
	

}
