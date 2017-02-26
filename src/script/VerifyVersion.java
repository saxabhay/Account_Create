package script;

import org.testng.annotations.Test;

import genric.BaseTest;
import pom.LoginPage;

public class VerifyVersion extends BaseTest{
	
	@Test
	public void testVerifyVersion(){
		//verify the version is actitime 2016.1
		LoginPage l=new LoginPage(driver);
		l.verifyversion("actiTime 2016.1");
		
	}

}
