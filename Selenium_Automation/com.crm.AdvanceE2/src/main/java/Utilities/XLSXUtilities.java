package Utilities;

import org.apache.poi.ss.usermodel.Sheet;

public class XLSXUtilities {
	
	public static String singleDataFromXL(int i, int j, Sheet sh) {
		return sh.getRow(i).getCell(j).toString();
	}
	
	
	public static String[][] multipleDataFromXL(Sheet sh) {
		int row = sh.getPhysicalNumberOfRows();
		
		int col = sh.getRow(0).getPhysicalNumberOfCells();
		
		String data[][] = new String[row][col];
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				data[i][j] = sh.getRow(i).getCell(j).toString();
			}
		}
		
		
		return data;
	}
}
