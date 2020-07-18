package seleniumpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getText_Method {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver 4");
		ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.walmart.com/");
        //webElement method(),getAttribute()
//        WebElement searchBox=driver.findElement(By.xpath("//input[@name='query']"));
//        String att=searchBox.getAttribute("id");
//        System.out.println(att);
//        String att1=searchBox.getAttribute("type");
//        System.out.println(att1);
        //another way
        Thread.sleep(4000);
        String searchBox=driver.findElement(By.xpath("//input[@name='query']")).getAttribute("id");
        System.out.println(searchBox);
//        WebElement element=driver.findElement(By.xpath("(//span[@class='b_a ab_b b_g b_b b_p x_a x_h x_i'])[1]"));
//        String text=element.getText();
//        System.out.println(text);
      
        driver.close();
        
        

	}

}
