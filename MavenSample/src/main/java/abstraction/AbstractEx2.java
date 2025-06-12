package abstraction;

public class AbstractEx2 extends AbstractEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractEx1 obj = new AbstractEx2();//parent class reference
		obj.display();
		AbstractEx2 obj2= new AbstractEx2();//child class object
		obj2.getData();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Abstract method");
	}
	public void getData() {
		System.out.println("child class method");
	}

}
