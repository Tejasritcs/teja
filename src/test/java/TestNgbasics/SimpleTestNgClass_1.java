package TestNgbasics;

import org.testng.annotations.Test;

public class SimpleTestNgClass_1 {

	@Test(priority = -17 , description = "validate tej" , enabled = true)
	public void tej () {
		System.out.println(" am tej");
	}
	@Test(priority = -21 ,description = "validate kitti" , enabled = false)
	public void kitti () {
		System.out.println("am kitti");
	}
	@Test(priority = 7 , description = "validate lisu" ,enabled = true)
	public void lisu () {
		System.out.println("am lisu");
	}
	@Test(priority = 1 , description ="validate hadya" , enabled = true)
	public void hadya () {
		System.out.println("am hadya");
	}
}
