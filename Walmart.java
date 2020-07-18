package seleniumpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Walmart extends Base {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver 4");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.walmart.com/");
		
		WebElement account=driver.findElement(By.xpath("(//span[@class='b_a ab_b b_g b_b b_p x_a x_h x_i'])[1]"));
		cilckon(driver,account,5);
		//normal and automation opening different page
		//driver.findElement(By.xpath("(//div[contains(text(),'Create Account')])[2]")).click();
		System.out.println(driver.getTitle());
		boolean srh = driver.findElement(By.name("query")).isEnabled();
		System.out.println(srh);
		WebElement loc =driver.findElement(By.xpath("(//*[@id='Shape'])[1]"));
		System.out.println(loc);
		driver.get("https://www.walmart.com/account");
		
		driver.findElement(By.xpath("(//*[contains(text(),'Create account')])[1]")).click();
		System.out.println(driver.getTitle());
		WebElement firstname=driver.findElement(By.name("firstName"));
		sendkeys(driver,firstname,5,"sunanda");
		driver.findElement(By.name("lastName")).sendKeys("sahu");
		Thread.sleep(2000);
		WebElement email=driver.findElement(By.name("email"));
		if(email.isDisplayed()){
			driver.findElement(By.name("email")).sendKeys("abcdefg@gmail.com");
		}
		else{
			System.out.println("box is not displayed");
		}
		
		driver.findElement(By.id("email-su")).sendKeys("abcdefg@gmail.com");
		driver.findElement(By.id("password-su")).sendKeys("123xyz");
		boolean box=driver.findElement(By.xpath("(//input[@name='showRememberme'])[1]")).isSelected();
		System.out.println(box);
		driver.findElement(By.xpath("(//*[contains(text(),'Create account')])[2]")).click();
		System.out.println(driver.getTitle());
		driver.close();
	
	}

}
