package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbLogin
{
	@FindBy(xpath="//*[@id=\'email\']")
	private WebElement UNTB;

	@FindBy(xpath= "//*[@id=\'pass\']")
	private WebElement PWTB;

	@FindBy(xpath="//*[@id=\"u_0_2\"]")
	private WebElement LoginBtn;

	
	public FbLogin(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public void setUsername(String un) 
	{
		UNTB.sendKeys(un);

	}

	public void setPassword(String pw) {
		PWTB.sendKeys(pw);

	}

	public void clickLogin() {

		LoginBtn.click();
	}
}