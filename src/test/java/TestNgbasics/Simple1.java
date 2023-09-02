package TestNgbasics;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Simple1 {
    @Test
	public void t1() {
		Reporter.log("t1",true);
	}
    @Test
 	public void t2() {
 		Reporter.log("t2",true);
 	}
    @Test
 	public void t3() {
 		Reporter.log("t3",true);
 	}

}
