package seleniumpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getcss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver 4");
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		WebElement search= driver.findElement(By.name("q"));
		System.out.println(search.getCssValue("font-family"));
		System.out.println(search.getCssValue("font-size"));
		System.out.println(search.getCssValue("color"));
		
	}

}
