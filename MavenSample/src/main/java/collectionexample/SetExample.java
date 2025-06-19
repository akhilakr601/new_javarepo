package collectionexample;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> s = new HashSet<String>();
		s.add("grapes");
		s.add("orange");
		s.add("apple");
		s.add("banana");
		s.add("kiwi");
		System.out.println(s);//un-ordered
		Set<String> s1 = new HashSet<String>();
		s1.add("red");
		s1.add("orange");
		s1.add("blue");
		s1.add("green");
		s1.add("yellow");
		System.out.println(s1);
		System.out.println(s1.addAll(s));
		System.out.println(s1);
		System.out.println(s);
		//contains
		System.out.println(s.contains("kiwi"));
		//containsAll
		System.out.println(s1.containsAll(s));
		//size
		System.out.println(s.size());
		System.out.println(s1.size());
		//isEmpty
		System.out.println(s1.isEmpty());
		//remove
		System.out.println(s1.remove(0));
		System.out.println(s1);
		//clear
		s.clear();
		System.out.println(s);

	}

}
