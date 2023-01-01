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

import Resource.baseclass;

public class testcaseforproductsfeatured extends baseclass {
	@Test
	public void verifyproductsaddtocartprice() throws InterruptedException {
		
	driver.findElement(By.xpath("//input[@name='search']")).sendKeys("Macbook");
    driver.findElement(By.xpath("//i[@class='fa fa-search']")).click();
    
    
    
    List<WebElement>a=driver.findElements(By.xpath("//h4"));
    
   
    String MacbookText="";
    for(int i=0; i<a.size(); i++) {
    String text=a.get(i).getText();
    if(text.equalsIgnoreCase("Macbook")) {
   String MacbookCost=driver.findElements(By.xpath("//p[@class='price']")).get(i).getText();
   String[]z=MacbookCost.split("\\s+");
   String ab=z[0];
   String removeDollar=ab;
   String Afterremovingdollar=removeDollar.replaceAll("[$,]", "");
   double d=Double.parseDouble(Afterremovingdollar);
   
  System.out.println(d);
  
 // driver.findElements(By.xpath("//span[contains(text(),'Add to Cart')]")).get(i).click();
  
 /* WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//span[contains(text(),'Add to Cart')]"))); 
  driver.findElements(By.xpath("//span[contains(text(),'Add to Cart')]")).get(i).click();
  //  wait.until(ExpectedConditions.elementToBeClickable((By) element));
  
/*  Thread.sleep(10000);  
   
  List<WebElement> element=driver.findElements(By.xpath("//span[contains(text(),'Add to Cart')]"));
  
  JavascriptExecutor js=(JavascriptExecutor)driver;
  ((JavascriptExecutor)driver).executeScript("arguments[0].click();",element);
  ((WebElement) driver.findElements(By.xpath("//span[contains(text(),'Add to Cart')]"))).click();
  
  // WebDriverWait wait = new  WebDriverWait(driver,Duration.ofSeconds(100));
  // wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.xpath("//span[contains(text(),'Add to Cart')]")))).get(i).click();
  */
 /*  driver.findElement(By.xpath("//input[@name='search']")).clear();
   driver.findElement(By.xpath("//input[@name='search']")).sendKeys("iphone");
   driver.findElement(By.xpath("//i[@class='fa fa-search']")).click();
   */
    }
    }
	
	}

}
