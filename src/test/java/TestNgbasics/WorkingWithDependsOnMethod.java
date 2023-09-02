package TestNgbasics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WorkingWithDependsOnMethod {

	@Test(priority = 1)
	public void start () {
		System.out.println("start");
	
	}
	@Test(priority = 2)
	public void login () {
		String exppass = "Test@123";
		String actpass = "Test@123";
		
		Assert.assertEquals(actpass, exppass);
	}
	@Test(priority = 3 , dependsOnMethods =  "login")
	public void profile () {
		System.out.println("welcome to the world");
	}
	@Test(priority = 4)
	public void end () {
		System.out.println("end");
	}
}
