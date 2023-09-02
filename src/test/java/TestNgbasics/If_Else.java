package TestNgbasics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class If_Else {

	@Test
	public void demo() {
		String exp ="tej";
		String act ="tej";
	/*	if(act.equals(exp)) {
			System.out.println("test case is pass");
		}
		else {
			System.out.println("test case is fail");
		}  */
		Assert.assertEquals(exp,act,"tc is pass");
	}    
}
