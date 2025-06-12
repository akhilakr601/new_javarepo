package abstraction;

public class AbstractC  extends AbstractP{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractC obj = new AbstractC();
		obj.sum();
		obj.display();
		obj.data();
		obj.getData();
	}

	@Override
	public void sum() {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 4;
		int s = a+b;
		System.out.println(s);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Abstract class method");
	}
	public void getData() {
		System.out.println("Non abstract method in child class");
	}

}
