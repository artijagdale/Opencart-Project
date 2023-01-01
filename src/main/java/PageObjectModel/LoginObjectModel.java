package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginObjectModel {
    
	public WebDriver driver;
    
	private By Login=By.xpath("//a[contains(text(),'Login')]");
	private By EMailAddress=By.xpath("//input[@id='input-email']");
	private By Password=By.xpath("//input[@id='input-password']");
	private By Login1=By.xpath("//input[@class='btn btn-primary']");
	
	
	
	
	public LoginObjectModel(WebDriver driver2) {
	 this.driver=driver2;
	}

	public WebElement SelectLogin() {
		
	return driver.findElement(Login);	
	}
	
	public WebElement EnterEMailAddress() {
		
	return driver.findElement(EMailAddress);	
	}
	
	public WebElement EnterPassword() {
		
	return driver.findElement(Password);	
	}
	
	public WebElement SelectLogin1() {
		
	return driver.findElement(Login1);	
	}
	
	
}
