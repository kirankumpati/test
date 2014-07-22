package testing;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class DashBoardTest {
	
	//private WebDriver driver = new FirefoxDriver();
  String task,subtask;
    @BeforeMethod
    public void setups()
    {
    	
    }

   
    
    @Test
    public DashBoardTest(){
		
		callfor("Define","Roles");
    }
    
  
   



	private void callfor(String string, String string2) {
		// TODO Auto-generated method stub
		this.task=string;
		this.subtask=string2;
	}



	@AfterMethod
    public void tearDown() throws Exception {
       /* driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            AssertJUnit.fail(verificationErrorString);
        } */
    }



	public String getTask() {
		return task;
		
		
	}



	public String getSubTask() {
		return subtask;
		
	}


}



