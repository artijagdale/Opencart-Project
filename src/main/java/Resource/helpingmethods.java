package Resource;

import java.util.Arrays;

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
   
	public static double productPriceHandle(String price1)
	{
		String price =price1;
		String pr[]=price.split("\\s+");
		System.out.println(Arrays.toString(pr));
		String a=pr[0];
		System.out.println("Method:"+a);
		String removeDoller=a;
		String AfterRemoveDoller=removeDoller.replaceAll("[$]","");
		System.out.println("Before parseDouble:"+AfterRemoveDoller);
		double d=Double.parseDouble(AfterRemoveDoller);
		System.out.println("After parseDouble:="+d);
		return d;
	}


}