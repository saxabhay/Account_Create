package pom;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import genric.BasePage;

public class LoginPage extends BasePage {
	
	@FindBy(xpath="//nobr[contains(text(),'actiTIME')]'")
	private WebElement version;
	
	@FindBy(id="username")
	private WebElement unTB;
	
	@FindBy(name="pwd")
	private WebElement pwTB;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement loginbtn;
	
	
	
	@FindBy(xpath="//span[contains(.,'invalid')]")
	private WebElement errmsg;
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}

	public void setusername(String un){
		unTB.sendKeys(un);
	}
	
	public void setpass(String pw){
		pwTB.sendKeys(pw);
	}
	public void clicklogin(){
		loginbtn.click();
	}
	public void verifyversion(String eVersion){
		String aVersion=version.getText();
		Assert.assertEquals(aVersion, eVersion);
	}
	public void verifyerrispresent(SoftAssert sa){
		WebDriverWait wait=new WebDriverWait(driver,10);
		try{
		wait.until(ExpectedConditions.visibilityOf(errmsg));
		Reporter.log("Error msg is Displayed",true);
		}
		catch(TimeoutException e){
			Reporter.log("Error msg is not Displayed",true);
			sa.fail();
		}
		
	}
}
