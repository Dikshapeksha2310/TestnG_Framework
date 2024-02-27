package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listners_class.class)
public class listner_failed_TC {
	
	@Test
	
	public void toCheckFailedtc_listner()
	{
		 System.setProperty("webdriver.chrome.driver",
				 "C:\\Users\\Sarvesh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
					
						WebDriver driver=new ChromeDriver();
						driver.get("https://www.ebay.com/");
						driver.manage().window().maximize();
						//here i give wrong xpath to faied test case bcoz i want demo for faile in listner
						WebElement search= driver.findElement(By.xpath("//*[@id='-ac']"));
						search.click();
				
	}
	

}
