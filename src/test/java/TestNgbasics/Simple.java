package TestNgbasics;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class Simple {
    @Test
    public void TC1() {
    	Reporter.log("TC1 is pass",true);
    }
    @Test(enabled = false)
    public void TC2() {
    	Reporter.log("TC2 is pass",true);
    }            
     @Test
    public void TC3() {
    	Assert.fail();
    }            
}
