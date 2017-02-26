package script;

import org.testng.annotations.Test;

import genric.BaseTest;
import genric.Excel;
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
	@Test
	public void testVerifyLoginLogout1(){
		LoginPage l1=new LoginPage(driver);
		String un = Excel.getCellValue(INPUT_PATH, "VerifyLoginLogout", 1, 0);
		String pw = Excel.getCellValue(INPUT_PATH, "VerifyLoginLogout", 1, 1);
		l1.setusername(un);
		l1.setpass(pw);
		HomePage h1=new HomePage(driver);
		String etitle1 = Excel.getCellValue(INPUT_PATH, "VerifyLoginLogout", 1, 3);
		h1.verifytitle(etitle1);
		
		
	}
	

}
