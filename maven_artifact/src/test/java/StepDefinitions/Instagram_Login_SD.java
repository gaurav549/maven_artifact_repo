package StepDefinitions;


import org.junit.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Instagram_Login_SD {
	WebDriver driv1;
	@Before
	public void beforeSetup() {
		System.setProperty("webdriver.chrome.driver", "E:\\Cucumber\\chromedriver_win32\\chromedriver.exe");
		driv1 = new ChromeDriver();
		driv1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Given (value="^User needs to be on Instagram Login Page$",timeout=5000)
	public void User_Needs_to_be_on_Instagram_Login_Page() {
		driv1.get("https://www.instagram.com/?hl=en");
	}
	
	@When (value="^User enters \"([^\"]*)\" username$",timeout=5000)
	public void user_enters_username(String username) throws InterruptedException {
		driv1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driv1.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		Thread.sleep(1000);
	}
	
	@And ("^User enters \"([^\"]*)\" password$")
	public void user_enters_password(String password) throws InterruptedException {
		driv1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driv1.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		Thread.sleep(1000);
		
	}
	
	@When (value="^User enters following data$",timeout=5000) 
	public void User_enters_following_data(DataTable table)
	{
		driv1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<List<String>> data= table.raw();
		String value1 = data.get(0).get(0);
		String value2 = data.get(0).get(1);
		String value3 = data.get(1).get(0);
		String value4 = data.get(1).get(1);
		driv1.findElement(By.xpath("//input[@name='username']")).sendKeys(value3);
		driv1.findElement(By.xpath("//input[@name='password']")).sendKeys(value4);
		
	}
	
	
	@Then ("^User checks username is present$")
	public void user_checks_username_present () throws InterruptedException {
	
		String username_actual_val = driv1.findElement(By.xpath("//input[@name = 'username']")).getAttribute("value");	
		Assert.assertTrue(username_actual_val.matches("Gaurav|Rana"));
		Thread.sleep(1000);
	}
	
	@And ("^User checks password is present$")
	public void user_checks_input_password() throws InterruptedException {
		String password_actual_val=driv1.findElement(By.xpath("//input[@name='password']")).getAttribute("value");
		Assert.assertTrue(password_actual_val.matches("abcd|efg"));
		Thread.sleep(1000);
	
		
	}
	
	@After
	public void AfterTeardown()
	{
		System.out.println("In After section");
		driv1.quit();
		driv1=null;
	}
	
}

