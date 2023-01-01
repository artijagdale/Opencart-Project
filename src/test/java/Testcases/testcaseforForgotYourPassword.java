package Testcases;

import org.testng.annotations.Test;

import PageObjectModel.LoginObjectModel;
import PageObjectModel.PasswordObjectModel;
import PageObjectModel.RegisterObjectModel;
import Resource.baseclass;
import Resource.constant;

public class testcaseforForgotYourPassword extends baseclass {
	
	@Test
	public void verifyForgottenPassword() {
		
        RegisterObjectModel ROM=new RegisterObjectModel(driver);	
		
		ROM.SelectMyAccount().click();	
		
        LoginObjectModel LOM=new LoginObjectModel(driver);
		
		LOM.SelectLogin().click();
		
	    PasswordObjectModel POM=new PasswordObjectModel(driver);
		
		POM.selectForgottenPassword().click();
		POM.EnterEMailAddress().sendKeys(constant.EMailAddress);
	    POM.SelectContinue().click();
	}

}
