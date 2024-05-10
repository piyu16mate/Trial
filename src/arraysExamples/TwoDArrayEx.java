package arraysExamples;

public class TwoDArrayEx {

	public int[][] display2DArra(int arr[][])
	{
		arr[0][0]=2;
		arr[0][1]=3;
		arr[0][2]=44;
		arr[0][3]=12;
		
		arr[1][0]=25;
		arr[1][1]=32;
		arr[1][2]=40;
		arr[1][3]=121;
		
		arr[2][0]=11;
		arr[2][1]=3;
		arr[2][2]=50;
		arr[2][3]=128;

		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		return arr;
		
		
		//return arr;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][]=new int[3][4];
		
		TwoDArrayEx obj=new TwoDArrayEx();
		obj.display2DArra(a);
		
	}

}
