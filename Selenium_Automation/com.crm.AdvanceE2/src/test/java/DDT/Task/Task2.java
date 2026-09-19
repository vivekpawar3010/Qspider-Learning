package DDT.Task;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import Utilities.XLSXUtilities;

public class Task2 extends XLSXUtilities{
	
	public static String data[][];
	
	
	@Test(priority = 0,enabled = true)
	public static void prerequisites() throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("C:\\.Qspider-Learning\\Selenium_Automation\\com.crm.AdvanceE2\\src\\test\\resources\\Task.xlsx");

		Workbook wb = WorkbookFactory.create(fis);

		Sheet sh = wb.getSheet("Task2");
		
		String temp[][] = multipleDataFromXL(sh);
		data = temp;
	}
	
	@Test(priority = 1)
	public static void test(){
		
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[0].length; j++) {
				System.out.println(data[i][j]);
			}
		}
		System.out.println("Data Fetched sucssesdfasjd;lf");
		//to reoslve numberformat exception
		toResolveNumberFormatException();
	}
	
	public static void toResolveNumberFormatException() {
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[0].length; j++) {
				String s = data[i][j];
				for(int k = 0; k < s.length(); k++) {
					if(s.charAt(k) == '.'){
						data[i][j] = s.substring(0,k);
						break;
					}
				}
			}
		}
	}
	
	public static long[][] strarrToLong(String[][] arr){
		long[][] ans = new long[arr.length][arr[0].length];
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[0].length; j++) {
				ans[i][j] = Long.parseLong(arr[i][j]);
			}
		}
		return ans;
	}
	@Test(priority = 2,enabled = true)
	public static void task1ReverseString() {
		System.out.println("Task 1 --------------------------------------");
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[0].length; j++) {
				System.out.println(reversString(data[i][j]));
			}
		}
		System.out.println("Task 1 Completed --------------------------------------");
		return;
	}
	
	public static String reversString(String s) {
		char[] charr = s.toCharArray();
		int n = charr.length;
		for(int i = 0; i < n/ 2; i++) {
			char temp = charr[n - i - 1];
			charr[n - i - 1] = charr[i];
			charr[i] = temp;
			
		}
		
		return new String(charr);
	}
	
	
	
	
	@Test(priority = 3, enabled = true)
	public static void task2RemoveConsicative() {
		System.out.println("Task 2 --------------------------------------");
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[0].length; j++) {
		 		System.out.println(removeConsicative(data[i][j]));
			}
		}
		System.out.println("Task 2 Completed ---------------------------");
	}
	public static String removeConsicative(String s){
		char[] charr = s.toCharArray();
		char curr = charr[0];
		for(int i = 1; i < charr.length; i++) {
			if(charr[i] == curr) charr[i] = '_';
			else curr = charr[i];
		}
		return new String(charr).replace("_", "");
	}
	
	@Test()
	public static void testStrings() {
		String[] check = {"112222	2112233445566554433", "11227755663388559993020293932"};
		for(String s:check) {
			System.out.println(removeConsicative(s));
		}
	}
	
	@Test(priority = 4, enabled = true)
	public static void task3RemoveDuplicate(){
		System.out.println("Task 3 --------------------------------------");
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[0].length; j++) {
				System.out.println(removeDuplicate(data[i][j]));
			}
		}
		System.out.println("Task 3 Completed--------------------------------------");
		
	}
	
	public static String removeDuplicate(String s) {
		boolean[] nums = new boolean[10];
		char[] charr = s.toCharArray();
		
		for(int i = 0; i < charr.length; i++) {
			if(nums[charr[i] - '0']) charr[i] = '_';
			else nums[charr[i] - '0'] = true;
		}
		
		return new String(charr).replace("_", "");
	}
	
	
}
