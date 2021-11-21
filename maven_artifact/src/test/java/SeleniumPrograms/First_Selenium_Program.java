package SeleniumPrograms;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.TakesScreenshot;

public class First_Selenium_Program {
	
	static WebDriver driver;
	
	public static void main(String args[]) throws IOException {
		First_Selenium_Program fsp = new First_Selenium_Program();
		System.setProperty("webdriver.chrome.driver", "E:\\Cucumber\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		fsp.Drop_Down();
		
	}
	
	
	public void Drop_Down() throws IOException {
		
		driver.get("file:///C:/Users/gaura/eclipse-workspace/maven_artifact/Selenium Screenshots/DropDown.html");
		Select dropdown = new Select(driver.findElement(By.id("testingDropdown")));
		dropdown.selectByVisibleText("Database Testing");
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("C:\\sers\\gaura\\eclipse-workspace\\maven_artifact\\Selenium Screenshots\\dropdown.jpg"));
		
	}

}

