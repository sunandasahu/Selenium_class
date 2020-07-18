package seleniumpkg;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class findElements {

	public static void send(WebDriver driver, WebElement element ,int timeOut ,String value)
	{
	new WebDriverWait(driver,timeOut).until(ExpectedConditions.visibilityOf(element));
	element.sendKeys(value);
	//WebElement ele=wait.until(ExpectedConditions.elementToBeSelected
	}
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver 4");
		ChromeDriver driver=new ChromeDriver();
		
		
		WebDriver. Navigation move = driver. navigate();
		
		
		driver.get("https://www.amazon.com/");
		//Thread.sleep(2000);
		driver.get("https://www.kohls.com/");
		//Thread.sleep(2000);
		
				
		WebElement searcbox=driver.findElement(By.id("search"));
//		WebDriverWait wait=new WebDriverWait(driver,20);
//		WebElement ele=wait.until(ExpectedConditions.elementToBeSelected(By.id("search")));
//		ele.sendKeys("Kids");
		
		send(driver,searcbox,10,"kids dress");
		
				
		
		driver.findElement(By.xpath("//input[@id='search']")).click();
		Thread.sleep(4000);
		move.back();
		driver.manage().window().maximize();
		move.refresh();
		
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("kids dress");
	    driver.findElement(By.xpath("(//input[contains(@class,'nav')])[1]")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("(//span[@class='a-size-base a-color-base'])[6]")).click();;
	    driver.findElement(By.xpath("(//img [@class='sb_3CUYRDuz sb_I4KIpIWI'])[2]")).click();
	    WebElement size=driver.findElement(By.name("dropdown_selected_size_name"));
	    Select onesize=new Select(size);
	    onesize.selectByVisibleText("2-3T");
	    Thread.sleep(4000);
	    
	    //Select drpSize=new Select(driver.findElement(By.name("Select")));
	    //drpSize.selectByValue("3-4T");
	    //String tagName=driver.findElement(By.id("add-to-cart-button")).getTagName();
	    //System.out.println(tagName);
	    
		//List<WebElement> listOfInputs=driver.findElements(By.tagName("input"));
		//System.out.println("the number of inputs are"+ " "+listOfInputs.size());
		
		//driver.close();
	
	}
	
		

	}


