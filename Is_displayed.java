package seleniumpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_displayed {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","chromedriver 4");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://live.demoguru99.com/index.php/customer/account/login");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("nehamallik34@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("123456");
		driver.findElement(By.id("send2")).submit();
		System.out.println(driver.getTitle());
		String acttitle=driver.getTitle();
		String exptitle="My Account";
		if(exptitle.equals(acttitle)){
			System.out.println("test pass");
		}
		else{
			System.out.println("test fail");
		}
		boolean searchbox=driver.findElement(By.name("q")).isEnabled();
		System.out.println("Is search box enable?" +""+ searchbox);
		
		WebElement logo=driver.findElement(By.xpath("//img[@class='large']"));
		Point loc =logo.getLocation();
		System.out.println("x axis is " + loc.getX() +"  "+  "y axis is " + loc.getY());
		
		driver.close();

	}

}
