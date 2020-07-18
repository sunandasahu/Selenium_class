package seleniumpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver 4");
		ChromeDriver driver=new ChromeDriver();
		//WebDriver.Navigation move=driver.navigate();
		driver.manage().window().maximize();
		driver.get("http://live.demoguru99.com/index.php/customer/account/create/");
		Thread.sleep(2000);
		//move.refresh();
		driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys("Neha");
		driver.findElement(By.id("lastname")).sendKeys("Mallik");
		driver.findElement(By.name("email")).sendKeys("nehamallik34@gmail.com");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.name("confirmation")).sendKeys("123456");
		boolean check=driver.findElement(By.xpath("//input[@id='is_subscribed']")).isSelected();
		System.out.println(check);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Register')]")).click();
	
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//strong[contains(text(),'Address Book')]")).click();
		
		
		
		
		//driver.quit();
		
		driver.close();
		
	
	

	}

}
