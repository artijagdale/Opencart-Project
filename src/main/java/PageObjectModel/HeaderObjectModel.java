package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeaderObjectModel {

	public WebDriver driver;
	
	private By Desktops=By.xpath("(//a[@class='dropdown-toggle'])[2]");
	private By LaptopsNotebooks=By.xpath("(//a[@class='dropdown-toggle'])[3]");
	private By Components=By.xpath("(//a[@class='dropdown-toggle'])[4]");
	private By Tablets=By.xpath("//a[contains(text(),'Tablets')]");
	private By Software=By.xpath("//a[contains(text(),'Software')]");
	private By PhonesPDAs=By.xpath("//a[contains(text(),'Phones & PDAs')]");
	private By Cameras=By.xpath("(//a[contains(text(),'Cameras')])[2]");
	private By MP3Players=By.xpath("(//a[@class='dropdown-toggle'])[5]");
	private By Mac=By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=20_27']");
	private By Monitors=By.xpath("//a[contains(text(),'Monitors')]");
	private By ShowAllDesktop=By.xpath("//a[contains(text(),'Show All Desktops')]");
	private By ShowAllLaptopsandNotebooks=By.xpath("//a[contains(text(),'Show All Laptops & Notebooks')]");
	private By ShowAllComponents=By.xpath("//a[contains(text(),'Show All Components')]");
	private By ShowAllMP3Players=By.xpath("//a[contains(text(),'Show All MP3 Players')]");
	
	public HeaderObjectModel(WebDriver driver2) {
	   this.driver=driver2;
	}

	public WebElement Desktops() {
		
	return driver.findElement(Desktops);	
	}
	
	public WebElement LaptopsNotebooks() {
		
	return driver.findElement(LaptopsNotebooks);	
	}
	
	public WebElement Components() {
		
	return driver.findElement(Components);	
	}
	
	public WebElement Tablets() {
		
	return driver.findElement(Tablets);	
	}
	
	public WebElement Software() {
		
	return driver.findElement(Software);
	}
	
	public WebElement PhonesPDAs() {
		
	return driver.findElement(PhonesPDAs);
	}
	
	public WebElement Cameras() {
		
	return driver.findElement(Cameras);
	}
	
	public WebElement MP3Players() {
		
	return driver.findElement(MP3Players);
	}
	
	public WebElement SelectMac() {
		
	return driver.findElement(Mac);
	}
	
	public WebElement SelectMonitors() {
		
	return driver.findElement(Monitors);
	}
	
	public WebElement SelectShowAllDesktop() {
		
	return driver.findElement(ShowAllDesktop);
	}
	
	public WebElement SelectShowAllLaptopsandNotebooks() {
		
	return driver.findElement(ShowAllLaptopsandNotebooks);
	}
	
	public WebElement SelectShowAllComponents() {
		
	return driver.findElement(ShowAllComponents);
	}
	
	public WebElement SelectShowAllMP3Players() {
		
	return driver.findElement(ShowAllMP3Players);
	}
}
