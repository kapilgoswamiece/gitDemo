import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
public class PracPage {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		System.out.println(driver.getWindowHandle());
		driver.get("https://www.geeksforgeeks.org/software-testing/how-to-take-a-screenshot-in-selenium-webdriver-using-java/");
		//System.out.println(driver.getWindowHandle());
		driver.quit();
		System.out.println(driver.getWindowHandle());
	}

}
