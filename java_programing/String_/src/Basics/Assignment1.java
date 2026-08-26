package Basics;

public class Assignment1 {

	public static void main(String[] args) {
        // Test string containing uppercase, lowercase, numbers, and special characters
        String testStr = "Hello, World! 2026.";
        
        System.out.println("Original String: \"" + testStr + "\"\n");

        System.out.println("--- 1. printStringChar ---");
        printStringChar(testStr);
        System.out.println();

        System.out.println("--- 2. printStringCharReverse ---");
        printStringCharReverse(testStr);
        System.out.println();

        System.out.println("--- 3. printStringVowels ---");
        printStringVowels(testStr);
        System.out.println();

        System.out.println("--- 4. printStringConsonents ---");
        printStringConsonents(testStr);
        System.out.println();

        System.out.println("--- 5. lengthString ---");
        lengthString(testStr);
        System.out.println();

        System.out.println("--- 6. printStringExceptVowels ---");
        printStringExceptVowels(testStr);
        System.out.println();

        System.out.println("--- 7. printStringExceptAlphabets ---");
        printStringExceptAlphabets(testStr);
        System.out.println();

        System.out.println("--- 8. printStringDigits ---");
        printStringDigits(testStr);
        System.out.println();

        System.out.println("--- 9. printStringOnlyAlphabets ---");
        printStringOnlyAlphabets(testStr);
        System.out.println();

        System.out.println("--- 10. printStringOnlySpecialChar ---");
        printStringOnlySpecialChar(testStr);
        System.out.println();

        System.out.println("--- 11. printStringOnlyUpperCase ---");
        printStringOnlyUpperCase(testStr);
        System.out.println();

        System.out.println("--- 12. printStringOnlyLowerCase ---");
        printStringOnlyLowerCase(testStr);
        System.out.println();
    }

	
	// WAP to print every character in the given string start to end
	public static void printStringChar(String s) {
		for(int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
	}
	
	//WAP to print every character in the given string end to start
	
	public static void printStringCharReverse(String s) {
		for(int i = s.length() - 1; i >= 0; i--) {
			System.out.println(s.charAt(i));
		}
	}
	
	
	//WAP print vowels in the given string 
	public static void printStringVowels(String s) {
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'a' ||s.charAt(i) == 'e' ||s.charAt(i) == 'i' ||s.charAt(i) == 'o' ||s.charAt(i) == 'u' ||
					s.charAt(i) == 'A' ||s.charAt(i) == 'E' ||s.charAt(i) == 'I' ||s.charAt(i) == 'O' ||s.charAt(i) == 'U'	) System.out.println(s.charAt(i));
		}
	}
	
	//WAP print the consonents from the given string
	public static void printStringConsonents(String s) {
		for(int i = 0; i < s.length(); i++) {
			if(!(s.charAt(i) == 'a' ||s.charAt(i) == 'e' ||s.charAt(i) == 'i' ||s.charAt(i) == 'o' ||s.charAt(i) == 'u' ||
					s.charAt(i) == 'A' ||s.charAt(i) == 'E' ||s.charAt(i) == 'I' ||s.charAt(i) == 'O' ||s.charAt(i) == 'U'	)) System.out.println(s.charAt(i));
		}
	}
	
	
	//WAp to print the length of the string

	public static int lengthString(String s) {
		int len = 0;
		for(char ch : s.toCharArray()) {
			len += 1;
		}
		
		System.out.println("Length of given string :- "+len);
		return len;
	}
	
	//WAP to print all characters Except vowels 
	
	public static void printStringExceptVowels(String s) {
		printStringConsonents(s); // except vowels
	}
	
	//WAP to print all character Except Alphabets 
	public static void printStringExceptAlphabets(String s) {
		for(int i = 0; i < s.length(); i++) {
			if(!((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') ||(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'))) {
				System.out.println(s.charAt(i));
			}
		}
	}
	
	//WAP to print the only digits in the given string
	public static void printStringDigits(String s) {
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) >= '
' && s.charAt(i) <= '9') {
				System.out.println(s.charAt(i));
			}
		}
	}
	
	//WAP to print only alphabets 
	public static void printStringOnlyAlphabets(String s) {
		for(int i = 0; i < s.length(); i++) {
			if((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') ||(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')) {
				System.out.println(s.charAt(i));
			}
		}
	}
	
	//WAP to print only special characters
	public static void printStringOnlySpecialChar(String s) {
		for(int i = 0; i < s.length(); i++) {
			if(!((s.charAt(i) >= 'a' && s.charAt(i) <= 'z')|| (s.charAt(i) >= '0' && s.charAt(i) <= '9') ||(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'))) {
				System.out.println(s.charAt(i));
			}
		}
	}
	
	//WAP to print Only UpperCase character
	public static void printStringOnlyUpperCase(String s) {
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
				System.out.println(s.charAt(i));
			}
		}
	}
	
	//WAP to print Only LowerCase character
		public static void printStringOnlyLowerCase(String s) {
			for(int i = 0; i < s.length(); i++) {
				if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
					System.out.println(s.charAt(i));
				}
			}
		}
	
}
