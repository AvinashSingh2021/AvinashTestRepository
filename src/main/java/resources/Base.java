package resources;

import java.io.IOException;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Base {

	public static WebDriver driver;
	
public WebDriver initializeDriver() throws IOException
{
	
	 System.setProperty("webdriver.chrome.driver", "//Users//av321219//Downloads//chromedriver");
	driver= new ChromeDriver();

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
return driver;


}

}
