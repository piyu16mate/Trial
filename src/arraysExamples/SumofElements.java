package arraysExamples;

public class SumofElements {
	
	public int sumOfArrayEle(int arr[]) {
		
		int sum=0;
		
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		return sum;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]arr= {1,5,7,3,4,8};
		SumofElements obj =new SumofElements();
		System.out.println("value of array elements"+obj.sumOfArrayEle(arr));
		
	}

}
