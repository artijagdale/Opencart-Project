package Testcases;

import org.testng.annotations.Test;

import PageObjectModel.LoginObjectModel;
import PageObjectModel.RegisterObjectModel;
import Resource.baseclass;
import Resource.constant;

public class testcaseforLogin extends baseclass{
    @Test
	public void verifyLogin() {
		
        RegisterObjectModel ROM=new RegisterObjectModel(driver);	
		
		ROM.SelectMyAccount().click();	
		
		LoginObjectModel LOM=new LoginObjectModel(driver);
		
		LOM.SelectLogin().click();
		LOM.EnterEMailAddress().sendKeys(constant.EMailAddress);
		LOM.EnterPassword().sendKeys(constant.Password1);
		LOM.SelectLogin1().click();
	}
}
