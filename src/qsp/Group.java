package qsp;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Group {

	@Test(groups= {"smoke"})
	public void abc1() {
		Reporter.log("abc 1",true);
	}

	@Test(groups= {"smoke","sanity"})
	public void abc2() {
		Reporter.log("abc 2",true);
	}
	@Test(groups= {"smoke"})
	public void abc3() {
		Reporter.log("abc 3",true);
	}

	@Test(groups= {"sanity"})
	public void abc4() {
		Reporter.log("abc 4",true);
	}
	@Test(groups= {"smoke","sanity"})
	public void abc5() {
		Reporter.log("abc 5",true);
	}

	@Test(groups= {"sanity"})
	public void abc6() {
		Reporter.log("abc 6",true);

	}
}