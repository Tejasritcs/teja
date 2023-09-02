package TestNgbasics;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class D {

	@Test
	public void demo() {
		Reporter.log("hi",true);      //if type true it prints hi....if dont print true it only prints class name
	}
	@Test
	public void demo1() {
		Assert.fail();
		Reporter.log("tej",true);
		System.out.println("hey tej");
	}
}
