package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	WebDriver driver;
	
	public Login()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="txtUsername")
	private WebElement userName;
	
	@FindBy(id="txtPassword")
	private WebElement password;
	
	@FindBy(id="btnLogin")
	private WebElement loginbtn;
	
	@FindBy(id="spanMessage")
	private WebElement errorMsg;
	
	
	
	public void enterUserName(String uname)
	{
	userName.sendKeys(uname);
	}
	public void enterPassword(String pwd)
	{
		password.sendKeys(pwd);	
	}
	public void clicklgnbtn()
	{
		loginbtn.click();
	}
	public String gettitle(){
		return driver.getTitle();
	}
	
	public void getErrorMsg()
	{
		errorMsg.isDisplayed();
		errorMsg.getText();
		
	}

	

}
