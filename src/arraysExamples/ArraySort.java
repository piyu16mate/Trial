package arraysExamples;

public class ArraySort {

	public void arraySort(int [] arr) {
		
		for(int i=0;i<arr.length;i++)
		{
			int temp=0;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
					
				
			}
			System.out.print(arr[i]+" ");
		}

		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {44,67,3,1,78,0};
		
		
		ArraySort sort=new ArraySort();
		sort.arraySort(arr);
		
	}
	

}
