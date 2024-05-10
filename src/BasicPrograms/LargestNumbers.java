package BasicPrograms;



public class LargestNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=121;
		int b=443;
		int c=20;
		
		/*if(a>b && a>c)
		{
			System.out.println(a);
			
		}
		else if(b>a && b>c)
		{
			System.out.println(b);
		}
		else
			System.out.println(c);*/
		
		//Another type with Ternary Operator
		
		int temp=a;
		int largest;
		temp=a>b?a:b;
		largest=c>temp?c:temp;
		System.out.println(largest);
	
		
	
			
	}

}
