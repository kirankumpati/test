package base;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import sun.jvm.hotspot.interpreter.BytecodeFastIAccess0;


public class PageBase {
    public WebDriver driver;
    private static String BASE = "http://localhost:8888/";
    private static String PATH = "iiq61/login.jsf";
    private static String URL = BASE + PATH;


    public PageBase (){
        //Default constructor for class extension
    }
    
    public PageBase(WebDriver driver){
        this.driver = driver;
    }
    
    public void setUp(){
    	System.out.println("in setup "+driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    
    public void open(){
    	System.out.println("in open url "+URL);
        driver.get(URL);
    }

    
    public void enter(By by, String name)
    {
    	System.out.println("in entere mentod"+name+" and path is "+by);
    	 driver.findElement(by).sendKeys(name);
    }
    
    public void clickOn(By by)
    {
    	driver.findElement(by).click();
    }
    
    public void clear(By by){
    	
    	driver.findElement(by).clear();
       
    }
    
   
    
    public void clickLink(String string)
    {
    	driver.findElement(By.linkText(string)).click();
    }
   /*
    public void clear(By by)
    {
    	driver.findElement(by).clear();
    }
    
    public void open(){
    	System.out.println("in open url "+URL);
        driver.get(URL);
    }

    public void enterData(By by, String string)
    {
    	driver.findElement(by).sendKeys(string);
    	
    	
    }
    public String getTitle(){
        //Not Implemented Yet
        return null;
    }

    public WebElement getWebElement(By by){
        //Not Implemented Yet
        return null;
    }

    public boolean isElementPresent(By by){
    	 driver.findElement(by);
        return true;
    }

    public boolean isElementPresentAndDisplay(By by){
    	driver.findElement(by).click();
        return true;
    }

    public boolean isTextPresent(String text){
        //Not Implemented Yet
        return false;
    }
*/
    
}
