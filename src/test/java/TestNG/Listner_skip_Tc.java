package TestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listners_class.class)
public class Listner_skip_Tc {
@Test
	
	public void testcasepositive()
	{
		 System.setProperty("webdriver.chrome.driver",
				 "C:\\Users\\Sarvesh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
					
						WebDriver driver=new ChromeDriver();
						driver.get("https://www.ebay.com/");
						driver.manage().window().maximize();
						
						WebElement Dailyclick= driver.findElement(By.xpath("//*[@id=\"gh-p-1\"]/a"));
						Dailyclick.click();
						
	}
  @Test(enabled=false)
  public void tocheckenabled ()
  {
	  System.setProperty("webdriver.chrome.driver",
				 "C:\\Users\\Sarvesh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
					
						WebDriver driver=new ChromeDriver();
						driver.get("https://www.ebay.com/");
						driver.manage().window().maximize();
						
						WebElement helpclick= driver.findElement(By.xpath("//*[@id=\"gh-p-3\"]/a"));
						helpclick.click();	
	}

}
