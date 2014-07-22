package testing;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import dashboard.DashBoard;
import dashboard.LoginPage;


public class LoginTest {
	
	private static WebDriver driver = new FirefoxDriver();
  
    @BeforeMethod
    public void setups()
    {
//LoginPage loginPage = new LoginPage(driver);
        
       
    }

   
    
   @Test
    public void failLogin() throws Exception {
    	
    	LoginPage loginPage = new LoginPage(driver);
    	 loginPage.open();
         loginPage.setUp();
        loginPage.clear();
        loginPage.loginFail("spadmin", "kiran123");
        Assert.assertTrue(loginPage.getMessage().contains("Invalid username or password"));
        
    }
    
    @Test
    public void successLogin() throws Exception {
        
    	LoginPage loginPage = new LoginPage(driver);
    	 loginPage.open();
         loginPage.setUp();
       
        loginPage.clear();
        DashBoard dashboard = loginPage.loginSuccess("spadmin", "kiran");
       // Assert.assertEquals("Dashboard",dashboard.getMessage());
       //System.out.println("the dashboar dmasgd is "+dashboard.getMessage());
     
    }

    @AfterMethod
    public void tearDown() throws Exception {
       /* driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            AssertJUnit.fail(verificationErrorString);
        } */
    }


}



