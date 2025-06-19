package collectionexample;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("blue");
		ar.add("green");
		ar.add("yellow");
		ar.add("red");
		System.out.println(ar);
		ArrayList<String> li = new ArrayList<String>();
		li.add("grapes");
		li.add("orange");
		li.add("apple");
		li.add("banana");
		System.out.println(li);
		//addAll ==> combine two list
		System.out.println(ar.addAll(li));
		System.out.println(ar);
		
		//containsAll ==> wheather the list is present in other list
		System.out.println(ar.containsAll(li));
		System.out.println(li.containsAll(ar));
		System.out.println("/////////////////");
		//iterator
		Iterator itr=ar.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		itr.remove();
		System.out.println(ar);
		Iterator itr1=ar.iterator();

		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		itr1.remove();
		System.out.println(ar);

		

		
		
	}

}
