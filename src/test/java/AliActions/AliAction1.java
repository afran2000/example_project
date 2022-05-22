package AliActions;

import AliLocator.AliLocator1;
import AliUtil.AliTestBase;
import junit.framework.Assert;

public class AliAction1 extends AliTestBase {

AliLocator1 homelocator = new  AliLocator1();

public void clickloginlink() throws Exception {
	 homelocator.LoginLink.click();
	 Thread.sleep(1000); 
}	
public void UserCard(String u, String p) throws Exception {
	
	homelocator.UserName.sendKeys(u);
	   homelocator.Password.sendKeys(p);
	 Thread.sleep(1000);
	}
public void clickloginbutton()  throws Exception {
	homelocator.LoginButton.click();
}
public void verify() throws Exception{
	boolean result = homelocator.LoginPage.isDisplayed();
			Assert.assertTrue(result);
}	


}


		
		
			
		