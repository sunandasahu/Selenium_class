package seleniumpkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Wait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver 4");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//implict wait 
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		//implictily wait for 20 sec
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		String title=driver.getTitle();
		//Thread.sleep(4000);
		driver.close();
	}

}
