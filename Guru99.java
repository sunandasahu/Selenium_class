package seleniumpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver 4");
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		WebDriver.Navigation move =driver.navigate();
		driver.get("https://www.google.com");
		driver.findElement(By.partialLinkText("Gmail")).click();
		move.back();
		Thread.sleep(4000);
		move.forward();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?continue=https%3A%2F%2Faccounts.google.com%2FManageAccount%3Fnc%3D1&dsh=S-838826252%3A1590004657813172&gmb=exp&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp");
		Thread.sleep(4000);
		driver.findElement(By.id("firstName")).sendKeys("Megha");
		driver.findElement(By.name("lastName")).sendKeys("Barik");
		driver.findElement(By.name("Username")).sendKeys("meghabarik12");
		driver.findElement(By.name("Passwd")).sendKeys("abc1234@");
		driver.findElement(By.name("ConfirmPasswd")).sendKeys("abc1234@");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		Thread.sleep(4000);
	
		System.out.println(driver.getTitle());
		if( "Create your Google Account".equals(driver.getTitle())){
			System.out.println("Title Page is displayed");
		}
		else{
			System.out.println("Title page not displayed");
		}
		
		 
		driver.close();
		
		

	}

}
