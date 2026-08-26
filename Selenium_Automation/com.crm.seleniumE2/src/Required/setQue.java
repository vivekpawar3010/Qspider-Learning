package Required;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class setQue {
	public static void main(String[] args) {
		List<Integer> unique = new ArrayList<>();
		unique.add(10);
		unique.add(10);
		unique.add(10);
		unique.add(10);
		unique.add(20);
		unique.add(10);
		unique.add(10);
		unique.add(10);
		unique.add(30);
		unique.add(40);
		unique.add(20);
		unique.add(50);
		unique.add(30);
		
		for(int i = 0, j = unique.size() - 1; ;) {
			if(i == j) break;
			if(unique.get(i).equals(unique.get(j))) {
				unique.remove(j);
				j--;
				i = 0;
			}else if(i == unique.size()/2) {
					i = 0;
					j--;
//					if(j <= unique.size()/2) break;
			}else {
				i++;
			}
		}
		System.out.println(unique);
		
	}
}
