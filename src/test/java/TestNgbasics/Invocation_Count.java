package TestNgbasics;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Invocation_Count {
    @Test (invocationCount = 07)
	public void demo() {
		Reporter.log("good evening",true);
	}
}
