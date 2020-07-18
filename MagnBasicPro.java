package seleniumpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MagnBasicPro {

	
		// TODO Auto-generated method stub
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			

			System.setProperty("webdriver.chrome.driver","chromedriver 4");
			ChromeDriver driver=new ChromeDriver();
			WebDriverWait w1=new WebDriverWait(driver,30);
			driver.manage().deleteAllCookies();
			
			driver.get("http://live.guru99.com/index.php/customer/account/login/");
			

		       //2.	Enter the Credentials & Login into Page (Mounica.srimaoju@gmail.com ; Pass:9703202000)
			
			driver.findElement(By.xpath("//input[@name='login[username]']")).clear();
			driver.findElement(By.xpath("//input[@name='login[username]']")).sendKeys("mounica.sriramoju@gmail.com");
			
			
			driver.findElement(By.xpath("//input[@name='login[password]']")).clear();
			driver.findElement(By.xpath("//input[@name='login[password]']")).sendKeys("9703202000");
			
			
			driver.findElement(By.xpath("//*[@title='Login']")).click();
			
							//3.	Validate the URL using getUrl() method and verify it.
			String Currenturl=driver.getCurrentUrl();
			
			System.out.println(Currenturl);
						//4.	Validate the “MY DASHBOARD” is shown
			//w1.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[text()='My Dashboard']"))));
			
//			boolean  MyDashboard=driver.findElement(By.xpath("//*[text()='My Dashboard']")).isDisplayed();
//			
//						if(MyDashboard==false)
//				
//							{
//								System.out.println("MyDashboard is visible");
//								}
//						else
//							{
//								System.out.println("MyDashboard is not visible");//this is for show in console
//								
//							}
			Thread.sleep(3000);
			
							//5.	Navigate to MOBILE tab.
					//List<WebElement> lst = driver.findElements(By.linkText("http://live.guru99.com/index.php/mobile.html"));
			
							//lst.get(1);
			
			driver.findElement(By.xpath("//*[text()='Mobile']")).click();
			
			
			
							//6.	Now search for “IPHONE” in the search tab
			driver.findElement(By.xpath("//input[@id='search']")).sendKeys("iphone");
			
			
							//7.	Click on the “IPHONE” name or on its Image.
			driver.findElement(By.xpath("//*[@id='product-collection-image-2']")).click();
			
			
							//8.	Check for the “IN STOCK” Option is shown.
			boolean add=driver.findElement(By.xpath("//*[text()='Add to Cart']")).isDisplayed();
			
				if(add==true)
				{
					System.out.println("add to cart is visible");
					}
			
				else
				{
					System.out.println("Add to Cart is not visable");
					}
				
					//9.	Get the price of the Item using getText() method and store it in a variable.
			String pricebox=driver.findElement(By.xpath("//span[contains(text(),'Add to Cart')]//ancestor::div[5]//span[@class='price']")).getText();
			
			//span[contains(text(),'Add to Cart')]//ancestor::div[5]//span[@class='price']
			//*[@id='product-price-2']/child::*[@class='price']
			
			System.out.println("Price is "+pricebox);
			
			
					//10.	Change the order quantity to 5 for the IPHONE
			driver.findElement(By.xpath("//*[@id='qty']")).clear();
			
			driver.findElement(By.xpath("//*[@id='qty']")).sendKeys("5");
				
					//		11.	Click on the ADD to WISHLIST and add it.
			
			driver.findElement(By.xpath("//*[text()='Add to Wishlist']")).click();
			
			
				
					//12.	Enter the comments for the WISHLIST and Click on the Update WISHLIST.

			
			driver.findElement(By.xpath("//*[@placeholder='Please, enter your comments...']")).sendKeys("comment are added sucessfully");
			
				
			driver.findElement(By.xpath("(//*[@name='do']//child::*[text()='Update Wishlist'])[2]")).click();
			
			
			//13.	Click on the ADD to Cart button and add it.
			
			driver.findElement(By.xpath("//*[@title='Add to Cart']//child::*[text()='Add to Cart']")).click();
			
			
			
			//14.	Now Change the order quantity to 1 & Update it.
			driver.findElement(By.xpath("//*[@title='Qty']")).click();
			
			driver.findElement(By.xpath("//*[@title='Qty']")).clear();
			
			driver.findElement(By.xpath("//*[@title='Qty']")).sendKeys("1");
			
			
			driver.findElement(By.xpath("//*[@title='Update']")).click();
			
			
			//15.	Now give the Country, State and Pin-code & click on Estimate button
			
			driver.findElement(By.xpath("//*[@title='Country']")).sendKeys("India");
			
			driver.findElement(By.xpath("//*[@name='region']")).sendKeys("Telengana");
			
			driver.findElement(By.xpath("//*[@name='estimate_postcode']")).sendKeys("500006");
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//*[@title='Estimate']")).click();
			
			
			
				//16.	Now Select the “Fixed” Radio button & Update the Total.
			
			driver.findElement(By.xpath("//*[@type='radio']")).click();
			
			driver.findElement(By.xpath("//*[@title='Update Total']")).click();
			
			
					//17.	Click on the “Checkout with Multiple Addresses”.
			
			driver.findElement(By.xpath("//*[@title='Checkout with Multiple Addresses']")).click();
			
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//*[@title='Enter a New Address']")).click();
			
				
			
					//first name
			String first=driver.findElement(By.xpath("//*[@name='firstname']")).getText();
			System.out.println(first);
			
			driver.findElement(By.xpath("//*[@name='middlename']")).sendKeys("s");
			
			
			String last=driver.findElement(By.xpath("//*[@name='lastname']")).getText();
			System.out.println(last);
			
			driver.findElement(By.xpath("//*[@name='company']")).sendKeys("xxx");
			
			driver.findElement(By.xpath("//*[@name='telephone']")).sendKeys("90889784");
			
			driver.findElement(By.xpath("//*[@name='fax']")).sendKeys("90-784");
			
			driver.findElement(By.xpath("(//*[@name='street[]'])[1]")).sendKeys("vv nagar");
			
			driver.findElement(By.xpath("(//*[@name='street[]'])[2]")).sendKeys("3u8");
			
			driver.findElement(By.xpath("(//*[@name='city'])")).sendKeys("hyd");
			
			driver.findElement(By.xpath("(//*[@name='postcode'])")).sendKeys("7900");
			
			
			Select s=new Select(driver.findElement(By.xpath("//*[@name='country_id']")));
					
			s.selectByValue("IN");
			
			
			driver.findElement(By.xpath("//*[text()='Save Address']")).click();
		
			driver.close();
			
				}



		


	}


