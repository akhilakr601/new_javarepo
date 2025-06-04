package superpackage;

public class SuperMethod2 extends SuperMethod1{
	public void getDisplay() {
		System.out.println("Child class Method");
		super.display();
	}
	public void getData(int a)
	{
		System.out.println(a);
		super.data(7, 5);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperMethod2 obj = new SuperMethod2();
		obj.getDisplay();
		//obj.display();
		obj.getData(8);

	}

}
