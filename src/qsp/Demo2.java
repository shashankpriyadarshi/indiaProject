package qsp;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo2 extends DemoA{
	
	@BeforeMethod
	public void before() {
    	Reporter.log("before demo2",true);
	}
    @Test
	public void abc3() {
		Reporter.log("abc 3",true);
	}
    
    @Test
	public void abc4() {
    	Reporter.log("abc 4",true);
    	
	}
    @AfterMethod
	public void after() {
    	Reporter.log("after demo2",true);
	}

}
