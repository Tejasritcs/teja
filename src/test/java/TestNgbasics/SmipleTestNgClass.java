package TestNgbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class SmipleTestNgClass {
	
    @Test
	public void TestCase1 () {
    	WebDriver driver = new ChromeDriver();
    	driver.get("https://www.google.com/");
	}
    @Test
    public void TestCase2 () {
    	WebDriver driver = new EdgeDriver();
    	driver.get("https://www.instagram.com/");
    }
}
