package superpackage;

public class SuperConEx2 extends SuperConEx1 {

	SuperConEx2(){
		super(8);// this will be excuted if we don't call non parametrized constructor in parent class
		System.out.println("Child Class Constructor");
	}
	SuperConEx2(int x){
		
		System.out.println(x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperConEx2 obj = new SuperConEx2();
		SuperConEx2 obj1 = new SuperConEx2(9);
	}

}
