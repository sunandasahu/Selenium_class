package utils;

public class ExcelDataProvider {
	public static void main(String[] args) {
		String excelPath="/Users/bhuban/Documents/sunanda_workspace/com.orangeHrm/excel/data.xlsx";
		testData( excelPath, "Sheet1");
	}
	
	public static void testData(String excelPath,String sheetName)
	{
		ExcelUtils excel = new ExcelUtils(excelPath,sheetName);
		int rowCount = excel.getRowCount();
		int colCount = excel.getColumnCount();
		for(int i=1; i<rowCount; i++){
			for(int j=0; j<colCount; j++){
				//String cellData= excel.getCellDataString(i, j);
				 String cellData = excel.getCellDataString(i, j);
				System.out.print(cellData);
			}
			System.out.println();
		
		
		}
	}

}
