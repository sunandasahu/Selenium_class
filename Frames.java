package seleniumpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames extends Base {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//ape_Detail_ams-detail-right-v2_Desktop_iframe
		System.setProperty("webdriver.chrome.driver", "chromedriver 4");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//div[@id='draggable']")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//*[text()='Visual feedback']")).click();
		//frames is also acts like webelemntelemnt
		//selenium webdriver will try to search the elemnt within the page but not 
		//inside the frame.so we need to use a stmt to swith to particalr frame
		//driver.switchTo().frame(0);
		//frame can be identify by index (0) and name.
		//form going back to normal page we can use 
		//driver.switchTo().defaultContent();
	}
}


