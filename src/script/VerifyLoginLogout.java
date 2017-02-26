package script;

import org.testng.annotations.Test;

import genric.BaseTest;
import pom.HomePage;
import pom.LoginPage;

public class VerifyLoginLogout extends BaseTest {
	
	@Test
	public void testVerifyLoginLogout(){
		LoginPage l=new LoginPage(driver);
		//Enter valid un
		l.setusername("admin");
		
		//Enter valid pass
		l.setpass("manager");
		
		//click on login
		l.clicklogin();
		
		//verify home page is displayed
		
		HomePage h=new HomePage(driver);
		h.verifytitle("actiTime-Enter Time Track");
		
		// click on logout
		h.clicklogout();
		
		// verify login page is display
		l.verifytitle("actiTime-Login");
		
	}

}
