package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderHistory {

	
	public WebDriver driver;
	
	By verify=By.xpath("//*[@id=\"order-list\"]/tbody/tr[1]/td[1]/a");
	
	
	public OrderHistory(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}

	public WebElement verify()
	{
		return driver.findElement(verify);
	}

	
}
