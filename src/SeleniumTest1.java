import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeleniumTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Invoking Web Browser
		//WebDriver
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		
		driver.get("https://youtube.com");
		driver.findElement(By.className("ytSearchboxComponentInput")).sendKeys("Badshah Hit songs");
		driver.findElement(By.className("ytSearchboxComponentSearchButton")).click();
		driver.get("https://rahulshettyacademy.com/locatorspractice");
		driver.findElement(By.id("inputUsername")).sendKeys("contact@rahulshettyacademy.com");
		driver.findElement(By.name("inputPassword")).sendKeys("123456");
		driver.findElement(By.className("signInBtn")).click();
		
		String s1 = new String(driver.findElement(By.cssSelector("p.error")).getText());

		if(s1.contains("Incorrect"))
		{
			driver.findElement(By.linkText("Forgot your password?")).click();
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			
		}
		driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("Kapil");
	 	driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("calmprocessor@gmail.com");
		driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("9069523026");
		driver.findElement(By.cssSelector("button[class='reset-pwd-btn']")).click();
		String forgotPasswordText = driver.findElement(By.cssSelector(".infoMsg")).getText();
		String splitPassword[] = forgotPasswordText.split("'");
		System.out.println(splitPassword[2]);
		driver.findElement(By.cssSelector(".go-to-login-btn")).click();
		driver.findElement(By.id("inputUsername")).sendKeys("contact@rahulshettyacademy.com");
		driver.findElement(By.name("inputPassword")).sendKeys(splitPassword[1]);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			
		}
		driver.findElement(By.className("signInBtn")).click();
		
		
	}

}
