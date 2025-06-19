package exceptionhandling;

public class ExceptionEx {

	public static void main(String[] args) {
		// Arithementic Exception
		try {
			int a= 10;
			int s= a/0;
			System.out.println(s);

		}
		catch(ArithmeticException ae){
			System.out.println("Exception handled");

		}
		finally{
			System.out.println("exit code");
		}
		
		//Array index out of bound
		try {
		int ar[]= {2,4};
		for(int i =0 ;i<=3;i++) {
			System.out.println(ar[i]);
		}
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println("exception handled in array");
		}
		finally
		{
			System.out.println("exit array code");
		}
		/*String s = null;
		System.out.println(s.length());*/
		
		
	}

}
