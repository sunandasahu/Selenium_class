package seleniumpkg;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot_Method {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver 4");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		String title="google";
		
		
		if(title.equals(driver.getTitle()))
		{
			WebElement serchbox=driver.findElement(By.name("q"));
					serchbox.sendKeys("sun");
		}
		else
		{
			File scr1=driver.getScreenshotAs(OutputType.FILE);
			File des2=new File("googelscreen.png");
			FileHandler.copy(scr1,des2);	
		}
//		//get a screen shot of the page
//		File scr=driver.getScreenshotAs(OutputType.FILE);
//		File des=new File("walmartpage.png");
//		FileHandler.copy(scr,des);
//		
//		//
//		//screen shot for one webelement
//		//river.get("https://www.google.com/");
//		
//		WebElement serchbox=driver.findElement(By.name("q"));
//		//get a screen shot of the page
//		//instead of driver we are using serchbox(webelemnt)
//		File scr1=serchbox.getScreenshotAs(OutputType.FILE);
//		File des2=new File("serchboxscren.png");
//		FileHandler.copy(scr1,des2);
		driver.close();
	}
	}


