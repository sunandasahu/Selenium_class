package seleniumpkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_handles {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","chromedriver 4");
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Windows.html");
		
		
		System.out.println(driver.getTitle());
		
		WebElement tabclick=driver.findElement(By.xpath("//button[contains(text(),'    click   ')]"));
		tabclick.click();
		System.out.println("parentd window title" +driver.getCurrentUrl());
		Thread.sleep(5000);
		Set<String> winhandle=driver.getWindowHandles();
		{
			for(String handles:winhandle)
			{
				driver.switchTo().window(handles);
				System.out.println("child window is" + driver.getTitle());
				System.out.println("child window is" + driver.getCurrentUrl());
			}
		}
		
	}

}
