package seleniumpkg;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll_action {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//
		//highlight-addons
		System.setProperty("webdriver.chrome.driver","chromedriver 4");
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();//
		driver.get("https://stackoverflow.com/questions/44618841/actions-on-google");
		Thread.sleep(3000);
		Actions a=new Actions(driver);
		for(int i=0;i<=10;i++)
		{
		a.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(1000);
		
		}
		for(int i=0 ;i<=9;i++)
		{
		a.sendKeys(Keys.ARROW_UP).build().perform();
		Thread.sleep(1000);
		//a.sendKeys(keys.a)
		}
		
	}

}
