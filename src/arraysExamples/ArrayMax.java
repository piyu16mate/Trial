package arraysExamples;

public class ArrayMax {

	public int findMaxNumber(int arr[]) {
		
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
				
				
			
		}
		//System.out.println(max);
		return max;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {2,6,8,12,5678};
		ArrayMax obj=new ArrayMax();
		int max=obj.findMaxNumber(a);
		System.out.println(max);
		
	}

}
