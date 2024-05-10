package Abstraction;

public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		SBI s= new SBI();
		s.getRateOfInterest();
		
		ICICI c= new ICICI();
		c.getRateOfInterest();
		
		s.Tenure();
		c.Tenure();
		
		System.out.println("==========================");
		RBI r= new SBI();

		r.getRateOfInterest();
		r.Tenure();
		
		RBI a= new ICICI();
		a.getRateOfInterest();
		a.Tenure();

	}

}
