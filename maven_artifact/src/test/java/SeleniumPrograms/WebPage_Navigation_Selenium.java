package SeleniumPrograms;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;


public class WebPage_Navigation_Selenium {
	static WebDriver driv1 ;

	public static void main(String args[]) throws IOException, InterruptedException {

		WebPage_Navigation_Selenium wp_nav = new WebPage_Navigation_Selenium();
		System.setProperty("webdriver.chrome.driver",  "E:\\Cucumber\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driv1 = new ChromeDriver();
		//wp_nav.Instagram();
		//wp_nav.Facebook();
		//wp_nav.Google();
		//wp_nav.Radio_Button();

		//wp_nav.Drop_Down();

		//		wp_nav.Drag_Drop() ;
		//		wp_nav.Scroll_Down();
		//		wp_nav.Alerts();
		//wp_nav.Drop_Down_Without_Select();
		//wp_nav.Check_Box();
		wp_nav.Broken_Link();
		//wp_nav.Java_Script();
	}

	public  void Instagram() throws IOException, InterruptedException {
		driv1.manage().window().maximize();
		String Insta ="https://www.instagram.com/?hl=en";
		driv1.get(Insta);
		driv1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driv1.findElement( By.xpath(("//input[@name = 'username']"))).sendKeys("Gaurav");
		driv1.findElement(By.xpath("//input[@name='password']")).sendKeys("abcd$$");
		WebElement sign_in_button = driv1.findElement(By.xpath(("//*[@id=\"loginForm\"]/div/div[3]/button")));
		sign_in_button.click();
		File Instagram_screenshot = ((TakesScreenshot)driv1).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Instagram_screenshot,new File( "C:\\Users\\gaura\\eclipse-workspace\\maven_artifact\\Selenium Screenshots\\Instagram.jpg"));
		Thread.sleep(1000);
		String s = sign_in_button.getCssValue("color");
		String c = Color.fromString(s).asHex();
		System.out.println(c);
	}

