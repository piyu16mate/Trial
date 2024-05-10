package PriyaJavaTestExamples;

public class AdditionofRows {

	public void additionRows(int[][]arr) {
		
		
		for(int i=0;i<arr.length;i++)
		{
			
			int sum=0;
			for(int j=0;j<arr[i].length;j++)
			{
				sum=sum+arr[i][j];
			}
			
			System.out.println(sum);
			
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr= {{1,3,2},{5,8,9,},{4,8,2}};
		
		AdditionofRows obj=new AdditionofRows();
			obj.additionRows(arr);
		
		

	}

}
