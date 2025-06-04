package inheritance;

public class HeirachyChild1 extends HeriachiParent{
	public void method2() {
		System.out.println("helloo");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HeirachyChild1 obj = new HeirachyChild1();
		obj.method1();
		obj.method2();

	}

}
