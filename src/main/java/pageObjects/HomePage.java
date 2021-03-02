package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	
	public WebDriver driver;
	
	By tShirt=By.linkText("WOMEN");
	By myAccount=By.linkText("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a");
	
	
	
	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}

	public WebElement selectTShirt()
	{
		return driver.findElement(tShirt);
	}
	
	public WebElement myAccount()
	{
		return driver.findElement(myAccount);
	}

	
}