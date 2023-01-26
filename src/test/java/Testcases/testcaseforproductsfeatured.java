package Testcases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import PageObjectModel.AddToCart_Product_PageObject;
import Resource.baseclass;
import Resource.constant;
import Resource.helpingmethods;

public class testcaseforproductsfeatured extends baseclass {
	@Test
	public void verifyproductsaddtocartprice() throws InterruptedException {
		
		AddToCart_Product_PageObject mp = new AddToCart_Product_PageObject(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		mp.searchEnter().sendKeys(constant.search); //search text enter(iphone)
		mp.searchBtnClick().click();//search button click
		mp.iphoneclick().click();
		Thread.sleep(5000);
		
		//For 1st product price
		String price1 =mp.priceCheck().getText();
		double d1=helpingmethods.productPriceHandle(price1);
		
	    mp.addtocartClick().click();  //add to cart click
	
		mp.searchEnter().clear();  //to clear previous entered text
		
		mp.searchEnter().sendKeys(constant.search1); //search text enter(samsung)
		mp.searchBtnClick().click();  //search button click
		
		//For 2nd product price
		String price2 =mp.price2Check().getText();
		double d2=helpingmethods.productPriceHandle(price2);
		
        mp.SamsungClick().click();
        Thread.sleep(5000);
		mp.addtocartSamsungClick().click();  //add to cart click
        
	
		//total price of products
		double add=d1+d2;
		String actualPriceconvert=Double.toString(add); //convert double to string for adding $
		String actualPrice=("$"+actualPriceconvert);
		System.out.println("Actual Addition of price:"+actualPrice);
		Thread.sleep(2000);

		mp.totalItemBtnClick().click(); //Total item click
		String expectedPriceCart=mp.expectedTotalPriceCheck().getText();
		double d3=helpingmethods.productPriceHandle(expectedPriceCart);//Expected Price from cart
		String expectedPriceConvert=Double.toString(d3); //convert expected price into double
		String expectedPrice=("$"+expectedPriceConvert);
		
		System.out.println("Expected addition :"+expectedPrice);
		if(actualPrice.equals(expectedPrice))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}     
		}
}
