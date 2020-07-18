package seleniumpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElemnt_methods {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","chromedriver 4");
		ChromeDriver driver=new ChromeDriver();
		WebDriver.Navigation move=driver.navigate();
		driver.manage().window().maximize();
		
		//Example of get();click();getLocation();close();
		
		driver.get("https://www.google.com");
 	    WebElement myElement=driver.findElement(By.xpath("//a[contains(text(),'Gmail')]"));
		Thread.sleep(2000);
		myElement.click();
	    WebElement location=driver.findElement(By.xpath("//a[contains(text(),'Gmail')]"));
				System.out.println("location:" + ""+location  );
		//driver.close();
		
		//Example of sendKeys();clear();getAttribute();
		
//		driver.get("http://live.demoguru99.com/index.php/customer/account/create/");
//		Thread.sleep(2000);
//		move.refresh();
//		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Ramesh");
//		Thread.sleep(3000);
//		
//		driver.findElement(By.xpath("//input[@id='firstname']")).clear();
//		
//		driver.findElement(By.id("lastname")).sendKeys("Mallik");
//		String attr=driver.findElement(By.id("lastname")).getAttribute("name");
//		System.out.println(attr);
//		driver.findElement(By.xpath("//input[@id='middlename']")).sendKeys("kumar");
//		
	//Example of getCssValue();
//		driver.get("https://www.amazon.com/");
//		WebElement myElement=driver.findElement(By.xpath("(//img[@class='landscape-image'])[1]"));
//		System.out.println(myElement.getCssValue("font-family"));
//		System.out.println(myElement.getCssValue("font-size"));
//		
		driver.close();
	}

}
