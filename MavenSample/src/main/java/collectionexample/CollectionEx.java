package collectionexample;

import java.util.ArrayList;
import java.util.List;

public class CollectionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> li = new ArrayList<String>();//list reference
		//Add method ==> to add elements in list
		li.add("red");
		li.add("blue");
		li.add("black");
		li.add("green");
		System.out.println(li);
		//set method ==> to set element based on index (replace element)
		li.set(1, "green");
		System.out.println(li);
		//indexOf ==> return the index of element // repeated element first occurence
		System.out.println(li.indexOf("green"));
		//lastIndexOf ==> last occurence
		System.out.println(li.lastIndexOf("green"));
		//get ==> get particular element using index or retrive
		System.out.println(li.get(2));
		//contains ==> check that element is in list(T/F)
		System.out.println(li.contains("red"));
		//remove
		System.out.println(li.remove(0));
		System.out.println(li);
		
		//isEmpty ==> to check list is empty or not
		System.out.println(li.isEmpty());
		//size ==> length of list
		System.out.println(li.size());
		for(int i =0;i<li.size();i++) {
			System.out.println(li.get(i));
		}
		for(String r :li) {
			System.out.println(r);
		}
		
		
		
	}

}
