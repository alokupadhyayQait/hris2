import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginWithIncorrectCredentaials {
static WebDriver driver=LaunchHris.driver;

public static boolean login_with_incorrect_credentials(String username,String password)
{ 
	
LoginActions.login(username,password);
return driver.findElement(By.xpath("//*[@id=\"login\"]/form/div[1]")).isDisplayed();

}


}
