package seleniumpkg;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_window {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver 4");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://demo.automationtesting.in/Windows.html"); 
        //String handle = driver.getWindowHandle();
   
        WebElement clickbtn = driver.findElement(By.xpath("//*[text()='    click   ']"));
        clickbtn.click();
        System.out.println(driver.getTitle());
//        System.out.println(handle);
       Set <String>handles = driver.getWindowHandles();
       for(String i:handles){
    	   System.out.println(i);
    	   String title = driver.switchTo().window(i).getTitle();
    	   System.out.println(title);
       
       
       if(title.contains("Sakinalium | Home")){
    	   driver.findElement(By.linkText("Documentation")).click();;
    	   
       }
       Thread.sleep(4000);
       driver.switchTo().window(i);
       if(title.contains("Frames & windows")){
    	   driver.findElement(By.linkText("Home")).click();
    	   driver.close();
    	   
       }
       }

        
       
        driver.quit();
       
        	
        
       
       

		
	}

}
