package dashboard;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.PageBase;


	public class LoginPage extends PageBase{
		
	    public LoginPage (){

	    }

	    public LoginPage (WebDriver driver){
	        super.driver = driver;
	    }

	    public DashBoard loginSuccess(String username,String password){
	    	enterDetails(username,password);
	        return new DashBoard(driver);
	    }

	    public void loginFail(String username,String password){
	        enterDetails(username,password);
	       // return new LoginPage(driver);
	    }

		public void enterDetails(String username, String password) {
			
			enter((By.id("loginForm:accountId")),username);
			enter((By.id("loginForm:password")),password);
			clickOn(By.cssSelector("a.loginbutton > span"));
		     
		}
		
		public void clear()
		{
			clear(By.id("loginForm:accountId"));
			clear(By.id("loginForm:password"));			
		}
		
	public String getMessage()
		{
			return driver.findElement(By.xpath("/html/body/div/div/div")).getText();
		}
	
		/*public String afterLogin(String fname,String lname)
		{
			return fname+""+lname;
		}
		*/
}
