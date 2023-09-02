package TestNgbasics;

import org.testng.annotations.Test;

public class WorkingWithGroups {
 
	@Test(groups = "odd")
	public void a() {
		System.out.println("a");
	}
	@Test(groups = "even")
	public void b() {
		System.out.println("b");
	}
	@Test(groups = "odd")
	public void c() {
		System.out.println("c");
	}
	@Test(groups = "even")
	public void d() {
		System.out.println("d");
	}
}
