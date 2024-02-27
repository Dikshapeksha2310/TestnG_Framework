package TestNG;

import org.testng.annotations.Test;

public class dependency_check {
	@Test
	
	public void test1() {
		System.out.println("First testcase executed");
		
	}
	//the second method depend on 1st if get executed then second one executed
	@Test(dependsOnMethods="test1")
	public void test2() {
		System.out.println("testCase 2 exceuted");
  }
	
	@Test
	public void test3() {
	System.out.println("Testcase 3is executed");

}
}
