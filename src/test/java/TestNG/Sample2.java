package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Sample2 {
	@Test
	public void Tescase2() {
		System.out.println("Test case 2 run");
		 System.setProperty("webdriver.Gecko.driver",
					"C:\\Users\\Sarvesh\\Downloads\\geckodriver-v0.34.0-win-aarch64\\geckodriver.exe");
						
							WebDriver driver=new FirefoxDriver();
							 driver.get("https://www.selenium.dev/");

	}

}
