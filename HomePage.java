package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	
	public WebDriver driver;
	

	By addToCart=By.name("Add to cart");
	By quickView=By.className("quick-view");
	
	
	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}
//
//	public WebElement getTshirtOption()
//	{
//		return driver.findElement(a);
//	}
	
	public WebElement addToCartOption()
	{
		return driver.findElement(addToCart);
	}
	
	public WebElement quickView()
	{
		return driver.findElement(quickView);
	}

	
}