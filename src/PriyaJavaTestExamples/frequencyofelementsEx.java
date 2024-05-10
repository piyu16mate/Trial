package PriyaJavaTestExamples;

public class frequencyofelementsEx {

	public void findfrequency(int arr[]) {
		
		int count;
		int compared=-1;
		int newArr[]=new int[arr.length];
		
		
		
		for(int i=0;i<arr.length;i++)
		{
			count=1;
			for(int j=0;i<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					newArr[j]=compared;
				}
			
			}
			
			if(newArr[i]!=compared)
			{
				newArr[i]=count;
			}
		}
		
		for(int i=0;i<newArr[i];i++)
		{
			System.out.println(arr[i]+" "+newArr[i]);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		frequencyofelementsEx obj=new frequencyofelementsEx();
		
		int arr[]= {3,5,1,4,3,9,3};
		obj.findfrequency(arr);

	}

}
