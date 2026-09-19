package DDT.Task;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import Utilities.XLSXUtilities;

public class Task1 extends XLSXUtilities {

	public static String data[][];

	@Test(priority = 0, enabled = true)
	public static void prerequisites() throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(
				"C:\\.Qspider-Learning\\Selenium_Automation\\com.crm.AdvanceE2\\src\\test\\resources\\Task.xlsx");

		Workbook wb = WorkbookFactory.create(fis);

		Sheet sh = wb.getSheet("Task1");

		String temp[][] = multipleDataFromXL(sh);
		data = temp;
	}

	@Test(priority = 1)
	public static void test() {

		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[0].length; j++) {
				System.out.println(data[i][j]);
			}
		}
		System.out.println("Data Fetched sucssesdfasjd;lf");
		// to reoslve numberformat exception
		toResolveNumberFormatException();
	}

	public static void toResolveNumberFormatException() {
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[0].length; j++) {
				String s = data[i][j];
				for (int k = 0; k < s.length(); k++) {
					if (s.charAt(k) == '.') {
						data[i][j] = s.substring(0, k);
						break;
					}
				}
			}
		}
	}

	public static long[][] strarrToLong(String[][] arr) {
		long[][] ans = new long[arr.length][arr[0].length];
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[0].length; j++) {
				ans[i][j] = Long.parseLong(arr[i][j]);
			}
		}
		return ans;
	}

	@Test(priority = 2, enabled = true)
	public static void task1OddEven() {
		System.out.println("Task 1 Compelted  --------------------------------------");
		long[][] intData = strarrToLong(data);
		for (int i = 0; i < intData.length; i++) {
			for (int j = 0; j < intData[0].length; j++) {
				if (intData[i][j] % 2 == 0) {
					System.out.println(intData[i][j] + "is Even");
				} else {
					System.out.println(intData[i][j] + "is Odd");
				}
			}
		}
		System.out.println("Task 1 Completed --------------------------------------");
		return;
	}

	@Test(priority = 3, enabled = true)
	public static void task2Prime() {
		System.out.println("Task 2 --------------------------------------");
		long[][] intData = strarrToLong(data);
		for (int i = 0; i < intData.length; i++) {
			for (int j = 0; j < intData[0].length; j++) {
				if (isPrime(intData[i][j])) {
					System.out.println(intData[i][j]);
				}
			}
		}
		System.out.println("Task 2 Completed --------------------------------------");
	}

	public static boolean isPrime(long n) {
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	@Test(priority = 4, enabled = true)
	public static void task3Sum() {
		System.out.println("Task 3 --------------------------------------");
		long totalSum = 0;
		long[][] intData = strarrToLong(data);
		for (int i = 0; i < intData.length; i++) {
			for (int j = 0; j < intData[0].length; j++) {
				totalSum += intData[i][j];
			}
		}

		System.out.println("The total Sum is - " + totalSum);
		System.out.println("Task 3 Completed --------------------------------------");
	}

	@Test(priority = 5, enabled = true)
	public static void task4Fibonacci() {
		System.out.println("Task 4  --------------------------------------");
		long[][] intData = strarrToLong(data);
		for (int i = 0; i < intData.length; i++) {
			for (int j = 0; j < intData[0].length; j++) {
				System.out.println(fibonacci(intData[i][j]));
			}
		}
		System.out.println("Task 4 Completed --------------------------------------");
	}

	public static int fibonacci(long n) {
		if (n <= 1)
			return 0;
		int n1 = 0, n2 = 1;
		for (int i = 2; i <= n; i++) {
			int n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
		}
		return n1;
	}

}
