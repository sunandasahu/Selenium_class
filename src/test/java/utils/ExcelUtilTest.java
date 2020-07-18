package utils;

public class ExcelUtilTest {

	public static void main(String[] args) {
		Xls_Reader reader = new Xls_Reader("/Users/bhuban/Documents/sunanda_workspace/com.orangeHrm/excel/data.xlsx");
		String sheetName ="Sheet1";
		System.out.println(reader.getCellData(sheetName, "userName", 3));
		String data = reader.getCellData(sheetName, 0, 2);
		System.out.println(data);
		int rowCount = reader.getRowCount(sheetName);
		System.out.println(rowCount);
		System.out.println(reader.getColumnCount(sheetName));
		//reader.addColumn(sheetName, "Status");
		//reader.addSheet("Home");
		reader.isSheetExist("Home");
		if(!reader.isSheetExist("Home")){
			reader.addSheet("Home");
		}
		reader.setCellData("Sheet1", "Status", 2, "PASS");
		reader.removeColumn("Sheet1", 2);
		
		
		
		

	}

}
