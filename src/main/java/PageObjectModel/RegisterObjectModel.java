package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterObjectModel {

	public WebDriver driver ;
	
	private By MyAccount=By.xpath("//span[@class='caret']");
	private By Register=By.xpath("//a[contains(text(),'Register')]");
	private By FirstName=By.xpath("//input[@id='input-firstname']");
	private By LastName=By.xpath("//input[@id='input-lastname']");
	private By EMail=By.xpath("//input[@name='email']");
	private By Telephone=By.xpath("//input[@id='input-telephone']");
	private By Password=By.xpath("//input[@id='input-password']");
	private By PasswordConfirm=By.xpath("//input[@id='input-confirm']");
	private By Continue=By.xpath("//input[@class='btn btn-primary']");
	private By PrivacyPolicyCheckbox=By.xpath("//input[@name='agree']");
	
	
    public RegisterObjectModel(WebDriver driver2) {
		this.driver=driver2;
	}

    public WebElement SelectMyAccount() {
		
	return driver.findElement(MyAccount);	
	}
	
	public WebElement SelectRegister() {
		
	return driver.findElement(Register);	
	}
	
	public WebElement EnterFirstName() {
		
	return driver.findElement(FirstName);	
	}
	
	public WebElement EnterLastName() {
		
	return driver.findElement(LastName);	
	}
	
	public WebElement EnterEMail() {
		
	return driver.findElement(EMail);	
	}
	
	public WebElement EnterTelephone() {
		
	return driver.findElement(Telephone);	
	}
	
	public WebElement EnterPassword() {
		
	return driver.findElement(Password);	
	}
	
	public WebElement EnterPasswordConfirm() {
		
	return driver.findElement(PasswordConfirm);	
	}
	
	
	public WebElement SelectContinue() {
		
	return driver.findElement(Continue);	
	}
	
	public WebElement SelectPrivacyPolicyCheckbox() {
		
	return driver.findElement(PrivacyPolicyCheckbox);	
	}
}
