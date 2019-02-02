package qsp;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DemoTestNGGroup {
	@BeforeClass(alwaysRun = true)
	public void login() {
		Reporter.log("login", true);
	}

	@Test(priority = 1, groups = { "user", "smoke" })
	public void createUser() {
		Reporter.log("createuser", true);
	}

	@Test(priority = 2, groups = { "user" }, enabled = false)
	public void editUser() {
		Reporter.log("edituser", true);
	}

	@Test(priority = 3, groups = { "user" })
	public void deleteUser() {
		Reporter.log("deleteuser", true);
	}
	@Test(priority = 4, groups = { "product","smoke" })
	public void createProduct() {
		Reporter.log("createproductr,true");
	}
	@Test(priority = 5, groups = { "product" })
	public void deleteProduct() {
		Reporter.log("deleteproduct,true");
	}
}
