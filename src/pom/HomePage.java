package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import genric.BasePage;

public class HomePage extends BasePage {
	
	@FindBy(id="logoutLink")
	private WebElement logoutlink;
	
	public HomePage(WebDriver driver){
		super(driver);
	}
   
	public void clicklogout(){
	logoutlink.click();
	}
	
}
