package arraysExamples;

public class CopyArrays {

	public int[] copyofArrays(int arr1[],int [] arr2) {
		
		System.arraycopy(arr1, 0, arr2, 0, 7);
		//System.arraycopy(arr1, 2, arr2, 0, 4);
		/*for(int i=0;i<arr2.length;i++)
		{
			System.out.print(arr2[i]);
		
		}*/
		return arr2;
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr1[]= {5,6,3,7,3,9,22};
		int arr2[]=new int[arr1.length];
		/*CopyArrays c= new CopyArrays();
		c.copyofArrays(arr1,arr2);
		//System.out.println(arr2);
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr2[i]);
		}*/
		
		for(int i=0;i<arr1.length;i++)
		{
			arr2[i]=arr1[i];
			System.out.print(arr2[i]);
		}
		
		
		
	}

}
