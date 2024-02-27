package TestNG;

import org.testng.annotations.Test;

public class enable_check {
	
		@Test
		
		public void test1() {
			System.out.println("First testcase executed");
			
		}
		@Test(enabled=false)
		public void test2() {
			System.out.println("testCase 2 exceuted");
	  }
		
		@Test
		public void test3() {
		System.out.println("Testcase 3is executed");
		}

}