package ArrayListPrograms;

import java.util.ArrayList;
import java.util.Iterator;

public class LearnIterator {
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i = 1; i < 100; i++) al.add(i);
		
//		Iterator<Integer> it = al.iterator();
//		al.iterator().remove();
//		System.out.println();
		
		
		while(al.iterator().hasNext()) {
			System.out.println(al.iterator().next());
		}
	}	
}
