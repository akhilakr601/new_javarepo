package polymorphism;

public class ChildOverriding extends ParentOverriding{
	public void get() {
		super.get();
		System.out.println("Child class Overriding ");
	}
	
	@Override
	public void display(int x) {
		// TODO Auto-generated method stub
		super.display(8);//parent class value
		System.out.println(x);
	}

	@Override
	public void set(int a) {
		// TODO Auto-generated method stub
		super.set(12);
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildOverriding obj = new ChildOverriding();
		obj.get();
		obj.display(10);
		obj.set(15);
		

	}

}
