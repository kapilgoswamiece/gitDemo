import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
public class MultipleWindowHandling {

	public static void main(String[] args) {
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com");
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		String parentWin = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[@target = '_blank']")).click();
		Set <String> handle = driver.getWindowHandles();
		for(String chWin : handle)
			{
				if(!chWin.equals(parentWin))
					{	
						driver.switchTo().window(chWin);
						break;
					}
			}
		String chWinText = driver.findElement(By.tagName("h3")).getText();
		driver.switchTo().window(parentWin);
		String pWinText = driver.findElement(By.tagName("h3")).getText();
		
		System.out.println("Parent Window Text is " + pWinText );
		System.out.println("Child Window Text is " + chWinText );
	}

}
