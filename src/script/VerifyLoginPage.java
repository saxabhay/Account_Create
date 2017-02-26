package script;

import org.testng.annotations.Test;

import genric.BaseTest;
import genric.Excel;
import pom.LoginPage;

public class VerifyLoginPage extends BaseTest {
	
	@Test
	public void testVerifyLoginPage(){
		LoginPage l=new LoginPage(driver);
		l.verifytitle("actiTime-Login");
	}
	
	// using Excel
	
	@Test
	public void testVerifyLoginPage1(){
		
		LoginPage l1=new LoginPage(driver);
		String eTitle = Excel.getCellValue(INPUT_PATH, "VerifyLoginPage", 1, 0);
		l1.verifytitle(eTitle);
	}

}
