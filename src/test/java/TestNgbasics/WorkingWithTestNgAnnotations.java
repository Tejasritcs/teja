package TestNgbasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WorkingWithTestNgAnnotations {

	@AfterMethod
	public void t6() {
		System.out.println("am after method");
	}
	@AfterTest
	public void t7() {
		System.out.println("am after test");
	}
	@AfterClass
	public void t8() {
		System.out.println("am after class");
	}
	@AfterSuite
	public void t9() {
		System.out.println("am after suite");
	}
	@Test
	public void t17() {
		System.out.println("am test17");
	}        
	@BeforeSuite
	public void t1() {
		System.out.println("am before suite");
	}
		@BeforeClass
		public void t2() {
			System.out.println("am before class");
		}
		@BeforeTest
		public void t3() {
			System.out.println("am before test");
		}
		@BeforeMethod
		public void t4() {
			System.out.println("am before method");
		}
		@Test
		public void t5() {
			System.out.println("am test");
		}
		
}
