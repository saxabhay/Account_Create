package script;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genric.BaseTest;
import genric.Excel;
import pom.LoginPage;

public class VerifyInvalidLogin extends BaseTest {
	
	@Test
	public void testVerifyInvalidLogin(){
		SoftAssert sa=new SoftAssert();
		 LoginPage l=new LoginPage(driver);
		//Enter invalid Username
		 l.setusername("hbhbh");
		 
		 //Enter invalid pass
		 l.setpass("jknkjn");
		 
		 //click on login
		 l.clicklogin();
		 
		 //verify errmsg
		 l.verifyerrispresent(sa);
		 sa.assertAll();
		 
	}
  //using excel
	/*@Test
	public void testVerifyInvalidLogin1(){
		SoftAssert sa1=new SoftAssert();
		LoginPage l1=new LoginPage(driver);
		int rc = Excel.getRowCount(INPUT_PATH, "VerifyInvalidLogin");
		for(int i=1;i<=rc;i++){
		String un = Excel.getCellValue(INPUT_PATH, "VerifyInvalidLogin", i, 0);
		String pw = Excel.getCellValue(INPUT_PATH, "VerifyInvalidLogin", i, 1);
		l1.setusername(un);
		l1.setpass(pw);
		l1.clicklogin();
		l1.verifyerrispresent(sa1);
		sa1.assertAll();
		}
}*/
}