//package DDT;
//
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.util.Iterator;
////import java.io.FileInputStream;
//import java.util.Properties;
//
//import org.apache.poi.EncryptedDocumentException;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.ss.usermodel.WorkbookFactory;
//import org.testng.annotations.Test;
//
//import Utilities.FactoryClass;
//
//public class ReadFromFile {
//	@Test
//	public static void readProperties() throws InterruptedException {
////		FileInputStream file = new FileInputStream(".\\src\\resorces\\configuer.properties");
////		Properties prop = new Properties();
////		prop.load(file);
////		
////		System.out.println(prop.getProperty("browser"));
////		System.out.println(prop.getProperty("url"));
////		System.out.println(prop.getProperty("username"));
////		System.out.println(prop.getProperty("password"));
//		
//		System.out.println(FactoryClass.factoryMethod("browser"));
//		System.out.println(FactoryClass.factoryMethod("url"));
//		System.out.println(FactoryClass.factoryMethod("username"));
//		System.out.println(FactoryClass.factoryMethod("password"));
//		
//	}
//	
//	public static void readExcel() throws EncryptedDocumentException,IOException,InterruptedException, {
//		FileInputStream fis = new FileInputStream("/com.crm.AdvanceE2/src/test/resources/demo.xlsx");
//		
//		Workbook wb = WorkbookFactory.create(fis);
//		
//		Sheet sh = wb.getSheet("Login");
//		
//		int row = sh.getPhysicalNumberOfRows();
//		int col = sh.getRow(0).getPhysicalNumberOfCells();
//		System.out.println("Rows" + row);
//		System.out.println("Columns" + col);
//		String login[][] = new String[col][row];
//		
//		for (int i = 0; i < col; i++) {
//			for (int j = 0; j < row; j++) {
//				login[i][j] = sh.getRow(i).getCell(j).toString();
//				System.out.println(login[i][j]);
//			}
//			System.out.println("________^^^^^^^^____________");
//		}
//		
//		fis.close();
//		
//		
//	}
//	
//}
