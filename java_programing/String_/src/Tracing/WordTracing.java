package Tracing;

public class WordTracing {
	public static void main(String[] args) {
		String s = "I am the King";
		reverseString(s);
	}

	public static void printWords(String s) {
		s = s + " ";
		String res = "";

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch != ' ') {
				res += ch;
			} else {
				System.out.println(res);
				res = "";
			}
		}
	}

	// write the program to count the words in the string
	public static void countWords(String s) {
		s += " ";
		int ct = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == ' ')
				ct++;
		}
		System.out.println("No. of words in the String are:- " + ct);
	}

	// write the program to print the first letter of the each word
	public static void firstLetterWords(String s) {
		s = " " + s;
		for (int i = 0; i < s.length() - 1; i++) {
			char ch = s.charAt(i);
			if (ch == ' ')
				System.out.println(s.charAt(i + 1));
		}
	}

	// write the program to print the last letter of the each word
	public static void lastLetterWords(String s) {
		s += " ";
		int ct = 0;
		for (int i = 1; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == ' ')
				System.out.println(s.charAt(i - 1));
		}
	}

	// print the length of each word
	public static void lengthOfWords(String s) {
		s += " ";
		String res = " ";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == ' ') {
				System.out.println(res.length());
				res = "";
			} else {
				res += ch;
			}
		}
	}

	// print the word with even length
	public static void evenLengthWords(String s) {
		s += " ";
		String res = " ";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == ' ') {
				if (res.length() % 2 == 0)
					System.out.println(res);
				;
				res = "";
			} else {
				res += ch;
			}
		}
	}

	// print the word with odd length
	public static void oddLengthWords(String s) {
		s += " ";
		String res = " ";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == ' ') {
				if (res.length() % 2 == 1)
					System.out.println(res);
				;
				res = "";
			} else {
				res += ch;
			}
		}
	}

	// print the word with 3 length
	public static void lengthis3Words(String s) {
		s += " ";
		String res = " ";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == ' ') {
				if (res.length() == 3)
					System.out.println(res);
				res = "";
			} else {
				res += ch;
			}
		}
	}

	public static void reverseString(String s) {
		char[] charr = s.toCharArray();
		int n = charr.length;
		for (int i = 0; i < n / 2; i++) {
			char temp = charr[i];
			charr[i] = charr[n - 1 - i];
			charr[n - i - 1] = temp;
		}
		System.out.println(new String(charr));
	}

	// chekc the given string is palindrom or not
	public static void isPalindromString(String s) {
		char[] charr = s.toCharArray();
		int n = charr.length, i = 0;
		for (; i < n / 2; i++) {
			if(charr[i] != charr[n - i - 1]) break;
		}
		if(i==n/2) System.out.println("the given stirng "+ new String(charr) + " is a palindromic");
	}

}
