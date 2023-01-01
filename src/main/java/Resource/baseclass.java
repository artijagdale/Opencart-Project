package Resource;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class baseclass {
	
	public WebDriver driver;
	
	public void browserInitialization() throws IOException {
		
	FileInputStream fis=new FileInputStream("C:\\Users\\Arti Jagdale\\eclipse-workspace\\opencartproject\\src\\main\\java\\Resource\\data.properties");	
	
	Properties prop=new Properties();
	
	prop.load(fis);
	
	String browserName=prop.getProperty("browser");
	
	if(browserName.equalsIgnoreCase("chrome")) {
		
	 driver=new ChromeDriver();	
	}
	
	else if(browserName.equalsIgnoreCase("Firefox")) {
	
	//firefox code	
	}	
	
	else {
		
	System.out.println("Please enter valid browser name");	
	}
	}
	
	@BeforeMethod
	public void launch() throws IOException {
		
	browserInitialization();
	driver.get("https://naveenautomationlabs.com/opencart/");
	
	}
	
	
	
}
