

import java.io.*;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
		
		
		
		ChromeOptions option = new ChromeOptions();
		option.setAcceptInsecureCerts(true);
		WebDriver driver = new ChromeDriver(option);
		//TakesScreenshot scnsht =   ((TakesScreenshot)driver);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		WebElement bottom = driver.findElement(By.id("gf-BIG"));
		List <WebElement> bottomtag  = bottom.findElements(By.tagName("a"));
		String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));
		
		for(int i= 0; i < bottomtag.size() ; i++)
		{
			String url = bottomtag.get(i).getAttribute("href");
			WebElement link = bottomtag.get(i);
			//System.out.println(url);
			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int responseCode =  conn.getResponseCode();
			if (responseCode > 400) 
			{
			    File srcFile = bottom.getScreenshotAs(OutputType.FILE);
			    File dest = new File("C:\\Users\\user121\\eclipse-workspace\\Automation_test1\\test-output\\FailFolder\\Brokenlink" + timestamp + ".png");
			    
			    // FIX: Automatically create the 'FailFolder' if it does not exist
			    //Files.createDirectories(dest.getParent());
			    
			    // FIX: Use REPLACE_EXISTING to prevent errors if a file with the same timestamp exists
			    FileUtils.copyFile(srcFile, dest);
			}
			
			
		} 
		
		
		
		
		
		
	}

}
