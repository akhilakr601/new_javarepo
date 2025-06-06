package access_specifier;

public class AccessSpecifierEx {

	public void pubMeth() {
		System.out.println("This is a public method");
	}
	private void privMeth() {
		System.out.println("This is a private method");
	}
	protected void proMeth() {
		System.out.println("This is a Protected method");
	}
	void defMeth() {
		System.out.println("This is default method");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessSpecifierEx obj = new AccessSpecifierEx();
		obj.pubMeth();
		obj.privMeth();
		obj.proMeth();
		obj.defMeth();

	}

}
