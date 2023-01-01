package Resource;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class helpingmethods {

	public static void mouseover(WebDriver driver,WebElement headerelement) {
		
	Actions a=new Actions(driver);
	a.moveToElement(headerelement).perform(); 
	}
	
	public static void doubleclick(WebDriver driver,WebElement headerelement) {
		
		Actions a=new Actions(driver);
		a.doubleClick(headerelement).perform();

}
   public static void contextclick(WebDriver driver,WebElement headerelement) {
		
		Actions a=new Actions(driver);
		a.contextClick(headerelement).perform();
}
}