package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderConfirmationPage {

	
	public WebDriver driver;
	

	By ConfirmationText=By.xpath("//div[@id='center_column']/p[@class='alert alert-success']");
	By element=By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a");
	By element1=By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[1]/a/span");
	
	
	public OrderConfirmationPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}

	public WebElement ConfirmationText()
	{
		return driver.findElement(ConfirmationText);
	}
	public WebElement element()
	{
		return driver.findElement(element);
	}

	public WebElement element1()
	{
		return driver.findElement(element1);
	}


	
}
