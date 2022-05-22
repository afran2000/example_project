package AliStepDef;

import AliActions.AliAction1;
import AliUtil.AliTestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

    public class AliStepDef1 extends AliTestBase{
	AliAction1 homeAction=new AliAction1();
	
	@Given("^Launch \"([^\"]*)\"$")
	public void launch(String URL) throws Throwable {
		getURL(URL);
	}

	@Then("^Click on Log in$")
	public void click_on_Log_in() throws Throwable {
	    homeAction.clickloginlink();
	    
	}

	@Then("^Type valid username and password$")
	public void type_valid_username_and_password() throws Throwable {
	   homeAction.UserCard(pro.getProperty("username2"),pro.getProperty("password2"));
	}

	@Then("^Click log in button\\.$")
	public void click_log_in_button() throws Throwable {
	   homeAction.clickloginbutton();
	   
	}

	@Then("^Varify Login Pageis displayed with valid user$")
	public void varify_Login_Pageis_displayed_with_valid_user() throws Throwable {
	    homeAction.verify();
	      
	}

	
	@Then("^Click on log in$")
	public void click_on_log_in() throws Throwable {
	 homeAction.clickloginlink();
	}

	@Then("^Type invalid username and valid password$")
	public void type_invalid_username_and_valid_password() throws Throwable {
	 homeAction.UserCard(pro.getProperty("Invalidusername"),pro.getProperty("123456"));
	}

	@Then("^Click log in button$")
	public void click_log_in_button1() throws Throwable {
	   homeAction.clickloginbutton();
	   
	  
	   
	   
	}

	@Then("^Verify user is unable to login$")
	public void verify_user_is_unable_to_login() throws Throwable {
	  
	   
	}


    } 
  
    
