package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestFb {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	@Test
	public void runFb() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("a");
		driver.get("http://www.facebook.com");

		System.out.println("b");

		FbLogin fb = new FbLogin(driver);

		fb.setUsername("acro799@gmail.com");
		fb.setPassword("shashank4427");
		fb.clickLogin();

	}

}
