package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import io.cucumber.junit.Cucumber;
import pageObjects.LoginPage;
import resources.Base;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


@RunWith(Cucumber.class)
	public class UpdatePersonalInfo extends Base {

	    @Given("^I click on my login name$")
	    public void i_click_on_my_login_name() throws Throwable {
	    	WebElement element = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));
	    	element.click();

	    }

	    @When("^I 	select my personal information option$")
	    public void i_select_my_personal_information_option() throws Throwable {
	    	WebElement element = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[4]/a/span"));
	    	element.click();

	    }

	    @When("^I change my first name and provide password$")
	    public void i_change_my_first_name_and_provide_password() throws Throwable {
	    	WebElement element = driver.findElement(By.id("firstname"));
	    	element.clear();
	    	element.sendKeys("Avinash R");
	    	WebElement element1 = driver.findElement(By.id("old_passwd"));
	    	element1.sendKeys("Avi@mar20");
	    }

	    @Then("^I should see my account options$")
	    public void i_should_see_my_account_options() throws Throwable {
	
	    }

	    @Then("^I should be on personal information page$")
	    public void i_should_be_on_personal_information_page() throws Throwable {
	    
	    }

	    @Then("^I should see personal information is successfully updated$")
	    public void i_should_see_personal_information_is_successfully_updated() throws Throwable {
	    	  String ConfirmationText=driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/p")).getText();
	    	  
	      	  if(ConfirmationText.contains("updated")) {
	      	   System.out.println("First name updated");
	      	  }
	      	  else {
	      	   System.out.println("First name update failed");
	      	  }

	        
	    }

	    @And("^I select save option$")
	    public void i_select_save_option() throws Throwable {
	    	WebElement element = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/form/fieldset/div[11]/button"));
	    	element.click();

	    }

	}
