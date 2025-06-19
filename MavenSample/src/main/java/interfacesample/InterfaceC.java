package interfacesample;

public class InterfaceC implements InterfaceP{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceC obj = new InterfaceC();
		obj.getData();
		obj.display();
		
		InterfaceP obj1 = new InterfaceC();//reference
		obj1.getData();//using parent reference can't get child class property
		
	}

	@Override
	public void getData() {
		// TODO Auto-generated method stub
		int sum = num+num2;
		System.out.println(sum);
	}
	public void display() {
		System.out.println("Child class method");
	}
}
