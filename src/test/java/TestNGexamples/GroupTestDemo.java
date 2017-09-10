package TestNGexamples;

import org.testng.annotations.Test;

public class GroupTestDemo {
	@Test(groups = { "Regressioin" })
	public void someOtherTest1() {
		System.out.println("RegressioinTest One is Finished");

	}

	@Test(groups = { "Smoke" })
	public void loginTest() {
		System.out.println("Smoke test passed");

	}

	@Test(groups = { "Regressioin" })
	public void someOtherTest2() {
		System.out.println("RegressioinTest Two is Finished");

	}
}
