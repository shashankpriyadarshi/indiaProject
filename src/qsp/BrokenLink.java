package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrokenLink {
	static {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://localhost/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		List<WebElement> alllinlk = driver.findElements(By.tagName("a"));
		int size = alllinlk.size();
		System.out.println(size);
		for(WebElement link: alllinlk) {
			String text = link.getAttribute("arg0");
			System.out.println(text);
			
		}
		alllinlk.addAll(driver.findElements(By.tagName("img")));
		
	
		
		

	}

}
