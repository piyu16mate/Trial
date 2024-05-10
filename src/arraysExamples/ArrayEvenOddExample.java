package arraysExamples;

public class ArrayEvenOddExample {

	public void  printEvenNumber(int [] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println("elements at even position is"+arr[i]);
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {3,4,7,1,10,2,8,21,14};
		
		ArrayEvenOddExample obj=new ArrayEvenOddExample();
		obj.printEvenNumber(arr);

	}

}
