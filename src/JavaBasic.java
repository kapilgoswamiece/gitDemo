import java.time.Duration;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class JavaBasic {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver1.manage().window().maximize();
		Thread.sleep(2000);
		int  noofCheckbox = driver1.findElements(By.xpath("//input[@type='checkbox']")).size();
		List <WebElement> Chkbx = driver1.findElements(By.xpath("//input[@type='checkbox']"));
		for(WebElement ch : Chkbx)
		{
		
			Assert.assertFalse(ch.isSelected());
			ch.click();
			Assert.assertTrue(ch.isSelected());
			ch.click();
			Assert.assertFalse(ch.isSelected());
		}
		System.out.println(noofCheckbox);
	
	
	}
	
}