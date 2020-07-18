package seleniumpkg;

import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebMetods {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver","chromedriver 4");
				ChromeDriver driver=new ChromeDriver();
				
				driver.manage().window().maximize();
				driver.get("https://www.google.com");
				WebElement glink=driver.findElement(By.partialLinkText("Gmail"));
				org.openqa.selenium.Point loct=glink.getLocation();
				System.out.println(loct.getX()+"   "+loct.getY());
//				Dimension size=glink.getSize();
//				System.out.println(size);
				driver.close();
	}

}
