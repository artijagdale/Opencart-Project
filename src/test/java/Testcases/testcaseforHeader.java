package Testcases;

import org.testng.annotations.Test;

import PageObjectModel.HeaderObjectModel;
import Resource.baseclass;
import Resource.helpingmethods;

public class testcaseforHeader extends baseclass {

 @Test	
 public void totestheaderelements() throws InterruptedException {
	
	 HeaderObjectModel HOM=new HeaderObjectModel(driver);	
	 
	 HOM.Desktops().isDisplayed();
	 HOM.LaptopsNotebooks().isDisplayed();
	 HOM.Components().isDisplayed();
	 HOM.Tablets().isDisplayed();
	 HOM.Software().isDisplayed();
	 HOM.PhonesPDAs().isDisplayed();
	 HOM.Cameras().isDisplayed();
	 HOM.MP3Players().isDisplayed();
	 
	 helpingmethods.mouseover(driver, HOM.Desktops());
	 HOM.SelectMac().click();
	 HOM.SelectShowAllDesktop();
	 helpingmethods.mouseover(driver, HOM.LaptopsNotebooks());
	 HOM.SelectShowAllLaptopsandNotebooks().click();
	 helpingmethods.mouseover(driver, HOM.Components());
	 HOM.SelectMonitors().click();
	 Thread.sleep(5000);
	
	 helpingmethods.doubleclick(driver, HOM.Tablets());
	 helpingmethods.doubleclick(driver, HOM.Software());
	 helpingmethods.doubleclick(driver, HOM.PhonesPDAs());
	 helpingmethods.doubleclick(driver, HOM.Cameras());
	 helpingmethods.mouseover(driver, HOM.MP3Players());
	 HOM.SelectShowAllMP3Players().click();
	 
	 helpingmethods.contextclick(driver, HOM.Desktops());
	 helpingmethods.contextclick(driver, HOM.LaptopsNotebooks());
	 helpingmethods.contextclick(driver, HOM.Components());
	 helpingmethods.contextclick(driver, HOM.Tablets());
	 helpingmethods.contextclick(driver, HOM.Software());
	 helpingmethods.contextclick(driver, HOM.PhonesPDAs());
	 helpingmethods.contextclick(driver, HOM.Cameras());
	 helpingmethods.contextclick(driver, HOM.MP3Players());
}
 
 
 
 
}
