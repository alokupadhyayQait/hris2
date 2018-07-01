import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginActions {
	static WebDriver driver=LaunchHris.driver;
	 private static WebElement getUserNameEntry(){
	        return driver.findElement(By.id("txtUserName"));
	    }
	    
	    private static WebElement getPasswordEntry(){
	        return driver.findElement(By.id("txtPassword"));
	    }
	    
	    private WebElement getErrorMessageElement(){
	        return driver.findElement(By.cssSelector(".alert-error"));
	    }
	public static void login(String username, String password){
		     
	        getUserNameEntry().clear();
	        getUserNameEntry().sendKeys(username);
	        getPasswordEntry().clear();
	        getPasswordEntry().sendKeys(password);
	        getPasswordEntry().submit();
	    }
}
