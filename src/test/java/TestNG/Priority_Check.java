package TestNG;

import org.testng.annotations.Test;

public class Priority_Check {
	@Test(priority=1)
	
	public void test1() {
		System.out.println(" testcase 1st executed");
		
	}
	@Test(priority=0)
	public void test2() {
		System.out.println("testCase 2nd exceuted");
  }
	
	@Test(priority=2)
	public void test3() {
	System.out.println("testcase 3rd executed");
	}
}
