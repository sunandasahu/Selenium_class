package seleniumpkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws Exception {
		//syntx: Select sc=new Select (WebElemnt Elemnt)
//Select sc= new Select(driver);
//sc.selectByIndex(starts with 0);
//
//sc.selectByValue(option=1);
//sc.selectByVisibleText("name of the text");
		//select the value from the dropdown based on the given text or value or index
		System.setProperty("webdriver.chrome.driver","chromedriver 4");
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		
		WebElement dropmonth=driver.findElement(By.name("birthday_month"));
		Select drmonth=new Select(dropmonth);
		//sc.selectByVisibleText("Jun");
		//drmonth.selectByIndex(6);
		//drmonth.selectByValue("6");
	// CHECK Whether the slect is accepting muliple values are not 
		if(!drmonth.isMultiple())
		{
			List<WebElement> allmonths=drmonth.getOptions();
			System.out.println(allmonths.size());
		
		for(int i=0;i<allmonths.size();i++)
		{
			String monthname=allmonths.get(i).getText();
			System.out.println(monthname);
			
			if(monthname.equals("Feb"))
			{
				drmonth.selectByIndex(i);
				//drmonth.selectByVisibleText("Feb");
			}
		}
		
		}
		

		
		WebElement dropday=driver.findElement(By.name("birthday_day"));
		Select drday=new Select(dropday);
		//drday.selectByIndex(15);
		if(!drday.isMultiple())
		{
			List<WebElement> allday=drday.getOptions();
			System.out.println(allday.size());
			for(int i=0;i<allday.size();i++)
			{
				String number = allday.get(i).getText();
				System.out.println(number);
				
				if(number.equals("15"))
				{
					//Thread.sleep(5000);
				drday.selectByVisibleText("15");	
				}
			}
			
		}
		Thread.sleep(5000);
		WebElement dropyear=driver.findElement(By.name("birthday_year"));
		Select dryear=new Select(dropyear);
		dryear.selectByValue("1985");
		
		
		driver.close();
		
		
	}	

}
