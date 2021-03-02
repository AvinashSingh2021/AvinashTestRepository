package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Shipping {

	
	public WebDriver driver;
	

	By checkbox=By.xpath("//*[@id=\"cgv\"]");
	By submit=By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/form/p/button/span");
	
	
	
	public Shipping(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}

	public WebElement checkbox()
	{
		return driver.findElement(checkbox);
	}
	
	public WebElement submit()
	{
		return driver.findElement(submit);
	}
	
}