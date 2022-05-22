package AliLocator;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import AliUtil.AliTestBase;

public class AliLocator1 extends AliTestBase {
	
	public AliLocator1() {
	
PageFactory.initElements(driver, this);// page object model - maven 
		}

@FindBy(how=How.ID, using="loginusername")
public WebElement UserName;

@FindBy(how=How.ID, using="loginpassword")
public WebElement Password;

@FindBy(how=How.XPATH, using="//button[text()='Log in']")
public WebElement LoginButton;

@FindBy(how=How.ID, using="login2")
public WebElement LoginLink;

@FindBy(how=How.ID, using="cat")
public WebElement LoginPage;

@FindBy(how=How.ID, using="logout2")
public WebElement LogoutButton;
}




