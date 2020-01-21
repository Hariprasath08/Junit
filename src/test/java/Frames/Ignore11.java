package Frames;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ignore11 {
	
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
public void test1() {
	WebElement firstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
	firstName.sendKeys("Hariprasath");
	
	Assert.assertEquals("Verify FirstName", "Hariprasath", firstName.getAttribute("value"));
}
@Ignore
	@Test
	public void test2() {
	WebElement lastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
	lastName.sendKeys("ragav");
	
	Assert.assertEquals("Verify LastName", "ragav", lastName.getAttribute("value"));
	Assert.assertTrue(true);

}


@Test
public void test3() {
	WebElement address = driver.findElement(By.xpath("//textarea[@rows='3']"));
	address.sendKeys("Chennai");
	Assert.assertEquals("Verify address", "Chennai", address.getAttribute("value"));
	Assert.assertTrue(true);	
}

@Ignore

@Test

public void test4 () {
	
	WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
	email.sendKeys("hpragav94@gmail.com");
	Assert.assertEquals("verify email","hpragav94@gmail.com",email.getAttribute("value"));
	Assert.assertTrue(true);
	
	WebElement phoneno = driver.findElement(By.xpath("//input[@type='tel']"));
	phoneno.sendKeys("9597505358");
	Assert.assertEquals("verify phoneno","9597505358",phoneno.getAttribute("value"));
	Assert.assertTrue(true);			
	

}

}
