package seleniumpkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagnameExa {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver 4");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
//		String tagName=driver.findElement(By.xpath("(//*[@class='gb_g'])[1]")).getTagName();
//		System.out.println(tagName);
		String text=driver.findElement(By.xpath("(//*[@class='gb_g'])[1]")).getText();
	     System.out.println(text);
//		List<WebElement> listofinput =driver.findElements(By.tagName("input"));
//		System.out.println("the size of input tags are :"+listofinput.size());
		driver.close();
		//driver.quit();

	}

}
