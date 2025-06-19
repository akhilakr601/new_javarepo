package interfacesample;

public class MultiInterface implements MultipleInter1,MultipleInter2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiInterface obj = new MultiInterface();
		obj.getAge();
		obj.getName();
	}

	@Override
	public void getName() {
		// TODO Auto-generated method stub
		System.out.println("akhila");
	}

	@Override
	public void getAge() {
		// TODO Auto-generated method stub
		System.out.println(24);
	}

}
