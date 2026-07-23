import java.util.Arrays;
class FreqStringArray{
	public static void main(String[] args) {
		String s = "java is easy and arrays are more easy";
		freqWords(s);
	}

	public static void freqWords(String s){
		String [] words = s.split(" ");
		int n = words.length;
		boolean[] check = new boolean[n];
		for(int i = 0; i < n; i++){
			if(check[i]) continue;

			int ct = 1;
			for(int j = i + 1; j < n; j++){
				if(words[i].equals(words[j])){
					ct++;
					check[j] = true;
				}
			}

			System.out.println(words[i] + " : " + ct);
		}
 	} 
}