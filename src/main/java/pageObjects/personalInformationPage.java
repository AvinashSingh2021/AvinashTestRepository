package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class personalInformationPage {

	
	public WebDriver driver;
	
	By firstName=By.id("firstname");
	By oldPassword=By.id("old_passwd");
	By save=By.xpath("//*[@id=\"center_column\"]/div/form/fieldset/div[11]/button");
	
	//*[@id="center_column"]/div/form/fieldset/div[11]/button
	
	
	public personalInformationPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}

	public WebElement firstName()
	{
		return driver.findElement(firstName);
	}
	
	public WebElement oldPassword()
	{
		return driver.findElement(oldPassword);
	}
	
	public WebElement savePersonalInfo()
	{
		return driver.findElement(save);
	}

	
}