package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Checkout {

	
	public WebDriver driver;
	

	By checkout1=By.xpath("/html//div[@id='layer_cart']//a[@title='Proceed to checkout']/span");
	By checkout2=By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/p[2]/a[1]/span");
	By checkout3=By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/form/p/button/span");
	By addToCart=By.xpath("//p[@id='add_to_cart']//span[.='Add to cart']");
	
	
	public Checkout(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}

	public WebElement checkout1()
	{
		return driver.findElement(checkout1);
	}

	public WebElement checkout2()
	{
		return driver.findElement(checkout2);
	}

	
	public WebElement checkout3()
	{
		return driver.findElement(checkout3);
	}

	public WebElement addToCart()
	{
		return driver.findElement(addToCart);
	}

	
}