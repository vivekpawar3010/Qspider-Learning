package ArrayListPrograms;

import java.util.ArrayList;
import java.util.List;

public class BasicsArrayList {
	public static void main(String[] args) {
		List intList = new ArrayList(10);
		
		System.out.println(intList.size());
		for (int i = 0; i < 10; i++) {
			intList.add(i+1);
		}
		System.out.println(intList.size() + " =>" + intList );
		
		
		List charList = new ArrayList(10);
		
		System.out.println(charList.size());
		for (int i = 0; i < 10; i++) {
			charList.add((char) ('a' + i));
		}
		System.out.println(charList.size() + " =>" + charList );
		
		List stringList = new ArrayList(10);
		String str = "a";
		System.out.println(stringList.size());
		for (int i = 0; i < 10; i++) {
			stringList.add(str);
			str += (char)('a' + i + 1);
		}
		System.out.println(stringList.size() + " =>" + stringList );
		
		
		List booleanList = new ArrayList(10);
		boolean b = true;
		System.out.println(booleanList.size());
		for (int i = 0; i < 10; i++) {
			booleanList.add(b);
			b = !b;
		}
		System.out.println(booleanList.size() + " =>" + booleanList );
		
		
		// merge the 2 diff arralist of diff data types
		System.out.println(merge2ArrayListReturn(charList, stringList));
		
	}
	
	public static List merge2ArrayListReturn(List l1, List l2) {
		List merged = new ArrayList(l1);
		merged.addAll(l2);
		return merged;
	}
	public static void merge2ArrayListPrint(List l1, List l2) {
		List merged = new ArrayList(l1);
		merged.addAll(l2);
		System.out.println(merged.size()+ "=>" + merged);
	}
	
	
	
}
