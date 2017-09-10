package TestNGexamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependsOnMethodsExample {

	@Test
	public void testLogin()

	{
		Assert.assertEquals(1, 2);//Force failing it
		System.out.println("login done");

	}

	@Test(dependsOnMethods = { "testLogin" })
	public void testAccount()

	{
		System.out.println("Account has been created");

	}

	@Test(dependsOnMethods = { "testLogin", "testAccount" })

	public void testLogout()

	{
		System.out.println("logout");

	}
}
