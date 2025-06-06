package modifier;

import access_specifier.AccessSpecifierEx;

public class AcessEx3 extends AccessSpecifierEx{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AcessEx3 obj = new AcessEx3();
		obj.proMeth();
		obj.pubMeth();
		//private & default method cannot be accessed from outside the class
		AccessSpecifierEx obj1 = new AccessSpecifierEx();
		obj1.pubMeth();
		// protected can be used only from child class
		
		
		
	}

}
