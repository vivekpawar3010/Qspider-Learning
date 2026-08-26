package Tracing;

public class PanagramOrNot {
	//Panagram is the senetence where every letter apaire at leaste once
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean check[] = new boolean[26];
		String s = "";
		if(s.length() >= 26) {
			for(char c : s.toCharArray()) {
				check[(c - 'a')] = true;
			}
			
			for(boolean bv : check) {
				if(!bv) {
					System.out.println("This is not a Panagram");
				}
			}
			System.out.println("This is a Panagram");
		}else {
			System.out.println("This is not a Panagram");
		}
		
		
		
	}

}
