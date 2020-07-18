package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement username = driver.findElement(By.name("txtUsername"));
		WebElement pwd = driver.findElement(By.id("txtPassword"));
		
		Xls_Reader reader = new Xls_Reader("/Users/bhuban/Documents/sunanda_workspace/com.orangeHrm/excel/data.xlsx");
		String sheetName ="Sheet1";
		int rowCount = reader.getRowCount(sheetName);
		
		for(int rowNum=2;rowNum<=rowCount; rowNum++){
		String userNames = reader.getCellData(sheetName, "userName", rowCount);
		String password= reader.getCellData(sheetName, "password", rowCount);
		
		username.clear();
		username.sendKeys(userNames);
		
		pwd.clear();
		pwd.sendKeys(password);
		}
		//driver.close();
		

	}

}
