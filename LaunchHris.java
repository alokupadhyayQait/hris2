import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchHris {
	static WebDriver driver;
	static WebElement element;

	public static String launchHrisWindow()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Alok\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://hris.qainfotech.com/login.php");
		return driver.getTitle();
		
	}
}
