package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import io.cucumber.junit.Cucumber;
import pageObjects.Checkout;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.OrderConfirmationPage;
import pageObjects.OrderHistory;
import pageObjects.PaymentPage;
import pageObjects.Shipping;
import resources.Base;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


@RunWith(Cucumber.class)
public class OrderTShirt extends Base {

    @Given("^I launch the application url$")
    public void i_launch_the_application_url() throws Throwable {
    	driver =initializeDriver();
		driver.get("http://automationpractice.com");
    }

    @When("^I click on Signin button$")
    public void i_click_on_signin_button() throws Throwable {
		LoginPage lp=new LoginPage(driver);
		lp.getSignIn().click();

    }

    @When("^I enter credentials with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_enter_credentials_with_username_and_password(String Username,String Password) throws Throwable {
    	LoginPage lp=new LoginPage(driver);
		lp.getEmail().sendKeys(Username);
		lp.getPassword().sendKeys(Password);	
		lp.getLogin().click();
    }

    @When("^I click on tshirt option$")
    public void i_click_on_tshirt_option() throws Throwable {
    	  HomePage hp=new HomePage(driver);
    	  hp.selectTShirt().click();

    	  WebElement FirstImg=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div[2]/ul/li[1]/div/div[1]/div/a[1]/img"));
    	  WebElement MoreBtn=driver.findElement(By.xpath("/html/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul/li[1]/div[1]/div[2]/div[2]/a[2]"));
    	  Actions actions=new Actions(driver);
    	  actions.moveToElement(FirstImg).moveToElement(MoreBtn).click().perform();
    }


    @When("^I select to proceed checkout on summary page$")
    public void i_select_to_proceed_checkout_on_summary_page() throws Throwable { 	
  	  	Checkout ch=new Checkout(driver);
  	  	ch.checkout1().click();
  	  	ch.checkout2().click();
  	  	ch.checkout3().click();

    }

    @When("^I agree terms and condition$")
    public void i_agree_terms_and_condition() throws Throwable {
  	  		Shipping tc=new Shipping(driver);
  	  		tc.checkbox().click();
  	  		tc.submit().click();

    }

    @When("^I select PaybyChequeWire option$")
    public void i_select_paybybankwire_option() throws Throwable {
	  		PaymentPage pc=new PaymentPage(driver);  	  	
	  		pc.PaybyChequeWire().click();

    }

    @When("^I click on Back to Orders$")
    public void i_click_on_back_to_orders() throws Throwable {
    	OrderConfirmationPage oc=new OrderConfirmationPage(driver);
    	oc.element().click();
    	oc.element1().click();

    }
 


    @Then("^I should be on order confirmation page$")
    public void i_should_be_on_order_confirmation_page() throws Throwable {
    	  OrderConfirmationPage oc=new OrderConfirmationPage(driver);
      	  if(oc.ConfirmationText().getText().contains("complete")) {
      	   System.out.println("Order Completed: Test Case Passed");
      	  }
      	  else {
      	   System.out.println("Order Not Successfull: Test Case Failed");
      	  }

    }

    @Then("^I should see order history$")
    public void i_should_see_order_history() throws Throwable {
    	OrderHistory oh = new OrderHistory(driver);
    	String history = oh.verify().getText();
    	if(history.isEmpty())
    	{
    	   System.out.println("history not available");
    		   
    	} else {
    		System.out.println("history available");
    	}
    	
    }

    @And("^I add tshirt to add to cart$")
    public void i_add_tshirt_to_add_to_cart() throws Throwable {
  	  	Checkout ch=new Checkout(driver);
  	  	ch.addToCart().click();

    }


    @And("^I confirm order$")
    public void i_confirm_order() throws Throwable {
  		PaymentPage pc=new PaymentPage(driver);
  		pc.confirmOrder().click();

    }

}