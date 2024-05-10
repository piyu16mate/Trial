package arraysExamples;

public class FrequencyofElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,4,5,5,7,8,5,1,4,3,6};
		
		int count;
		
		
		/*int newA[]=new int[a.length];
		
		for(int i=0;i<a.length;i++)
		{
			count=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
				count++;
				newA[j]=compared;
				}
				
			}
			
			if(newA[i]!=compared)
			{
				newA[i]=count;
			}
		}
		
		for(int i=0;i<newA.length;i++)
		{
			if(newA[i]!=compared)
			{		
				System.out.println(a[i]+" "+newA[i]);
			}
		}*/
		
		
		/**********new try***********/
		
		
		
		for(int i=0;i<a.length;i++)
		{
			count=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					
					count++;
					a[j]=-1;
				}
			}
			
		if(count>1 && a[i]!=-1)
			{
			System.out.println(a[i]+"="+count);
			}
			
		}
		
		
		
	}

}
