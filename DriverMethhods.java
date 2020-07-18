package seleniumpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverMethhods {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("http://www.google.com");
		//get,
		//navigate() will allow these method like back(),Forward(),Refresh(),TO(),
		//quit(),close(),
		//swithTo(),getCurrentUrl(),GetPageSource(),GetTittle();
		WebDriver.Navigation move=driver.navigate();
		driver.get("http://www.google.com");
		String souce=driver.getPageSource();
		System.out.println(souce);
		
		driver.findElement(By.partialLinkText("Gmail")).click();
		
		String current=driver.getCurrentUrl();
		System.out.println(current);
		Thread.sleep(4000);
		move.back();
		Thread.sleep(4000);
		move.forward();
		Thread.sleep(4000);
		move.refresh();
		Thread.sleep(4000);
		driver.close();
		
		

}
}