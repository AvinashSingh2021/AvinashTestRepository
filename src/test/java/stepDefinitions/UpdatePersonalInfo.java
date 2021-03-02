package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import io.cucumber.junit.Cucumber;
import pageObjects.personalInfoSuccessPage;
import pageObjects.personalInformationPage;
import resources.Base;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


@RunWith(Cucumber.class)
	public class UpdatePersonalInfo extends Base {

	    @Given("^I click on my login name$")
	    public void i_click_on_my_login_name() throws Throwable {
	    }

	    
	    @When("^I select my personal information option")
	    public void i_select_my_personal_information_option() throws Throwable {
	    	driver.manage().window().maximize();
	    	WebElement element = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[4]/a/span"));
	    	element.click();
	    }

	    @When("^I change my first name and provide password$")
	    public void i_change_my_first_name_and_provide_password() throws Throwable {
	    	personalInformationPage pi = new personalInformationPage(driver);
	    	pi.firstName().clear();
	    	pi.firstName().sendKeys("Avinash R");
	    	pi.oldPassword().sendKeys("Avi@mar20");
	    }

	    @Then("^I should see personal information is successfully updated$")
	    public void i_should_see_personal_information_is_successfully_updated() throws Throwable {
	    	personalInfoSuccessPage ps = new personalInfoSuccessPage(driver);
	      	  if(ps.ConfirmationText().getText().contains("updated")) {
	      	   System.out.println("First name updated");
	      	  }
	      	  else {
	      	   System.out.println("First name update failed");
	      	  }

	    }

	    @And("^I select save option$")
	    public void i_select_save_option() throws Throwable {
	    	personalInformationPage pi = new personalInformationPage(driver);
	    	pi.savePersonalInfo().click();

	    }

	}
