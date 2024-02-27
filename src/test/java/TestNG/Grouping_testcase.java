package TestNG;

import org.testng.annotations.Test;

public class Grouping_testcase {
	
	@Test(groups= {"smoke"})
	public void Login() {
		
	}
	@Test(groups= {"sanity"})
	public void AddTocart() {
	
	}
	@Test(groups= {"smoke"})
	public void products() {
		
	}
	@Test(groups= {"sanity"})
	public void PaymentGetway() {
		
	}
	

}
