package StringExamples;

public class CountwordsEx {

	public int countwords(String str) {
		
		String[] arr=str.split(" ");
		return arr.length;
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="This is my first Program";
		int count=0;
		CountwordsEx obj=new CountwordsEx();
		count=obj.countwords(str);
		System.out.println(count);
		
		
		
		
		
	}

}
