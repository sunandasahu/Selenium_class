package seleniumpkg;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Guru99ClearCart {
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver 4");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://live.guru99.com/index.php/customer/account/login/");
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("mounica.sriramoju@gmail.com");
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys("9703202000");
		driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
//		WebElement cart = driver.findElement(By.xpath("//span[@class='count']"));
//		String items = cart.getText();
		Thread.sleep(5000);
		boolean cart =driver.findElement(By.xpath("(//span[contains(text(),'Cart')])[1]")).isDisplayed();//po retrun 
		//cart.click();
		if(cart==true)
		{
			driver.findElement(By.xpath("(//span[contains(text(),'Cart')])[1]")).click();//po
			System.out.println("cart is displaying "+cart);
		try
		{
			
		
		WebElement qty=driver.findElement(By.xpath("//input[@class='qty cart-item-quantity input-text']"));//po
		Actions a =  new Actions(driver);
		Thread.sleep(5000);
		a.moveToElement(qty).build().perform();
		for(int i=0;i<10;i++)
		{
		WebElement remove = driver.findElement(By.xpath("//a[@title='Remove This Item']"));//tc
		a.moveToElement(remove).build().perform();
		remove.click();
		Alert alert=driver.switchTo().alert();
	    alert.accept();
	    System.out.println("item removed from the cart is "+i);
		Thread.sleep(4000);
		}
		}
		catch(Exception ex)
		{
			ex.getStackTrace();
		}
		}
		Thread.sleep(4000);
		WebElement noIteams= driver.findElement(By.xpath("//*[contains(text(),'You have no items in your shopping cart.')]"));//po
		System.out.println(noIteams.getText());
		Thread.sleep(4000);
		WebElement account = driver.findElement(By.xpath("(//span[contains(text(),'Account')])[1]"));//po
		account.click();
		Actions a =  new Actions(driver);
		WebElement logout = driver.findElement(By.xpath("//a[@title='Log Out']"));//po
		a.moveToElement(logout).build().perform();
		//a.click();
		logout.click();
		driver.close();
		
		
	}//span[@class='count']

}
