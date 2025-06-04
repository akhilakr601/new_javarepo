package inheritance;

public class SingleChild extends SingleParent{
public void getDetails(){
	System.out.println("child class");
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleChild n = new SingleChild();
		n.getDetails();
		n.display();
		SingleParent o = new SingleParent();
		o.display();
		//o.getDetails() we cannot access child class property using parent class obj
		
	}

}
