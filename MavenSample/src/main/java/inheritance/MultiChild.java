package inheritance;

public class MultiChild extends MultiInter{
	public void method3() {
		System.out.println("child classs");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiChild obj = new MultiChild();
		obj.method1();
		obj.method2();
		obj.method3();
	}

}
