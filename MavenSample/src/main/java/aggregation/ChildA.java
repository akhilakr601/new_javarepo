package aggregation;

public class ChildA {
	int mark1,mark2;
	ParentA ref;
	
	ChildA(int mark1,int mark2,ParentA ref){
		this.mark1=mark1;
		this.mark2=mark2;
		this.ref = ref;
		
		
		
	}
	public void display() {
		System.out.println("Mark1:" +mark1);
		System.out.println("Mark1:" +mark2);
		System.out.println("ClassName :"+ref.classname);
		System.out.println("Rollno:  "+ref.rollno);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentA obj = new ParentA("plus two",14);
		ChildA obj1 = new ChildA(58,65,obj);
		obj1.display();
		

	}

}
