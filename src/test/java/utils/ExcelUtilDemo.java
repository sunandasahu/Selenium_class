package utils;

public class ExcelUtilDemo {

	public static void main(String[] args) {
		String projectPath=System.getProperty("user.dir");
		ExcelUtils excel =new ExcelUtils(projectPath+"/excel/data.xlsx", "Sheet1");
		excel.getRowCount();
		excel.getCellDataString(1, 0);
		excel.getCellDataNumeric(1, 1);
		excel.getColumnCount();

	}

}
