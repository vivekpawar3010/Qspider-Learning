package Tasks;

public class BrowserDriver {

	public static void main(String[] args) {
		FireFoxBrower fbrow = new MyBrower();
		fbrow.downloadFile();
		fbrow.fireFoxExtensions();
		fbrow.openPdf();
		ChromeBrowser cbrow = new MyBrower();
		cbrow.downloadFile();
		cbrow.chromeExtensions();
		cbrow.openPdf();
		

	}

}
