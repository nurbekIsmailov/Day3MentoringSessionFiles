package dataProviderDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WeatherChecker {

	WebDriver driver;

	@BeforeClass
	public void setUp() {

		System.out.println("====================THIS IS A TEST, WELCOME!============================");
		System.setProperty("webdriver.chrome.driver", "/Users/SuperUser/Documents/Libraries/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.google.com");

	}

	@Test(dataProvider = "testDataList")
	public void GetWeatherInfo(String location) throws InterruptedException {

		WebElement element = driver.findElement(By.xpath("//input[@id='lst-ib']"));
		// Clear the existing text value
		element.clear();

		// Enter something to search for
		element.sendKeys(location + " weather");

		// Now submit the form
		element.submit();

		final String x = location;

		// Google's search is rendered dynamically with JavaScript.
		// Wait for the page to load, timeout after 10 seconds
		new WebDriverWait(driver, 10).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver d) {
				return d.getTitle().startsWith(x);
			}
		});

		// System.out.println(driver.getTitle());

		System.out
				.println(location + " temperature is: " + driver.findElement(By.xpath(".//*[@id='wob_tm']")).getText());

		Assert.assertEquals(location + " weather - Google Search", driver.getTitle());

	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

	@DataProvider(name = "testDataList")
	public Object[] passData()

	{
		Object[] data = new Object[8];
		data[0] = "90210";
		data[1] = "Mclean, VA";
		data[2] = "Denver, CO";
		data[3] = "Boston, MA";
		data[4] = "Dallas, TX";
		data[5] = "Miami, FL";
		data[6] = "Moscow, Russia";
		data[7] = "Frankfurt, Germany";

		return data;

	}

}
