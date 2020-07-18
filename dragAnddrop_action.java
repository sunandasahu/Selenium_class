package seleniumpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAnddrop_action {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
			
			//highlight-addons
			System.setProperty("webdriver.chrome.driver","chromedriver 4");
			ChromeDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();//
			driver.get("https://jqueryui.com/droppable/");
			driver.switchTo().frame(0);
			WebElement drag= driver.findElement(By.id("draggable"));
			Thread.sleep(3000);
			WebElement drop = driver.findElement(By.id("droppable"));
			
			Actions act=new Actions(driver);
			act.clickAndHold(drag)
			.moveToElement(drop)
			.release()
			.build()
			.perform();
			
	}

}
