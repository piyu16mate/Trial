package PriyaJavaTestExamples;

public class SortArrayex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {40,71,9,14,3};
		
	//	int temp;
		for(int i=0;i<a.length;i++)
		{
			int temp=0;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
				
			}
			
			
		}
			
			
		
	}

}
