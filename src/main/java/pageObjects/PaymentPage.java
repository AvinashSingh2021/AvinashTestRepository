package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaymentPage {

	
	public WebDriver driver;
	
	By PaybyChequeWire=By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/div[3]/div[2]/div/p/a");
	By confirmOrder=By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/form/p/button/span");
	
	
	public PaymentPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}

	public WebElement PaybyChequeWire()
	{
		return driver.findElement(PaybyChequeWire);
	}
	

	public WebElement confirmOrder()
	{
		return driver.findElement(confirmOrder);
	}


	
}
