package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sampl1 {
	@Test
	public void testcase1(){
		
		System.out.println("FIrst test case runing");
		System.setProperty("webdriver.chrome.driver",
				 "C:\\Users\\Sarvesh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
					
						WebDriver driver=new ChromeDriver();
						 driver.get("https://www.selenium.dev/");

					}
	}


