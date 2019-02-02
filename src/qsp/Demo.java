package qsp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {
	
	static {
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d = new FirefoxDriver();
		Alert alert = d.switchTo().alert();
		String text = alert.getText();

	}

}
