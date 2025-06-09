package aggregation;

public class AggreC {
int mark,rollno;
AggreP ref;

	AggreC(int mark, int rollno,AggreP ref){
	this.mark=mark;
	this.rollno=rollno;
	this.ref = ref;
	
}
public void display() {
	System.out.println(mark);
	System.out.println(rollno);
	System.out.println(ref.age);
	System.out.println(ref.name);
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AggreP obj1 = new AggreP(25,"appu");
		AggreC obj = new AggreC(12,5,obj1);
		obj.display();
	}

}
