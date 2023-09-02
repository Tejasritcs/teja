package TestNgbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WorkingWithAssertion {

	@Test
	public void t1 () {
		int a = 10;
		int b = 20;
		
		Assert.assertEquals(a, b);  //this line will work parameter is actual second parameter is expected
		                            //if both are same it will consider test case pas or else fail
	}
	
	@Test(description = "validate the title")
	public void t2 () {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		String expTitle = "Google" ;
		String actTitle = driver.getTitle();
		
		Assert.assertEquals(actTitle, expTitle);
	}
}
