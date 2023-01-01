package Testcases;

import org.testng.annotations.Test;

import PageObjectModel.RegisterObjectModel;
import Resource.baseclass;
import Resource.constant;

public class testcaseforRegister extends baseclass {

    @Test 
	public void verifyRegister() {
		
		RegisterObjectModel ROM=new RegisterObjectModel(driver);	
		
		ROM.SelectMyAccount().click();
		ROM.SelectRegister().click();
		ROM.EnterFirstName().sendKeys(constant.FirstName);
		ROM.EnterLastName().sendKeys(constant.LastName);
	    ROM.EnterEMail().sendKeys(constant.EMail);
	    ROM.EnterTelephone().sendKeys(constant.Telephone);
	    ROM.EnterPassword().sendKeys(constant.Password);
	    ROM.EnterPasswordConfirm().sendKeys(constant.ConfirmPassword);
	    ROM.SelectPrivacyPolicyCheckbox().click();
	    ROM.SelectContinue().click();
	}
	
	
}
