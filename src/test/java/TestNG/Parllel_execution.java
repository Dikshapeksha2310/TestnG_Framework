package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Parllel_execution {
	
	@Test
	public void invokechrome() 
	{
		System.setProperty("webdriver.chrome.driver",
				 "C:\\Users\\Sarvesh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		  driver.get("https://www.selenium.dev/");

	
	}
	@Test
	public void invokeedge() {
		 System.setProperty("webdriver.Gecko.driver",
					"C:\\Users\\Sarvesh\\Downloads\\geckodriver-v0.34.0-win-aarch64\\geckodriver.exe");
						
							WebDriver driver=new FirefoxDriver();
							 driver.get("https://www.selenium.dev/");
		
	}

}
