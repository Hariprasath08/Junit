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

public class Junit {
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
	driver.close();
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
	public void Register()
	{
		
	WebElement firstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
	firstName.sendKeys("hariprasath");
	
	Assert.assertEquals("Verify FirstName", "hariprasath", firstName.getAttribute("value"));

	WebElement lName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
	lName.sendKeys("ragav");
	
	Assert.assertEquals("Verify LastName", "ragav", lName.getAttribute("value"));

	WebElement address = driver.findElement(By.xpath("//textarea[@rows='3']"));
	address.sendKeys("chennai");
	
	Assert.assertEquals("Verify address", "chennai", address.getAttribute("value"));
	
	WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
	email.sendKeys("hariprasathragav@gmail.com");
	
	Assert.assertEquals("Verify email", "hariprasathragav@gmail.com", email.getAttribute("value"));

	WebElement phone = driver.findElement(By.xpath("//input[@type='tel']"));
	phone.sendKeys("9597505358");
	
	Assert.assertEquals("Verify Phone number", "9597505358", phone.getAttribute("value"));

	WebElement gender = driver.findElement(By.xpath("//input[@value='Male']"));
	gender.click();
	
	Assert.assertEquals("Verify Gender", "Male", gender.getAttribute("value"));

	WebElement hobbies = driver.findElement(By.xpath("//input[@value='Cricket']"));
	hobbies.click();
	
	Assert.assertEquals("Verify hobbies", "Cricket", hobbies.getAttribute("value"));
                          
             WebElement hobbies1 = driver.findElement(By.xpath("//input[@value='Movies']"));
	hobbies1.click();
	
	Assert.assertEquals("Verify hobbies", "Movies", hobbies1.getAttribute("value"));

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
	year.selectByValue("1994");
	
	Assert.assertEquals("Verify Year", "1994", dob.getAttribute("value"));

	WebElement month = driver.findElement(By.xpath("//select[@ng-model='monthbox']"));
	Select mon = new Select(month);
	mon.selectByValue("February");
	
	Assert.assertEquals("Verify Month", "February", month.getAttribute("value"));

	WebElement day = driver.findElement(By.id("daybox"));
	Select date = new Select(day);
	date.selectByValue("8");
	
	Assert.assertEquals("Verify Day", "8", day.getAttribute("value"));

	WebElement password = driver.findElement(By.id("firstpassword"));
	password.sendKeys("jan@012020");
	
	Assert.assertEquals("Verify Password", "jan@012020", password.getAttribute("value"));

	WebElement confirmPassword = driver.findElement(By.id("secondpassword"));
	confirmPassword.sendKeys("jan@012020");
	
	Assert.assertEquals("Verify Confirm Password", "jan@012020", confirmPassword.getAttribute("value"));

	WebElement submitBtn = driver.findElement(By.id("submitbtn"));
	submitBtn.click();

}
}

