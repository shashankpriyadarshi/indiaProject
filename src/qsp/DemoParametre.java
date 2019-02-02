package qsp;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DemoParametre {
	@Parameters({"area","city"})
	@Test
	public void testA(String a,String c) {
		Reporter.log(a+c,true);
		
	}

}
