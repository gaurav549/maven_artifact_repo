package SeleniumPrograms;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

public class First_Selenium_Program {

	static WebDriver driver;

	public static void main(String args[]) throws IOException {
		First_Selenium_Program fsp = new First_Selenium_Program();
		System.setProperty("webdriver.chrome.driver", "E:\\Cucumber\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		fsp.Screenshot();
		fsp.Broken_Link();
		fsp.Drop_down();
		fsp. Drop_Down_Without_Select();
		//fsp.after_tear_down ();

	}


	public void Screenshot() throws IOException {
		LocalDate date = LocalDate.now();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/?hl=en");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Gaurav");
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File ("C:\\Users\\gaura\\OneDrive\\Documents\\GitHub\\maven_artifact_repo\\maven_artifact\\Selenium Screenshots\\test_screenshot_" + date + ".jpg"));


	}

	public void Broken_Link() {
		String URL="";
		//String homepage ="file:///C:/Users/gaura/OneDrive/Documents/GitHub/maven_artifact_repo/maven_artifact/Selenium%20Screenshots/broken_link.html";
		
		String homepage ="https://www.w3schools.com/java/java_date.asp";
		driver.get(homepage);
		List<WebElement> links =  driver.findElements(By.tagName("a"));
		Iterator<WebElement> itr = links.iterator();
		while (itr.hasNext()) {

			//If the href attribute is not present, the <a> tag will not be a hyperlink. 
			URL = itr.next().getAttribute("href");
			System.out.println(URL);
			if (URL==null || URL.isEmpty() ) {

				System.out.println(URL);
				System.out.println("URL is either not configured for anchor tag or it is empty");
				continue;
			}

			if(!URL.startsWith(homepage)){
				System.out.println("URL belongs to another domain, skipping it.");
				continue;
			}
		}
		
	}
	
	public void Drop_down() {
		
		driver.get("C:\\Users\\gaura\\OneDrive\\Documents\\GitHub\\maven_artifact_repo\\maven_artifact\\Selenium Screenshots\\DropDown.html");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Select dropdown = new Select(driver.findElement(By.id("testingDropdown")));
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		dropdown.selectByVisibleText("Manual Testing");
		
	}
	
	public void Drop_Down_Without_Select() {
		
		driver.get("C:\\Users\\gaura\\OneDrive\\Documents\\GitHub\\maven_artifact_repo\\maven_artifact\\Selenium Screenshots\\DropDown.html");
		driver.findElement(By.xpath("/html/body/div/div[9]/div/p/select")).click();
		List<WebElement> allOptions = driver.findElements(By.xpath("/html/body/div/div[9]/div/p/select"));
		System.out.println("allOptions");
		for (int i=0 ; i<=allOptions.size()-1; i++ ) {
			
			if (allOptions.get(i).getText().contains("Database Testing")) {
				allOptions.get(i).click();
				break;
				
				
			}
		}
		
	}
	

	public void after_tear_down () {

		driver.close();
	}
}


