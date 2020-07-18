package seleniumpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Actions_ex {

	public static void main(String[] args) throws InterruptedException 
	{
		//highlight-addons
		System.setProperty("webdriver.chrome.driver","chromedriver 4");
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();//
		driver.get("https://www.amazon.com/");
		//driver.findElement(By.xpath("//*[@id='nav-link-accountList']"));
		//WebElement friends = driver.findElement(By.xpath("//a[text()='Friends and Family']"));
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//*[@id='nav-link-accountList']"))).build().perform();
		driver.findElement(By.xpath("//span[text()='Your Orders']")).click();
		
		//a.moveToElement(friends).build().perform();

	}

}
