package TestNG;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//import junit.framework.Assert;

//import junit.framework.Assert;


public class HardAssert {
	@SuppressWarnings("deprection")
	@Test
	public void testhardassert() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				 "C:\\Users\\Sarvesh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		  driver.manage().window().maximize();
		  Thread.sleep(1000);
//in hard assert if anything is fail it not work for next here tithle is wrong so the username is not added
		  String actualTitle = driver.getTitle();
		  String expectedTitle = "Orange";
		  Assert.assertEquals(expectedTitle, actualTitle);
		  driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		  driver.close();
	}
}
