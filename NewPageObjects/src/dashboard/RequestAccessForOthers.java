package dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import testing.RequestTest;
import base.PageBase;

public class RequestAccessForOthers extends PageBase{
	
	static int i=0;
	String accessfor;
	WebDriver driver;
	public RequestAccessForOthers()
	{
		//super.driver=driver;
		System.out.println("for others");
		}

	public RequestAccessForOthers(WebDriver driver) {
		super.driver = driver;
		System.out.println("RequestAccessForOthers with param");
		if(i==0)
		{
			i++;
			System.out.println("in if "+i);
			RequestTest requesttest = new RequestTest(driver);
			
		}
		else
		{
			System.out.println("in else "+i);
		} 
	}
	
	public void findIdentity(String name)
	{
		    System.out.println("findIdentity");
			//enter(By.xpath("/html/body/table/tbody/tr[4]/td[3]/div/div/form/div[3]/table/tbody/tr/td/div/div/div[2]/div/div/div/div/table/tbody/tr/td[2]/table/tbody/tr/td/input"), name);
		               
			enter(By.id("searchfield-1046-inputEl"), name);
			clickOn(By.xpath("//div[contains(text(),'"+name+"')]"));
			clickOn(By.xpath("//input[@value='Submit']"));
			
	}

}
