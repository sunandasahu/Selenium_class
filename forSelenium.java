package seleniumpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class forSelenium {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromeDriver");
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		WebDriver.Navigation move =driver.navigate();
		driver.get("https://www.google.com");
		move.refresh();
		driver.get("https://www.facebook.com/");
		move.back();
		Thread.sleep(3000);
		String current=driver.getCurrentUrl();
		System.out.println(current);
		driver.close();

	}

}
