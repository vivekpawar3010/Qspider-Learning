class checkInputType {
	public static void main(String[] args){
		System.out.print("Enter the charater :
'");
		char ch = new java.util.Scanner(System.in).nextLine().charAt(0);
		String output = 
		(ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122 )?
		((ch >= 65 && ch <= 90)?(ch + " it is a UPPERCASE "):(ch + " it is a LOWERCSAE")):
		((ch >= 48 && ch <= 57)?(ch + " it is a digit"):(ch + "it is a special character"));
		
		System.out.print(output);

	}
}