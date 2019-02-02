package qsp;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class DemoA {
	
	@BeforeClass
	public void before() {
    	Reporter.log("before class",true);
	}
    @AfterClass
	public void abc1() {
		Reporter.log("after class",true);
	}

}
