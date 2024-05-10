package StringExamples;

public class frequencyofword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="priya sujit mate priya";
		
		String[] newString=str.split(" ");
		
		int count=0;
		
		for(int i=0;i<newString.length;i++)
		{
			count =1;
			for(int j=i+1;j<newString.length;j++)
			{
				if(newString[i]==newString[j])
				{
					count++;
					newString[j]="0";
				}
			}
			if(count<=1 && newString[i]!="0")
			{
				System.out.println(newString[i]+count);
			}
		}
			

	}

}
