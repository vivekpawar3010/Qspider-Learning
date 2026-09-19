
package CustomArrayList;

import java.util.ArrayList;

public class ListArrayDriver {

	public static void main(String[] args) {

		ListArray<Integer> l1 = new ListArray<>();

		l1.add(11);
		l1.add(12);
		l1.add(13);
		l1.add(14);
		l1.add(15);
		l1.add(16);
		l1.add(17);
		l1.add(18);
		l1.add(19);
		l1.add(20);

		System.out.println("list - l1 = " + l1);

		System.out.println("size of l1 = " + l1.size());

		l1.add(2, 100);
		System.out.println("add(2, 100) = " + l1);


		System.out.println("element at index 2 = " + l1.get(2));
		
		System.out.println("contains 12 = " + l1.contains(12));


		System.out.println("Inndex of 12 = " + l1.indexOf(12));


		System.out.println("l1 empty or not = " + l1.isEmpty());


		


		System.out.println("------------------- constructor cping another list ----------------");
		ListArray<Integer> l3 = new ListArray<>(l1);

		System.out.println("l3 = " + l3);


		


		System.out.println("------------------- addAll() ----------------");
		l3.addAll(l1);

		System.out.println("l3 after addAll(l1) = " + l3);


		

		System.out.println("-------------------- remove(element) ----------------");
		l1.remove(100);

		System.out.println("l1 after removing 100 = " + l1);


		


		System.out.println("------------------- remove(index) ----------------");
		Object removedElement = l1.remove(0);

		System.out.println("Removed element = " + removedElement);

		System.out.println("l1 after remove(0) = " + l1);


		

		ListArray<Integer> l4 = new ListArray<>();

		l4.add(12);
		l4.add(14);
		l4.add(16);

		System.out.println("---------------- removeAll() ----------------");

		System.out.println("Before removeAll = " + l1);
		l1.removeAll(l4);


		System.out.println("After removeAll = " + l1);


		

		ListArray<Integer> l5 = new ListArray<>();

		l5.add(11);
		l5.add(15);
		l5.add(18);

		System.out.println("---------------- retainAll() ----------------");

		System.out.println("Before retainAll = " + l1);
		l1.retainAll(l5);


		System.out.println("After retainAll = " + l1);


	

		ListArray<Integer> l6 = new ListArray<>();

		l6.add(11);
		l6.add(15);
		l6.add(18);

		System.out.println("---------------- equals() ----------------");

		System.out.println("l1 = " + l1);

		System.out.println("l6 = " + l6);

		System.out.println("l1 equals l6 = " + l1.equals(l6));


		


		System.out.println("---------------- clear() ----------------");
		l6.clear();

		System.out.println("l6 after clear = " + l6);

		System.out.println("Is l6 empty = " + l6.isEmpty());


		

		System.out.println("---------------- Java ArrayList ----------------");

		ArrayList<Integer> l2 = new ArrayList<>();

		l2.add(11);
		l2.add(12);
		l2.add(13);
		l2.add(14);
		l2.add(15);
		l2.add(16);
		l2.add(17);
		l2.add(18);
		l2.add(19);
		l2.add(20);

		l2.addAll(l2);

		System.out.println("Java ArrayList = " + l2);

	}
}
