package StepDefinitions;


import org.apache.commons.io.FileUtils;
import org.junit.Assert;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Instagram_Login_SD {
	WebDriver driver;
	@Before
	public void beforeSetup() {
		System.setProperty("webdriver.chrome.driver", "E:\\Cucumber\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}

	@Given (value="^User needs to be on Instagram Login Page$",timeout=5000)
	public void User_Needs_to_be_on_Instagram_Login_Page() {
		driver.get("https://www.instagram.com/?hl=en");
	}
	
	@Given("^User needs to be on Google Search Page$")
	public void User_needs_to_be_on_Google_Search_Page () {
		driver.get("https://www.google.com/");
		
	}
	@When (value="^User enters \"([^\"]*)\" username$",timeout=5000)
	public void user_enters_username(String username) throws InterruptedException, IOException {
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		File Inta_Login_Screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Inta_Login_Screenshot, new File("C:\\Users\\gaura\\eclipse-workspace\\maven_artifact\\Selenium Screenshots\\Inta_Login_Screenshot.jpg"));
		Thread.sleep(1000);
	}
	
	@And ("^User enters \"([^\"]*)\" password$")
	public void user_enters_password(String password) throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		Thread.sleep(1000);
		
	}
	
	@When ("^User enters following data$") 
	public void User_enters_following_data1(DataTable table)
	{
		
		List<List<String>> data= table.raw();
		//String value1 = data.get(0).get(0);
		//String value2 = data.get(0).get(1);
		String value3 = data.get(1).get(0);
		String value4 = data.get(1).get(1);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(value3);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(value4);
		
	}
	


	
	
	@Then ("^User checks username is present$")
	public void user_checks_username_present () throws InterruptedException {
	
		String username_actual_val = driver.findElement(By.xpath("//input[@name = 'username']")).getAttribute("value");	
		Assert.assertTrue(username_actual_val.matches("Gaurav|Rana"));
		Thread.sleep(1000);
	}
	
	@And ("^User checks password is present$")
	public void user_checks_input_password() throws InterruptedException {
		String password_actual_val=driver.findElement(By.xpath("//input[@name='password']")).getAttribute("value");
		Assert.assertTrue(password_actual_val.matches("abcd|efg"));
		Thread.sleep(1000);
	}
	
	@When ("^User search string in google page$")
	public void Google() throws IOException, InterruptedException {
		driver.findElement(By.xpath("//input[@title= 'Search']")).sendKeys("Elon Musk");

	}
	
	@Then("^User checks search result$") 
	public void  Google_Search_Result() throws InterruptedException, IOException  {
		File Google_screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Google_screenshot, new File("C:\\Users\\gaura\\eclipse-workspace\\maven_artifact\\Selenium Screenshots\\Google.jpg"));
		Thread.sleep(1000);
	}
	


	
	@After
	public void AfterTeardown()
	{
		System.out.println("In After section");
		driver.quit();
		driver=null;
	}
	
}

