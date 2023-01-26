package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddToCart_Product_PageObject {

	public WebDriver driver;
	private By search=By.xpath("//input[@name='search']");
	private By searchBtn=By.xpath("//button[@class='btn btn-default btn-lg']");
	private By iphone=By.xpath("//a[contains(text(),'iPhone')]");
	private By addtocart=By.xpath("//button[@id='button-cart']");
	private By Samsung=By.xpath("//a[contains(text(),'Samsung SyncMaster 941BW')]");
	private By addtocartsamsung=By.xpath("//button[@class='btn btn-primary btn-lg btn-block']");
	private By price=By.xpath("//h2[contains(text(),'$123.20')]");
	private By price2=By.xpath("(//p[@class='price'])[1]");
	private By totalItemBtn=By.xpath("//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']");
	private By expectedTotalPrice=By.xpath("(//td[@class='text-right'])[12]");
	

	public AddToCart_Product_PageObject(WebDriver driver2) {
	
		this.driver=driver2;
	}
	public WebElement searchEnter() {
	return driver.findElement(search);
	}
	
	public WebElement searchBtnClick() {
	return driver.findElement(searchBtn);
	}

	public WebElement iphoneclick() {
	return driver.findElement(iphone);
	}
	
	public WebElement addtocartClick() {
	return driver.findElement(addtocart);
	}
	
	public WebElement SamsungClick() {
	return driver.findElement(Samsung);
		}
	
	public WebElement addtocartSamsungClick() {
	return driver.findElement(addtocartsamsung);
	}
	
	public WebElement priceCheck() {
	return driver.findElement(price);
	}
	
	public WebElement price2Check() {
	return driver.findElement(price2);
		}
	
	public WebElement totalItemBtnClick() {
	return driver.findElement(totalItemBtn);
	}
	
	public WebElement expectedTotalPriceCheck() {
	return driver.findElement(expectedTotalPrice);
	}
}
