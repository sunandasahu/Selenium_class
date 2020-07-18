package seleniumpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
	public static void sendkeys(WebDriver driver,WebElement element,int timeout ,String value)
	{
		new WebDriverWait(driver,timeout).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
		
	}
	public static void cilckon(WebDriver driver,WebElement element,int timeout)
	{
		new WebDriverWait(driver,timeout).until(ExpectedConditions.elementToBeClickable(element));
		element.click();
		
	}
//	 public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{
//
//	        //Convert web driver object to TakeScreenshot
//
//	        TakesScreenshot scrShot =((TakesScreenshot)webdriver);
//
//	        //Call getScreenshotAs method to create image file
//
//	                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
//
//	            //Move image file to new destination
//
//	                File DestFile=new File(fileWithPath);
//
//	                //Copy file at destination
//
//	                FileUtils.copyFile(SrcFile, DestFile);
//
//	    }

}
