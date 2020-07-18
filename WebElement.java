package seleniumpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		ChromeDriver driver =new ChromeDriver();
		//driver.get("https://www.walmart.com/");
		
		
		//driver.findElement(By.xpath("//span[contains(text(),'Pickup & delivery')]")).click();
//		driver.get("http://demo.guru99.com/selenium/deprecated.html");
//		driver.switchTo().frame("classFrame");
//		driver.findElement(By.linkText("Deprecated")).click();
//		driver.quit();
		  driver.get("http://demo.guru99.com/selenium/deprecated.html");
	        driver.switchTo().frame("classFrame");
	        driver.findElement(By.linkText("Deprecated")).click();
	        driver.close();

	}

}
