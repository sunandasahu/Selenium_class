package seleniumpkg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver 4");
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		JavascriptExecutor js= (JavascriptExecutor)driver; 
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		//directly clicking on sinup button without giving valid username and password
		//driver.findElement(By.name("proceed")).click();;
		WebElement btn = driver.findElement(By.name("proceed"));
		//java-script executor
		
		
			js.executeScript("arguments[0].click();",btn);
			 //or
		//driver.executeScript("arguments[0].click();",btn);
		//driver.executeScript("document.getElementByName('proceed').click();");
		
		Alert alert=driver.switchTo().alert();
		
		//alert.dismiss();//to cancel
		System.out.println(alert.getText());//getting the text of alert box
		alert.accept();//click on ok
		//alert.sendKeys("fhdhgfjh");//is used to send the text into alret box
		
		driver.findElement(By.id("login1")).sendKeys("asdgr");
}
}