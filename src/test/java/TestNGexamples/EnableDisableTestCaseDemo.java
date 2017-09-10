package TestNGexamples;

import org.testng.annotations.Test;

public class EnableDisableTestCaseDemo {

	@Test
	public void testLoginApp() {

		System.out.println("User is able to login successfully");
	}

	// How to Disable Selenium Test cases?
	// In TestNG we can achieve this by simply adding enable attribute and
	// can set value to true/false.

	@Test(enabled = false)
	public void testRegisteruser() {

		System.out.println("User is able to register successfully");
	}

	@Test
	public void testLogoutApp() {

		System.out.println("User is able to logout successfully");
	}

}