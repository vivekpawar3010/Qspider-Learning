package Basics;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// 1)WAP to print length of an string without using length() and length variable
	public static int printLength(String s) {
		int len = 0;
		for (char ch : s.toCharArray()) {
			len++;
		}
		System.out.println("Length of String: " + len);
		return len;
	}

	// 2)WAP to print every character line by line
	public static void printStringChar(String s) {
		for (char ch : s.toCharArray()) {
			System.out.println(ch);
		}
	}

	// 3. Print only Upper Character in given String
	public static void printStringUpperCase(String s) {
		for (char ch : s.toCharArray()) {
			if (ch >= 'A' && ch <= 'Z') {
				System.out.println(ch);
			}
		}
	}

	// 4. Only Lower character
	public static void printStringLowerCase(String s) {
		for (char ch : s.toCharArray()) {
			if (ch >= 'a' && ch <= 'z') {
				System.out.println(ch);
			}
		}
	}

	// 5. Only Vowels
	public static void printStringVowels(String s) {
		for (char ch : s.toCharArray()) {
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
					ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				System.out.println(ch);
			}
		}
	}

	// 6. Only Digits
	public static void printStringDigits(String s) {
		for (char ch : s.toCharArray()) {
			if (ch >= '0' && ch <= '9') {
				System.out.println(ch);
			}
		}
	}

	// 7. Print Only Consonants
	public static void printStringConsonants(String s) {
		for (char ch : s.toCharArray()) {
			if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
					ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')) {
				System.out.println(ch);
			}
		}
	}

	// 8. Print only Alphabets
	public static void printStringAlphabets(String s) {
		for (char ch : s.toCharArray()) {
			if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
				System.out.println(ch);
			}
		}
	}

	// 9. Print Special Character
	public static void printStringSpecialChar(String s) {
		for (char ch : s.toCharArray()) {
			if (!((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9'))) {
				System.out.println(ch);
			}
		}
	}

	// 10. Count Space in String
	public static int countSpace(String s) {
		int ct = 0;
		for (char ch : s.toCharArray()) {
			if (ch == ' ') {
				ct++;
			}
		}
		return ct;
	}

	// 11. Count Upper Case char.
	public static int countUpperCase(String s) {
		int ct = 0;
		for (char ch : s.toCharArray()) {
			if (ch >= 'A' && ch <= 'Z') {
				ct++;
			}
		}
		return ct;
	}

	// 12. Count lower Case char
	public static int countLowerCase(String s) {
		int ct = 0;
		for (char ch : s.toCharArray()) {
			if (ch >= 'a' && ch <= 'z') {
				ct++;
			}
		}
		return ct;
	}

	// 13. Iterate String Last to first
	public static void reverseIterate(String s) {
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.println(s.charAt(i));
		}
	}

	// 14. Print all except UpperCase char.
	public static void printExceptUpperCase(String s) {
		for (char c : s.toCharArray()) {
			if (!(c >= 'A' && c <= 'Z')) {
				System.out.println(c);
			}
		}
	}

	// 15. Print all except lowerCase char
	public static void printExceptLowerCase(String s) {
		for (char c : s.toCharArray()) {
			if (!(c >= 'a' && c <= 'z')) {
				System.out.println(c);
			}
		}
	}

	// 16. Print all except Digits
	public static void printExceptDigits(String s) {
		for (char c : s.toCharArray()) {
			if (!(c >= '0' && c <= '9')) {
				System.out.println(c);
			}
		}
	}

	// 17. Count Digits
	public static int countDigits(String s) {
		int ct = 0;
		for (char ch : s.toCharArray()) {
			if (ch >= '0' && ch <= '9') {
				ct++;
			}
		}
		return ct;
	}

	// 18. Print char & index
	public static void printCharIndex(String s) {
		for (int i = 0; i < s.length(); i++) {
			System.out.println(i + " : " + s.charAt(i));
		}
	}

	// 19. Count Vowels in String
	public static int countVowels(String s) {
		int ct = 0;
		for (char c : s.toCharArray()) {
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
					c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
				ct++;
			}
		}
		System.out.println(ct);
		return ct;
	}

	// 20. Count Consonant of String
	public static int countConsonants(String s) {
		int ct = 0;
		for (char c : s.toCharArray()) {
			if (!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
					c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')) {
				ct++;
			}
		}
		System.out.println("Count of Consonants: " + ct);
		return ct;
	}

	// 21. Count Alphabets of String.
	public static int countAlphabets(String s) {
		int ct = 0;
		for (char c : s.toCharArray()) {
			if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
				ct++;
			}
		}
		System.out.println("Alphabets: " + ct);
		return ct;
	}

	// 22. Count of special character
	public static int countSpecialChar(String s) {
		int ct = 0;
		for (char c : s.toCharArray()) {
			if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))) {
				ct++;
			}
		}
		System.out.println("Count Special char: " + ct);
		return ct;
	}

	// 23. WAP Print All Except vowels.
	public static void allExceptVowels(String s) {
		for (char c : s.toCharArray()) {
			if (!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
					c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')) {
				System.out.println(c);
			}
		}
	}

	// 24. All Except Consonent.
	public static void allExceptConsonent(String s) {
		for (char c : s.toCharArray()) {
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
					c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
				System.out.println(c);
			}
		}
	}

	// 25. All Except Alphabets
	public static void printAllExceptAlphabets(String s) {
		for (char c : s.toCharArray()) {
			if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))) {
				System.out.println(c);
			}
		}
	}

	// 26. All Except Special char
	public static void printAllExceptSpecial(String s) {
		for (char c : s.toCharArray()) {
			if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')) {
				System.out.println(c);
			}
		}
	}

	// 27. Upper Case char & index
	public static void upperCaseIndex(String s) {
		int i = 0, n = s.length();
		while (i < n) {
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				System.out.println(i + " : " + s.charAt(i));
			}
			i++;
		}
	}

	// 28. lower Case char & index.
	public static void lowerCaseIndex(String s) {
		int i = 0, n = s.length();
		while (i < n) {
			char ch = s.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				System.out.println(i + " : " + ch);
			}
			i++;
		}
	}

	// 29. Digit & index
	public static void digitIndex(String s) {
		int i = 0, n = s.length();
		while (i < n) {
			char c = s.charAt(i);
			if (c >= '0' && c <= '9') {
				System.out.println(i + " : " + c);
			}
			i++;
		}
	}

	// 30. Vowels & index
	public static void vowelIndex(String s) {
		int i = 0, n = s.length();
		while (i < n) {
			char c = s.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
					c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
				System.out.println(i + " : " + c);
			}
			i++;
		}
	}

	// 31. Consonant & Index
	public static void consonantIndex(String s) {
		int i = 0, n = s.length();
		while (i < n) {
			char c = s.charAt(i);
			if (!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
					c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')) {
				System.out.println(i + " : " + c);
			}
			i++;
		}
	}

	// 32. Alphabet Index
	public static void alphabetIndex(String s) {
		int i = 0, n = s.length();
		while (i < n) {
			char c = s.charAt(i);
			if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
				System.out.println(i + " : " + c);
			}
			i++;
		}
	}

	// 33. Special Char Index
	public static void specialCharIndex(String s) {
		int i = 0, n = s.length();
		while (i < n) {
			char c = s.charAt(i);
			if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))) {
				System.out.println(i + " : " + c);
			}
			i++;
		}
	}

	// 34. ASCII value of every character in a given String
	public static void printASCIIOf(String s) {
		for (int ch : s.toCharArray()) {
			System.out.println(ch);
		}
	}

	// 35. ASCII value of only vowels in a given String
	public static void printASCIIOfVowels(String s) {
		for (int ch : s.toCharArray()) {
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
					ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				System.out.println(ch);
			}
		}
	}

	// 36. ASCII value of only consonants in a given String
	public static void printASCIIOfConsonants(String s) {
		for (int ch : s.toCharArray()) {
			if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
					ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')) {
				System.out.println(ch);
			}
		}
	}

	// 37. ASCII value of only special characters in a given String
	public static void printASCIIOfSpecial(String s) {
		for (int c : s.toCharArray()) {
			if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))) {
				System.out.println(c);
			}
		}
	}

	// 38. ASCII value of only digits in a given String
	public static void printASCIIDigits(String s) {
		for (int c : s.toCharArray()) {
			if (c >= '0' && c <= '9') {
				System.out.println(c);
			}
		}
	}

	// 39. ASCII value of only alphabets in a given String
	public static void printASCIIAlphabets(String s) {
		for (int c : s.toCharArray()) {
			if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
				System.out.println(c);
			}
		}
	}

	// 2) WAP to print every character line by line
	// 3) WAP to print only upper case characters in a given String
	// 4) WAP to print only lowercase characters in a given String
	// 5) WAP to print only digits characters in a given String
	// 6) WAP to print only vowels in a given String
	// 7) WAP to print only consonants in a given String
	// 8) WAP to print only alphabets in a given String
	// 9) WAP to print only special characters in a given String
	// 10) WAP to count only spaces in a given String
	// 11) WAP to count only upper case characters in a given String
	// 12) WAP to count only lowercase characters in a given String
	// 13) WAP to count only digits characters in a given String
	// 14) WAP to iterate String from last to first and print
	// 15) WAP to print all except upper case characters in a given String
	// 16) WAP to print all except lowercase characters in a given String
	// 17) WAP to print all except digits characters in a given String
	// 18) WAP to print every character index line by line
	// 19) WAP to count only vowels in a given String
	// 20) WAP to count only consonants in a given String
	// 21) WAP to count only alphabets in a given String
	// 22) WAP to count only special characters in a given String
	// 23) WAP to print all except vowels in a given String
	// 24) WAP to print all except consonants in a given String
	// 25) WAP to print all except alphabets in a given String
	// 26) WAP to print all except special characters in a given String
	// 27) WAP to print only upper case characters and their index in a given String
	// 28) WAP to print only lowercase characters and their index in a given String
	// 29) WAP to print only digits characters and their index in a given String
	// 30) WAP to print only vowels and their index in a given String
	// 31) WAP to print only consonants and their index in a given String
	// 32) WAP to print only alphabets and their index in a given String
	// 33) WAP to print only special characters and their index in a given String
	// 34) WAP to print ASCII value of every character in a given String
	// 35) WAP to print ASCII value of only vowels in a given String
	// 36) WAP to print ASCII value of only consonants in a given String
	// 37) WAP to print ASCII value of only special characters in a given String
	// 38) WAP to print ASCII value of only digits in a given String
	// 39) WAP to print ASCII value of only alphabets in a given String

}
