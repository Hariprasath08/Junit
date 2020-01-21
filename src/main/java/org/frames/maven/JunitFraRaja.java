package org.frames.maven;

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
import org.openqa.selenium.support.ui.Select;

public class JunitFraRaja {

	static WebDriver driver;
	@BeforeClass
	public static void getDriver()
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Hariprasath\\eclipse-workspace\\JunitFrames\\driver\\chromedriver.exe");
  driver = new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Register.html");
	driver.manage().window().maximize();
	}
	
	@AfterClass
	public static void quitBrowser()
	{
	System.out.println("Afterclass");
	}
	
	@Before
	public void startTime() 
	{
		Date date = new Date();
		System.out.println(date);
	}
	
	@After
	public void endTime() 
	{
		Date date = new Date();
		System.out.println(date);
	}
	
	@Test
	public void Register() throws InterruptedException
	{
		
	WebElement firstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
	firstName.sendKeys("Esaki");
	
	Assert.assertEquals("Verify FirstName", "Esaki", firstName.getAttribute("value"));

	WebElement lName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
	lName.sendKeys("Raja");
	
	Assert.assertEquals("Verify LastName", "Raja", lName.getAttribute("value"));

	WebElement address = driver.findElement(By.xpath("//textarea[@rows='3']"));
	address.sendKeys("chennai");
	
	Assert.assertEquals("Verify address", "chennai", address.getAttribute("value"));
	
	WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
	email.sendKeys("rajarex@gmail.com");
	
	Assert.assertEquals("Verify email", "rajarex@gmail.com", email.getAttribute("value"));

	WebElement phone = driver.findElement(By.xpath("//input[@type='tel']"));
	phone.sendKeys("8667813811");
	
	Assert.assertEquals("Verify Phone number", "8667813811", phone.getAttribute("value"));

	WebElement gender = driver.findElement(By.xpath("//input[@value='Male']"));
	gender.click();
	
	Assert.assertEquals("Verify Gender", "Male", gender.getAttribute("value"));

	WebElement hobbies = driver.findElement(By.xpath("//input[@value='Cricket']"));
	hobbies.click();
	
	Assert.assertEquals("Verify hobbies", "Cricket", hobbies.getAttribute("value"));
	
	WebElement language = driver.findElement(By.id("msdd"));
	language.click();
	WebElement english = driver.findElement(By.xpath("//a[text()='Finnish']"));
	english.click();
                         
    WebElement skills = driver.findElement(By.id("Skills"));
	Select skill = new Select(skills);
	skill.selectByValue("Java");
	
	Assert.assertEquals("Verify Skills", "Java", skills.getAttribute("value"));

	WebElement country = driver.findElement(By.id("countries"));
	Select countries = new Select(country);
	countries.selectByVisibleText("India");
	
	Assert.assertEquals("Verify Country", "India", country.getAttribute("value"));

	WebElement selectCountry = driver.findElement(By.id("country"));
	Select cnt = new Select(selectCountry);
	cnt.selectByValue("India");
	
    Assert.assertEquals("Verify selectCountry ", "India", selectCountry.getAttribute("value"));

	WebElement dob = driver.findElement(By.id("yearbox"));
	Select year = new Select(dob);
	year.selectByValue("1992");
	
	Assert.assertEquals("Verify Year", "1992", dob.getAttribute("value"));

	WebElement month = driver.findElement(By.xpath("//select[@ng-model='monthbox']"));
	Select mon = new Select(month);
	mon.selectByValue("August");
	
	Assert.assertEquals("Verify Month", "August", month.getAttribute("value"));

	WebElement day = driver.findElement(By.id("daybox"));
	Select date = new Select(day);
	date.selectByValue("13");
	
	Assert.assertEquals("Verify Day", "13", day.getAttribute("value"));

	WebElement password = driver.findElement(By.id("firstpassword"));
	password.sendKeys("aug@1234");
	
	Assert.assertEquals("Verify Password", "aug@1234", password.getAttribute("value"));

	WebElement confirmPassword = driver.findElement(By.id("secondpassword"));
	confirmPassword.sendKeys("aug@1234");
	
	Assert.assertEquals("Verify Confirm Password", "aug@1234", confirmPassword.getAttribute("value"));

	WebElement submitBtn = driver.findElement(By.id("submitbtn"));
	submitBtn.click();
		
		
		

}
}

