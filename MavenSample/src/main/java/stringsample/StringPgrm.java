package stringsample;

public class StringPgrm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String s = "hello";
	String n = new String ("java program");
	System.out.println(s);
	System.out.println(n);
	
	//concat==> Add two strings 
	System.out.println(s.concat(n));
	//length ==>To identify the size of string
	System.out.println(s.length());
	//contains==>to check wheather character is present in the string 
	String s1="how are you";
	System.out.println(s1.contains("r"));
	System.out.println(s.contains(n));
    String s3="java";
    String s4="java";
    String s5="JAVA";
    String s6 ="selenium";
    String s8="";
    //equals==>used to compare two strings
    System.out.println(s3.equals(s4));
    System.out.println(s3.equals(s5));
    System.out.println(s3.equals(s6));

    //equalIgnoreCase==>
    System.out.println(s3.equalsIgnoreCase(s5));
    
    String s7= new String ("java");
    System.out.println(s3.equals(s7));
    System.out.println(s3==s7);//used to compare the reference not value.
	//to uppercase ==> to convert lower case to upper case
    System.out.println(s3.toUpperCase());
    //to lowercase ==> convert upper case to lower
    System.out.println(s5.toLowerCase());
    //isempty==>check wheather the string is empty or not
    System.out.println(s3.isEmpty());
    System.out.println(s8.isEmpty());
    //valueof ==> used for type conversion.
    //to convert any datatype to string
    
    int n1=5;
    System.out.println(String.valueOf(n1));

	}

}
