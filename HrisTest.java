import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class HrisTest {
  
   static String usern1;
   static String userp1;
   static  String usern2;
   static  String userp2;
   static  String usern3;
   static   String userp3;
    public static void dataStream() throws FileNotFoundException,IOException
    {
    Properties prop= new Properties();
    
    prop.load(new FileInputStream("db.properties"));
    usern1=prop.getProperty("username1");
    userp1=prop.getProperty("password1");
    usern2=prop.getProperty("username2");
    userp2=prop.getProperty("password2");
    usern3=prop.getProperty("username3");
    userp3=prop.getProperty("password3");
    		
    	
    }
	
	
	
	@Test
  public void t1_launchHris() {
	  String expectedHomeTitle=LaunchHris.launchHrisWindow();
	  Assert.assertEquals("HRIS Login", expectedHomeTitle);
  }
  
  @Test 
  public void t2_checkLoginPage()
  {
	 boolean b=CheckLoginPage.checkLoginPage();
	Assert.assertEquals(true, b);
	}
  @Test
  public void t3_loginWithIncorrectCredentials() throws FileNotFoundException, IOException
  
  {
	 HrisTest.dataStream();
	 boolean b=LoginWithIncorrectCredentaials.login_with_incorrect_credentials(userp1, userp1);
	  Assert.assertEquals(true, b);
 }
  @Test
  public void t4_loginWithBlankCredentials() throws FileNotFoundException, IOException
  
  {
	
	boolean b2=LoginWithBlankCredentials.login_with_blank_credentials(usern2, userp2);
	  Assert.assertEquals(true, b2);
 }
}
