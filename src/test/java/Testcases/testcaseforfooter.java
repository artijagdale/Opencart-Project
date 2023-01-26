package Testcases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import PageObjectModel.FooterObjectModel;
import Resource.baseclass;
import Resource.constant;

public class testcaseforfooter extends baseclass {

 @Test	
 public void verifyfooter() throws InterruptedException {
	
	 FooterObjectModel FOM=new FooterObjectModel(driver);
	 
	 FOM.SelectContactUs().click();
	 FOM.EnterYourName().sendKeys(constant.YourName);
	 FOM.EnterEMailAddress().sendKeys(constant.EMailAddress);
	 FOM.EnterEnquiry().sendKeys(constant.Enquiry);
	 FOM.SelectSubmit().click();
	 
	 FOM.SelectReturns().click();
	 FOM.EnterFirstName().sendKeys(constant.FirstName);
	 FOM.EnterLastName().sendKeys(constant.LastName);
	 FOM.EnterEMail().sendKeys(constant.EMail);
	 FOM.EnterTelephone().sendKeys(constant.Telephone);
	 FOM.EnterOrderID().sendKeys(constant.OrderID);
	 FOM.SelectCalender().click();
	 FOM.Selectnext().click();
	 FOM.SelectDate().click();
	 FOM.EnterProductName().sendKeys(constant.ProductName);
	 FOM.EnterProductCode().sendKeys(constant.ProductCode);
	 FOM.SelectReasonForReturn().click();
	 FOM.SelectSubmit1().click();
	
	 FOM.Selectbrands().click();
	 FOM.SelectApple().click();
	
	 FOM.SelectGiftCertificates().click();
	 FOM.EnterRecipientsName().sendKeys(constant.RecipientsName);
	 FOM.EnterRecipientsEMail().sendKeys(constant.RecipientsEMail);
     FOM.EnterYourName1().sendKeys(constant.YourName1);
     FOM.EnterYourEMail().sendKeys(constant.YourEMail);
     FOM.SelectGiftCertificateTheme().click();
     FOM.EnterMessage().sendKeys(constant.Message);
     FOM.SelectCheckBox().click();
     FOM.SelectContinue().click();
    
     FOM.SelectAffiliate().click();
     FOM.EntertAffiliateEMail().sendKeys(constant.AffiliateEMail);
     FOM.EnterPassword().sendKeys(constant.Password2);
     FOM.SelectLogin().click();
    
     FOM.SelectSpecials().click();
 
 }
}
