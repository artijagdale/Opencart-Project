package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PasswordObjectModel {
    
	public WebDriver driver;
	
	private By ForgottenPassword= By.xpath("(//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=account/forgotten'])[2]");
    private By EMailAddress=By.xpath("//input[@id='input-email']");
    private By Continue=By.xpath("//input[@class='btn btn-primary']");
    
    
    public PasswordObjectModel(WebDriver driver2) {
		     this.driver=driver2;
	}

	public WebElement selectForgottenPassword() {
    	
    return driver.findElement(ForgottenPassword);	
    }

    public WebElement EnterEMailAddress() {
    	
    return driver.findElement(EMailAddress);	
    }
    
    public WebElement SelectContinue() {
    	
    return driver.findElement(Continue);	
    }

}
