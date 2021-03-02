package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class myAccountPage {

	
	public WebDriver driver;
	
	By selectPersonalInfo=By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[4]/a/span");
	
	
	public myAccountPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}

	public WebElement selectPersonalInfo()
	{
		return driver.findElement(selectPersonalInfo);
	}
	
}
