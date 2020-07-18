package seleniumpkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetTiltle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver 4");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		
		//String title=driver.getTitle();
		//System.out.println(title);
		 // or
		System.out.println(driver.getTitle());
		if("google".equals(driver.getTitle()))
		{
			System.out.println("google is displayed");
		}
		else
		{
			System.out.println("goole is not displaying and closing");
			driver.close();
		}
				
		

	}

}
