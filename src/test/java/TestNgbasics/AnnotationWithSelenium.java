package TestNgbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationWithSelenium {

	WebDriver driver;
	@BeforeMethod
	public void pre() {
		driver = new ChromeDriver();
	}
	@Test
	public void testcase() throws InterruptedException {
		driver.get("https://www.google.com");
		Thread.sleep(3000);
	}
	@AfterMethod
	public void post() {
		driver.quit();
	}
}
