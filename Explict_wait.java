package seleniumpkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explict_wait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver 4");
		ChromeDriver driver=new ChromeDriver();
		WebDriver.Navigation move=driver.navigate();
		driver.get("https://gmail.com");
		driver.manage().window().maximize();
		
		// Example of implicit wait
//		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.get("https://www.facebook.com/");
//		driver.findElement(By.name("email")).sendKeys("sunandasahu12@gmail.com");
//		driver.findElement(By.name("pass")).sendKeys(abcj1234);
		
		//Example of explicit wait
		WebElement username= driver.findElement(By.name("identifier"));
		username.sendKeys("sunandasahu12@gmail.com");
		WebElement nextbutn=driver.findElement(By.id("identifierNext"));
		cilckon(driver,nextbutn,5);
		WebElement password =driver.findElement(By.name("password"));
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("password")));
		password.sendKeys("password");
		//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy((By) driver.findElement(By.name("password"))));
		
		WebElement  passwornext=driver.findElement(By.id("passwordNext"));
		cilckon(driver,passwornext,5);
		
		

	}
	public static void sendkeys(WebDriver driver,WebElement element,int timeout ,String value)
	{
		new WebDriverWait(driver,timeout).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
		
	}
	public static void cilckon(WebDriver driver,WebElement element,int timeout)
	{
		new WebDriverWait(driver,timeout).until(ExpectedConditions.elementToBeClickable(element));
		element.click();
		
	}
	

}
