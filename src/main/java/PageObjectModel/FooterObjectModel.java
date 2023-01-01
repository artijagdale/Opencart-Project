package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FooterObjectModel {
    
	public WebDriver driver;
	
	private By ContactUs=By.xpath("//a[contains(text(),'Contact Us')]");
	private By YourName=By.xpath("//input[@id='input-name']");
	private By EMailAddress=By.xpath("//input[@name='email']");
	private By Enquiry=By.xpath("//textarea[@id='input-enquiry']");
	private By Submit=By.xpath("//input[@type='submit']");
	private By Returns=By.xpath("//a[contains(text(),'Returns')]");
	private By FirstName=By.xpath("//input[@id='input-firstname']");
	private By LastName=By.xpath("//input[@id='input-lastname']");
	private By EMail=By.xpath("//input[@id='input-email']");
	private By Telephone=By.xpath("//input[@id='input-telephone']");
	private By OrderID=By.xpath("//input[@id='input-order-id']");
	private By Calender=By.xpath("//button[@class='btn btn-default']");
	private By next=By.xpath("(//th[@class='next'])[1]");
	private By date=By.xpath("(//td[@class='day'])[1]");
	private By ProductName=By.xpath("//input[@id='input-product']");
	private By ProductCode=By.xpath("//input[@id='input-model']");
	private By Quantity=By.xpath("//input[@id='input-quantity']");
	private By ReasonForReturn=By.xpath("(//input[@name='return_reason_id'])[3]");
	private By Submit1=By.xpath("//input[@type='submit']");
	private By Brands=By.xpath("//a[contains(text(),'Brands')]");
	private By Apple=By.xpath("//a[contains(text(),'Apple')]");
	private By GiftCertificates=By.xpath("//a[contains(text(),'Gift Certificates')]");
	private By RecipientsName=By.xpath("//input[@name='to_name']");
	private By RecipientsEMail=By.xpath("//input[@name='to_email']");
	private By YourName1=By.xpath("//input[@name='from_name']");
	private By YourEMail=By.xpath("//input[@name='from_email']");
	private By GiftCertificateTheme=By.xpath("(//input[@name='voucher_theme_id'])[1]");
	private By Message=By.xpath("//textarea[@id='input-message']");
	private By CheckBox=By.xpath("//input[@type='checkbox']");
	private By Continue=By.xpath("//input[@value='Continue']");
	private By Affiliate=By.xpath("//a[contains(text(),'Affiliate')]");
	private By AffiliateEMail=By.xpath("//input[@id='input-email']");
	private By Password=By.xpath("//input[@id='input-password']");
	private By Login=By.xpath("//input[@class='btn btn-primary']");
	private By Specials=By.xpath("//a[contains(text(),'Specials')]");
	
	public FooterObjectModel(WebDriver driver2) {
		
		this.driver=driver2;
	}

	public WebElement SelectContactUs() {
		
	return driver.findElement(ContactUs);	
	}
	
	public WebElement EnterYourName() {
		
	return driver.findElement(YourName);	
	}
	
	public WebElement EnterEMailAddress() {
		
	return driver.findElement(EMailAddress);	
	}
	
	public WebElement EnterEnquiry() {
		
	return driver.findElement(Enquiry);	
	}
	
	public WebElement SelectSubmit() {
		
	return driver.findElement(Submit);	
	}
	
	public WebElement SelectReturns() {
		
	return driver.findElement(Returns);	
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
	
	public WebElement EnterOrderID() {
		
	return driver.findElement(OrderID);	
	}
	
	public WebElement SelectCalender() {
		
	return driver.findElement(Calender);	
	}
	
	public WebElement Selectnext() {
		
	return driver.findElement(next);	
	}
	
	public WebElement SelectDate() {
		
	return driver.findElement(date);	
	}
	
	public WebElement EnterProductName() {
		
	return driver.findElement(ProductName);	
	}
	
	public WebElement EnterProductCode() {
		
	return driver.findElement(ProductCode);	
	}
	
	public WebElement SelectReasonForReturn() {
		
	return driver.findElement(ReasonForReturn);	
	}
	
	public WebElement SelectSubmit1() {
		
	return driver.findElement(Submit1);	
	}
	
	public WebElement Selectbrands() {
		
	return driver.findElement(Brands);	
	}
	
	public WebElement SelectApple() {
		
	return driver.findElement(Apple);	
	}
	
	public WebElement SelectGiftCertificates() {
		
	return driver.findElement(GiftCertificates);	
	}
	
	public WebElement EnterRecipientsName() {
		
	return driver.findElement(RecipientsName);	
	}
	
	public WebElement EnterRecipientsEMail() {
		
	return driver.findElement(RecipientsEMail);	
	}
	
	public WebElement EnterYourName1() {
		
	return driver.findElement(YourName1);	
	}
	
	public WebElement EnterYourEMail() {
		
	return driver.findElement(YourEMail);	
	}
	
	public WebElement SelectGiftCertificateTheme() {
		
	return driver.findElement(GiftCertificateTheme);	
	}
	
	public WebElement EnterMessage() {
		
	return driver.findElement(Message);	
	}
	
	public WebElement SelectCheckBox() {
		
	return driver.findElement(CheckBox);	
	}
	
	public WebElement SelectContinue() {
		
	return driver.findElement(Continue);	
	}
	
	public WebElement SelectAffiliate() {
		
	return driver.findElement(Affiliate);	
	}
	
	public WebElement EntertAffiliateEMail() {
		
	return driver.findElement(AffiliateEMail);	
	}
	
	public WebElement EnterPassword() {
		
	return driver.findElement(Password);	
	}
	
	public WebElement SelectLogin() {
		
	return driver.findElement(Login);	
	}
	
	public WebElement SelectSpecials() {
		
	return driver.findElement(Specials);	
	}
}
