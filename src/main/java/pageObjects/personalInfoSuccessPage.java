package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class personalInfoSuccessPage {

	
	public WebDriver driver;

	
	By ConfirmationText=By.xpath("//*[@id=\"center_column\"]/div/p");
	
	
	
	public personalInfoSuccessPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}

	public WebElement ConfirmationText()
	{
		return driver.findElement(ConfirmationText);
	}

	
}
