package BasicPrograms;

public class FactorialNumber {

	public int Fact(int num) {
		
		int sum=1;
		for(int i=num;i>=1;i--) {
			
			sum=sum*i;
		}
		return sum;
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactorialNumber obj=new FactorialNumber();
		System.out.println("output="+obj.Fact(7));
		
	}

}
