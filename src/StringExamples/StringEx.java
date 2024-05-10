package StringExamples;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*string creating objects*/
		
		
	/*	String str1= new String("Java");
		System.out.println(str1+"sdfsd");
		String str2= new String("selenium");
		String str3="java";
		String str4=str2.intern();
		if(str3==str4)
		{
			System.out.println("both are haaving same address");
			
		}
		else
			System.out.println("both are haaving diff address");*/
		
		String st5="Selenium";
		/*String Litera;*/
		String str1="Java";
		String str2="Java";
		String str3= new String("Priya");
		String str4=str3.intern();
		if(str1==str4)
		{
			System.out.println("both are equal");
		}
		else
			System.out.println("both are not equal");
		
		
		
		/*1.check for length of string use length() method
		System.out.println(str1.length());*/
		
		/*2.using equals(),check values are equal or not
		if(str1.equals(str2))
		{
			System.out.println("both value are same");
			
		}
		else
			System.out.println("both value are different");*/
		
		/*3.check values are equal or not without their cases,use egualignorecase
		
		if(str1.equalsIgnoreCase(str2))
		{
			System.out.println("both value are same");
			
		}
		else
			System.out.println("both value are different");*/
		
		/*4.use intern method it will check that value in constant pool if that value is same so it will return that address
		so this method use when we created obj and that object has same value which also
		present in pool , so to refer the same address in pool we use intern()
		
		if(str3==str4)
		{
			System.out.println("both string variables contains same value");
			
		}
		else
			System.out.println("both string variables contains diff value");*/
		
		
		
		/* 5.charAt() to print specific character at index
		
		System.out.println(str1.charAt(2));*/
		
		/*6. contains method to check values present or not
		
		System.out.println(st5.contains("eni"));*/
		
		/*7. contentequals()
		
		System.out.println(st5.contentEquals("Selenium"));*/
		
		/*8.startswith() check for value at start of index
		
		System.out.println(st5.startsWith("Sel"));*/
		
		/*9 Endswith() check for value at end of index
		 System.out.println(st5.endsWith("ium"));*/
		
		/*10.indexof() return index of given value
		
		System.out.println(st5.indexOf("ium"));
		
		System.out.println(st5.indexOf("en",3));*/
		
		
		/*11 isblank()=dose not count chracters
		//isEmpty()=return characters
		
		String strr="   ";
		System.out.println(strr.isBlank());//isblank return true if there is blank space 
		
		System.out.println(strr.isEmpty());//isEmpty return false if there is blank space it means it contains ascii value
		
		System.out.println(strr.length());*/
		
		/*12 replace()
		
		System.out.println(st5.replace("S", "J"));
		System.out.println(st5.replace("Sel", "JFG"));*/
		
		/*13 substring()
		String a="Hello world this is java";
		System.out.println(a.substring(5));
		System.out.println(a.substring(5,14));*/
		
		/*14 split() return word before and after by using split method
		String a="Hello world this is java";
		String[] b=a.split("this");
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
			
		}*/
		
		/*15 valueof() convert any primitive data into string
		int a=123;
		String str=String.valueOf(a);
		
		System.out.println(str);*/
		
		
		/*16 compareTo() it will return integer by comparing ascii value
		
		String a="abc";
		String c="abf";
		
		System.out.println(a.compareTo(c));*/
		
		/*17  strip() remove all white spaces from start and end
		
		String value="     dshs sfskl;fs sdfsdf   ";
		System.out.println(value.strip());*/
		
		//18 stringbuffer and string builder class ,both are mutable
		
		
		
		
		
		
		
		
		
		  
		 
		 
		
		
		
		
		
	}

}
