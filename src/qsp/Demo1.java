package qsp;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo1 extends DemoA{
	
    @BeforeMethod
	public void before() {
    	Reporter.log("before",true);
	}
    @Test
	public void abc1() {
		Reporter.log("abc 1",true);
	}
    
    @Test
	public void abc2() {
    	Reporter.log("abc 2",true);
	}
    @AfterMethod
	public void after() {
    	Reporter.log("after",true);
	}
}
