import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginWithBlankCredentials {
	static WebDriver driver=LaunchHris.driver;
	  public static boolean login_with_blank_credentials(String username,String password)
	  {
		  LoginActions.login(username, password);
		  return driver.findElement(By.id("txtPassword")).getAttribute("style").contains("red");
		  
	  }
	  
}
