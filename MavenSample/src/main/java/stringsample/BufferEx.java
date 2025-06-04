package stringsample;

public class BufferEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s1= new StringBuffer("hello");
		StringBuilder s2= new StringBuilder("javaprogramming");
		System.out.println(s1);
		System.out.println(s2);
		//Insert Method : used to insert particular element in index
		s1.insert(1, "r");
		System.out.println(s1);
		//Replace : used to replace element using index,Starting and ending position 
		s2.replace(1, 4, "u");
		System.out.println(s2);
		//Append - add new string in exixting string
		s2.append("java");
		System.out.println(s2);
		//Reverse - reverse the string
		s1.reverse();
		System.out.println(s1);
		//Delete - index position element 
		s2.delete(1, 4);
		System.out.println(s2);
		
	}

}
