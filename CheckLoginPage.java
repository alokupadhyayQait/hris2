import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class CheckLoginPage {
	static WebDriver driver=LaunchHris.driver;
	public static boolean checkLoginPage() {
    if(!driver.findElement(By.xpath("//div[@id=\"login\"]/h4 [@class=\"tab-heading\"]")).isDisplayed()) {
		driver.findElement(By.xpath("//i[@class=\"icon-lock\"]")).click();
		
		
		}
	return  driver.findElement(By.xpath("//input[@type=\"submit\"]")).isDisplayed();
}
}