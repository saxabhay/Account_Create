package genric;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public abstract class BasePage {

	public WebDriver driver;

	public BasePage(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	public void verifytitle(String etitle) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try {
			wait.until(ExpectedConditions.titleIs(etitle));
			Reporter.log("Title is matching", true);
		} catch (Exception e) {
			Reporter.log("Title is not matching", true);
			Assert.fail();
		}

	}
}
