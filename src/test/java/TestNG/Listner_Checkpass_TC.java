package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listners_class.class)

//here using @liistners and pass that common listner-class. class it goes there if excecution start it call method execition started
//in that listner class and give sysout and test case pass it cal method passes teset case from that main listner class which we cretaed 
public class Listner_Checkpass_TC {
	
	@Test
	
	public void checkpasstestcase() throws InterruptedException{
		 System.setProperty("webdriver.chrome.driver",
				 "C:\\Users\\Sarvesh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
					
						WebDriver driver=new ChromeDriver();
						driver.get("https://the-internet.herokuapp.com/checkboxes");
						driver.manage().window().maximize();
						WebElement checkb= driver.findElement(By.xpath("//input[@type='checkbox'][2]"));
						Thread.sleep(500);
						if(checkb.isSelected()) {
							checkb.click();
						}
						//chnage female to male
						
						WebElement radiobmale= driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
						Thread.sleep(700);
						if(checkb.isEnabled())
						{
							radiobmale.click();				
							}
		
	}

}
