package seleniumpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElemntMethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver 4");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
       // driver.get("https://www.google.com/");
        
        String ActualUrl="https://www.google.com/";
        driver.get(ActualUrl);
        //verify the title
        String ExcTitle="Google";
        String ActualTitle=driver.getTitle();
        if(ExcTitle.equals(ActualTitle))
        {
        	System.out.println("the title is displayed ");
        }
        else
        {
        	System.out.println(" title is not displayed");
        }
//      boolean seardisplay= driver.findElement(By.name("q")).isDisplayed();
//      System.out.println(seardisplay);
       
        WebElement seardisplay= driver.findElement(By.name("q"));
//      System.out.println(seardisplay);      
		if(seardisplay.isDisplayed())
		{
			driver.findElement(By.name("q")).sendKeys("sunanada");
		}
		else
		{
			System.out.println("search box is not annabled");
		}
		

	}

}
