package Frames;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

  

public class Ignore12 {
	
	static WebDriver driver;
	
	@BeforeClass
	public static void getdriver() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hariprasath\\eclipse-workspace\\JunitFrames\\driver\\chromedriver.exe");
driver = new ChromeDriver();
driver.get("http://demo.automationtesting.in/Register.html");
driver.manage().window().maximize();
	}
	
 @AfterClass
  public static void Quitbrowser() {
	 driver.quit();
 }
 
@Before
public void startTime() 
{
	Date date = new Date();
	System.out.println(date);
}

@After
public void EndTime() 
{
	Date date = new Date();
	System.out.println(date);
}

	
	@Test
	public void testA() {
		WebElement gender = driver.findElement(By.xpath("//input[@value='Male']"));
		gender.click();
		Assert.assertEquals("verify gender","Male",gender.getAttribute("value"));
		Assert.assertTrue(false);
	}

	@Test
	public void testB() {
		WebElement hobby = driver.findElement(By.xpath("//input[@value='Cricket']"));
		hobby.click();
		Assert.assertEquals("Verify hobbies", "Cricket", hobby.getAttribute("value"));
		Assert.assertTrue(false);
		
	}
	@Test
	public void testC()
	{
	WebElement lang = driver.findElement(By.id("msdd"));
	lang.click();
	Assert.assertTrue(true);
	
	WebElement english = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[8]/a"));
	english.click();
	Assert.assertTrue(true);
	}
	
	
}
