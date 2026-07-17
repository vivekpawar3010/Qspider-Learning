package Tasks;

public class MyBrower implements FireFoxBrower, ChromeBrowser{
	
	public void downloadFile() {
		System.out.println("Enter file name");
		String fileName = new java.util.Scanner(System.in).nextLine();
		System.out.println("Your file is saved with the name " + fileName);
	}
	public void openPdf() {
		System.out.println("Opening the pdf......");
	}
	public void chromeExtensions() {
		System.out.println("List of the extension From Chrome");
	}
	public void fireFoxExtensions() {
		System.out.println("List of the extension From FireFox");
	}
	
	
	

}
