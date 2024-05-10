package BasicPrograms;

public class FibonacciSeries {

	public int fibo(int num) {
		int a=0;
		int b=1;
		int c=0;
		System.out.print(a+" ");
		System.out.print(b+" ");
		for(int i=1;i<=num;i++)
		{
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
		
		return c;
		
	}
	public static void main(String[] args) {
		FibonacciSeries obj=new FibonacciSeries();
		int r=obj.fibo(5);
		
		

	}

}
// 0 1 1 2 3 5 8