	public  void Facebook() throws IOException, InterruptedException {

		WebElement facebook_button = driv1.findElement(By.xpath("//*[@id=\"loginForm\"]/div[1]/div[5]"));
		facebook_button.click();
		File Facebook_screenshot = ((TakesScreenshot)driv1).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Facebook_screenshot, new File("C:\\Users\\gaura\\eclipse-workspace\\maven_artifact\\Selenium Screenshots\\Facebook.jpg"));
		driv1.navigate().back();
		Thread.sleep(1000);


	}

	public void Google() throws IOException, InterruptedException {
		driv1.navigate().to("https://www.google.com/");
		driv1.findElement(By.xpath("//input[@title= 'Search']")).sendKeys("Elon Musk");
		File Google_screenshot = ((TakesScreenshot)driv1).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Google_screenshot, new File("C:\\Users\\gaura\\eclipse-workspace\\maven_artifact\\Selenium Screenshots\\Google.jpg"));
		Thread.sleep(1000);
	}

	public void Radio_Button() throws IOException, InterruptedException {
		driv1.get("file:///C:/Users/gaura/eclipse-workspace/maven_artifact/Selenium Screenshots/RadioButton.html");
		driv1.findElement(By.xpath("//input[@value= 'CSS']")).click();



	}

	public void Drop_Down() throws IOException, InterruptedException {
		driv1.get("file:///C:\\Users\\gaura\\eclipse-workspace\\maven_artifact\\Selenium Screenshots\\DropDown.html");
		Select dropdown = new Select (driv1.findElement(By.id("cars")));
		dropdown.selectByVisibleText("Audi");
		
	}
	
	public void Drop_Down_Without_Select() throws IOException, InterruptedException {
		driv1.get("file:///C:/Users/gaura/eclipse-workspace/maven_artifact/Selenium Screenshots/DropDown.html");
		driv1.findElement(By.xpath("/html/body/div/div[9]/div/p/select")).click();
		List<WebElement> allOptions =driv1.findElements(By.xpath("/html/body/div/div[9]/div/p/select/"));
		
	    System.out.println(allOptions);
		for (int i=0 ; i<allOptions.size()-1; i++)
		{
			 if(allOptions.get(i).getText().contains("Database Testing")) {
				 allOptions.get(i).click();
				 break;
			 }
		}
		
		
	
	}



	public void Drag_Drop() throws IOException, InterruptedException {
		driv1.get("file:///C:/Users/gaura/eclipse-workspace/maven_artifact/Selenium Screenshots/DropDown.html");
		WebElement from = driv1.findElement(By.xpath("/html/body/div/div[13]/div/img"));
		WebElement to = driv1.findElement(By.xpath("/html/body/div/div[13]/div/div"));
		Actions act = new Actions(driv1);
		Action dragAndDrop=  act.clickAndHold(from).moveToElement(to).release(to).build();
		dragAndDrop.perform();


		//driv1.close();
	}


	public void Scroll_Down() throws IOException, InterruptedException {
		driv1.get("https://www.instagram.com/?hl=en");
		JavascriptExecutor js = (JavascriptExecutor)driv1;  
		js.executeScript("scrollBy(0, 4500)");  


		//driv1.close();
	}

	public void Alerts() throws IOException, InterruptedException {
		driv1.get("file:///C:/Users/gaura/eclipse-workspace/maven_artifact/Selenium Screenshots/DropDown.html");
		driv1.findElement(By.xpath("/html/body/div/div[11]/div/p/button")).click();  
		Alert alert = (Alert)driv1.switchTo().alert();

		alert.getText();
		alert.dismiss();
		//driv1.close();
	}


	public void Check_Box() throws IOException, InterruptedException {
		driv1.get("file:///C:/Users/gaura/eclipse-workspace/maven_artifact/Selenium Screenshots/DropDown.html");
		driv1.findElement(By.xpath("/html/body/div/div[8]/div/form/input[1]")).click(); 
		System.out.println(driv1.findElement(By.cssSelector("body > div > div:nth-child(14) > div > form > input.Automation")).isSelected());  
		//driv1.findElement(By.xpath("/html/body/div/div[11]/div/p/button")).click();  

		//driv1.close();
	}
	
	
     public void Java_Script() {
    	 
 		driv1.manage().window().maximize();
 		String Insta ="https://www.instagram.com/?hl=en";
 		driv1.get(Insta);
 		driv1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 		
 		JavascriptExecutor js = (JavascriptExecutor)driv1;
 		js.executeScript("document.getElementById('loginForm').value='Selenium'");
     }


	public void Broken_Link() {
		String url = "";
		String homepage= "https://www.javatpoint.com/";
		driv1.get(homepage);
		List<WebElement> links = driv1.findElements(By.tagName("a"));
		Iterator<WebElement> itr = links.iterator();
		while(itr.hasNext()) {
			//If the href attribute is not present, the <a> tag will not be a hyperlink.?  
			url = itr.next().getAttribute("href");
			System.out.println(url);
			if (url==null || url.isEmpty()) {

				System.out.println("URL is either not configured for anchor tag or it is empty");
				continue;

			}

			if(!url.startsWith(homepage)){
				System.out.println("URL belongs to another domain, skipping it.");
				continue;
			}

		}

	}

	
	public void Broken_Image () {
		
		String page = "file:///C:/Users/gaura/OneDrive/Documents/GitHub/maven_artifact_repo/maven_artifact/Selenium%20Screenshots/broken_image.html";
		int  iBrokenImageCount = 0;
		driv1.get(page);
		List<WebElement> images_list = driv1.findElements(By.tagName("img"));
		 
		for (WebElement img : images_list)
         {
             if (img != null)
             {
                 if (img.getAttribute("naturalWidth").equals("0"))
                 {
                     System.out.println(img.getAttribute("outerHTML") + " is broken.");
                     iBrokenImageCount++;
                 }
             }
         }
	
	}
}



