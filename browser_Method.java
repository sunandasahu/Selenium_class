package seleniumpkg;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class browser_Method {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver 4");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		//String att=driver.findElement(By.xpath("//input[@id='fakebox-input']")).getAttribute("url");
		//System.out.println(att);
////		String url=driver.getCurrentUrl();
////		System.out.println("the cuttent url is" +""+ url );
////		String title=driver.getTitle();
////		System.out.println("the title of the page is " + "" + title);
////		driver.findElement(By.partialLinkText("Gmail")).click();
////		driver.findElement(By.partialLinkText("Sign in")).click();
////		String errMessage=driver.findElement(By.xpath("//span[contains(text(),'to continue to Gmail')]")).getText();
////		System.out.println("The errMessage is" + errMessage);
		
		//list is related to java.util package 
	        List<WebElement> listOfElements=driver.findElements(By.partialLinkText("href"));
		  System.out.println(listOfElements.size());
		  for(int i=0;i<listOfElements.size();i++)
		  {
			 String tagstext= listOfElements.get(i).getText();
			 System.out.println(tagstext);
		  }
			  
			  
			  
			  
			  
			  
////		String pageSource=driver.getPageSource();
////    	System.out.println("page source :" + pageSource );
		
		driver.close();

	}

}
