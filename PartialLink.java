package seleniumpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLink {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		driver.findElement(By.partialLinkText("Terms")).click();
	}

}
