package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fbpage {
	// intialisition of element
	@FindBy(xpath = "//*[@id=\\'email\\']")
	private WebElement UNtb;

	@FindBy(xpath = "//*[@id=\\'pass\\']")
	private WebElement Pwd;

	@FindBy(xpath = "//*[@id=\\\"u_0_2\\\"]")
	private WebElement LoginBTM;

	// declartion
	public fbpage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public void setUserName(String un) {
		UNtb.sendKeys(un);

	}

	public void setpassWord(String pwd) {
		Pwd.sendKeys(pwd);

	}

	public void checklogin() {
		LoginBTM.click();

	}
}
