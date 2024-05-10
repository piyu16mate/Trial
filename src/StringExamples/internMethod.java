package StringExamples;



public class internMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="java";
		String s3="jskdf";
		String s2= new String("selenium");
		
		System.out.println(s2);
            
		System.out.println("after intern method");
		s2=s1.intern();
		System.out.println(s2);//it will alsom hold the reference where s1 is holdig
		//for literal
		System.out.println(s3);
		s3=s1.intern();
		System.out.println(s3);
	}

}
