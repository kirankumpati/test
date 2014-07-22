package dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import base.PageBase;
import testing.DashBoardTest;

public class DashBoard extends PageBase{

	
		 public DashBoard (){
			
		    }

		    public DashBoard (WebDriver driver){
		        super.driver = driver;
		       
		       //clickOnRequestAccess();
		        DashBoardTest dashboardtest = new DashBoardTest();
		        String task=dashboardtest.getTask();
		        String subtask=dashboardtest.getSubTask();
		        goTo(task,subtask);
		    }
		    

			public void goTo(String task, String subtask) {
				
				Actions action = new Actions(driver);
				
				if(task.equals("Access Reviews"))
				{
					clickOnAccessReviews();
				}
				else if(task.equals("Policy Violations"))
				{
					clickOnPolicyViolations();
				}
				else if(task.equals("Approvals"))
				{
					clickOnApprovals();
				}
				else if(task.equals("Sign-off Reports"))
				{
					clickOnSignOffReports();
				}
				else if(task.equals("Work Items"))
				{
					clickOnWorkItem();
				}
				else if(task.equals("Request Access"))
				{
					System.out.println("in reqeuefisndigbfr");
					clickOn(By.xpath("/html/body/table/tbody/tr[4]/td[3]/div/div/form/div/div[3]/ul/li/a"));
					if(subtask.equals("For Me"))
					{
						System.out.println("in for");
						clickOn(By.xpath("/html/body/div[8]/div/a"));
					clickOnRequestAccessForMe();
					}
					else if(subtask.equals("For Others"))
					{
						System.out.println("inotherer");
						clickOn(By.xpath("/html/body/div[8]/div/a[2]"));
						clickOnRequestAccessForOthers();
					}
					else
					{
						clickOnErrorMessage();
					}
				}
				else if(task.equals("Manage Accounts"))
				{
					if(subtask.equals("For Me"))
					{
					clickOnManageAccountsForMe();
					}
					else if(subtask.equals("For Others"))
					{
						clickOnManageAccountsForOthers();
					}
					else
					{
						clickOnErrorMessage();
					}
				}
				else if(task.equals("Change Passwords"))
				{

					if(subtask.equals("For Me"))
					{
					clickOnChangePasswordForMe();
					}
					else if(subtask.equals("For Others"))
					{
						clickOnChangePasswordForOthers();
					}
					else
					{
						clickOnErrorMessage();
					}
				}
				else if(task.equals("Track My Requests"))
				{
					clickOnTrackMyRequests();
				}
				else if(task.equals("Create Identity"))
				{
					clickOnCreateIdentity();
				}
				else if(task.equals("Edit Identity"))
				{

					if(subtask.equals("For Me"))
					{
					clickOnEditIdentityForMe();
					}
					else if(subtask.equals("For Others"))
					{
						clickOnEditIdentityForOthers();
					}
					else
					{
						clickOnErrorMessage();
					}
				}
				else if(task.equals("View Identity"))
				{

					if(subtask.equals("For Me"))
					{
					clickOnViewIdentityForMe();
					}
					else if(subtask.equals("For Others"))
					{
						clickOnViewIdentityForOthers();
					}
					else
					{
						clickOnErrorMessage();
					}
				}
				else if(task.equals("Define"))
				{
					
			        WebElement we = driver.findElement(By.xpath("/html/body/table/tbody/tr[3]/td[3]/div/div/ul/li[2]/a"));
			        action.moveToElement(we).build().perform();
			       
					if(subtask.equals("Applications"))
					{
						
						action.moveToElement(driver.findElement(By.linkText("Applications"))).click().build().perform();
						clickOnApplications();
					}
					else if(subtask.equals("Roles"))
					{
						action.moveToElement(driver.findElement(By.linkText("Roles"))).click().build().perform();
						//action.moveToElement(driver.findElement(By.xpath("/html/body/div[7]/div/div[2]/div[2]/div[2]/a/span"))).click().build().perform();
						clickOnRoles();
					}
					else if(subtask.equals("Identities"))
					{
						action.moveToElement(driver.findElement(By.linkText("Identities"))).click().build().perform();
						clickOnIdentities();
					}
					else if(subtask.equals("Entitlement Catalog"))
					{
						action.moveToElement(driver.findElement(By.linkText("Entitlement Catalog"))).click().build().perform();
						clickOnEntitlementCatalog();
					}
					else if(subtask.equals("Groups"))
					{
						action.moveToElement(driver.findElement(By.linkText("Groups"))).click().build().perform();
						clickOnGroups();
					}
					else if(subtask.equals("Activity Target Categories"))
					{
						action.moveToElement(driver.findElement(By.linkText("Activity Target Categories"))).click().build().perform();
						clickOnActivityTargetCategories();
					}
					else if(subtask.equals("Policies"))
					{
						action.moveToElement(driver.findElement(By.linkText("Policies"))).click().build().perform();
						clickOnPolicies();
					}
					else if(subtask.equals("Identity Risk Model"))
					{
						action.moveToElement(driver.findElement(By.linkText("Identity Risk Model"))).click().build().perform();
						clickOnIdentityRiskModel();
					}
					else if(subtask.equals("Application Risk Model"))
					{
						action.moveToElement(driver.findElement(By.linkText("Application Risk Model"))).click().build().perform();
						clickOnApplicationRiskModel();
					}
					else if(subtask.equals("Business Processes"))
					{
						action.moveToElement(driver.findElement(By.linkText("Business Processes"))).click().build().perform();
						clickOnBusinessProcesses();
					}
					else if(subtask.equals("Lifecycle Events"))
					{
						action.moveToElement(driver.findElement(By.linkText("Lifecycle Events"))).click().build().perform();
						clickOnLifecycleEvents();
					}
				}
				else if(task.equals("Monitor"))
				{
					WebElement we = driver.findElement(By.xpath("/html/body/div/div/div/div/table/tbody/tr[3]/td[3]/div/div/ul/li[3]/a"));
			        action.moveToElement(we).build().perform();
			        
					if(subtask.equals("Certifications"))
					{
						action.moveToElement(driver.findElement(By.linkText("Certifications"))).click().build().perform();
						clickOnCertifications();
					}
					else if(subtask.equals("Tasks"))
					{
						action.moveToElement(driver.findElement(By.linkText("Tasks"))).click().build().perform();
						clickOnTasks();
					}
					
				}
				else if(task.equals("Analyze"))
				{
					if(subtask.equals("Advanced Analytics"))
					{
						clickOnAdvancedAnalytics();
					}
					else if(subtask.equals("Reports"))
					{
						clickOnReports();
					}
					
				}
				
				else if(task.equals("Manage"))
				{
					if(subtask.equals("My Access Reviews"))
					{
						clickOnMyAccessReviews();
					}
					else if(subtask.equals("Access Requests"))
					{
						clickOnAccessRequests();
					}
					else if(subtask.equals("Work Items"))
					{
						clickOnWorkItems();
					}
					else if(subtask.equals("Policy Violations"))
					{
						clickOnPolicyViolation();
					}
					else if(subtask.equals("Identity Risk Scores"))
					{
						clickOnIdentityRiskScores();
					}
					else if(subtask.equals("Application Risk Scores"))
					{
						clickOnApplicationRiskScores();
					}
					else if(subtask.equals("Identity Correlation"))
					{
						clickOnIdentityCorrelation();
					}
					else if(subtask.equals("Batch Requests"))
					{
						clickOnBatchRequests();
					}
					
				}
				
				else if(task.equals("System Setup"))
				{
					if(subtask.equals("IdentityIQ Configuration"))
					{
						clickOnIdentityIQConfiguration();
					}
					else if(subtask.equals("Login Configuration"))
					{
						clickOnLoginConfiguration();
					}
					else if(subtask.equals("Identity Mappings"))
					{
						clickOnIdentityMappings();
					}
					else if(subtask.equals("Account Mappings"))
					{
						clickOnAccountMappings();
					}
					else if(subtask.equals("Application Attributes"))
					{
						clickOnApplicationAttributes();
					}
					else if(subtask.equals("Entitlement Catalog Attributes"))
					{
						clickOnEntitlementCatalogAttributes();
					}
					else if(subtask.equals("Role Configuration"))
					{
						clickOnRoleConfiguration();
					}
					else if(subtask.equals("Scopes"))
					{
						clickOnScopes();
					}
					else if(subtask.equals("Time Periods"))
					{
						clickOnTimePeriods();
					}
					else if(subtask.equals("Audit Configuration"))
					{
						clickOnAuditConfiguration();
					}
					else if(subtask.equals("Electronic Signatures"))
					{
						clickOnElectronicSignatures();
					}
					else if(subtask.equals("Import from File"))
					{
						clickOnImportfromFile();
					}
				}
				else if(task.equals("Debug"))
				{
					if(subtask.equals("About"))
					{
						clickOnAbout();
					}
					else if(subtask.equals("Object"))
					{
						clickOnObject();
					}
					else if(subtask.equals("Memory"))
					{
						clickOnMemory();
					}
					else if(subtask.equals("Caches"))
					{
						clickOnCaches();
					}
					else if(subtask.equals("Beans"))
					{
						clickOnBeans();
					}
					else if(subtask.equals("Threads"))
					{
						clickOnThreads();
					}
					else if(subtask.equals("Call Timings"))
					{
						clickOnCallTimings();
					}
					else if(subtask.equals("Logging"))
					{
						clickOnLogging();
					}
					else if(subtask.equals("Database"))
					{
						clickOnDatabase();
					}
				}	
				else if(task.equals("Logout"))	
					{
						clickOnLogout();
					}
				else if(task.equals("Help"))
				{
					clickOnHelp(); 
				}
				else if(task.equals("Edit My Preferences"))
				{
					clickOnEditMyPreferences();
				}
				else
				{
					clickOnErrorMessage();
				}
			}

			public void clickOnEditMyPreferences() {
				// TODO Auto-generated method stub
				
			}

			public void clickOnHelp() {
				// TODO Auto-generated method stub
				
			}

			public void clickOnLogout() {
				// TODO Auto-generated method stub
				
			}

			public void clickOnDatabase() {
				// TODO Auto-generated method stub
				
			}

			public void clickOnLogging() {
				// TODO Auto-generated method stub
				
			}

			public void clickOnCallTimings() {
				// TODO Auto-generated method stub
				
			}

			public void clickOnThreads() {
				// TODO Auto-generated method stub
				
			}

			public void clickOnBeans() {
				// TODO Auto-generated method stub
				
			}

			public void clickOnCaches() {
				// TODO Auto-generated method stub
				
			}

			public void clickOnMemory() {
				// TODO Auto-generated method stub
				
			}

			public void clickOnObject() {
				// TODO Auto-generated method stub
				
			}

			public void clickOnAbout() {
				// TODO Auto-generated method stub
				
			}

			public void clickOnImportfromFile() {
				// TODO Auto-generated method stub
				
			}

			public void clickOnElectronicSignatures() {
				// TODO Auto-generated method stub
				
			}

			public void clickOnAuditConfiguration() {
				// TODO Auto-generated method stub
				
			}

			public void clickOnTimePeriods() {
				// TODO Auto-generated method stub
				
			}

			public void clickOnScopes() {
				// TODO Auto-generated method stub
				
			}

			public void clickOnRoleConfiguration() {
				// TODO Auto-generated method stub
				
			}

			public void clickOnEntitlementCatalogAttributes() {
				// TODO Auto-generated method stub
				
			}

			public void clickOnApplicationAttributes() {
				// TODO Auto-generated method stub
				
			}

			public void clickOnAccountMappings() {
				// TODO Auto-generated method stub
				
			}

			public void clickOnIdentityMappings() {
				// TODO Auto-generated method stub
				
			}

			public void clickOnLoginConfiguration() {
				// TODO Auto-generated method stub
				
			}

			public void clickOnIdentityIQConfiguration() {
				// TODO Auto-generated method stub
				
			}

			public void clickOnBatchRequests() {
				// TODO Auto-generated method stub
				
			}

			public void clickOnIdentityCorrelation() {
				// TODO Auto-generated method stub
				
			}

			public void clickOnApplicationRiskScores() {
				// TODO Auto-generated method stub
				
			}

			public void clickOnIdentityRiskScores() {
				// TODO Auto-generated method stub
				
			}

			public void clickOnPolicyViolation() {
				// TODO Auto-generated method stub
				
			}

			public void clickOnWorkItems() {
				// TODO Auto-generated method stub
				
			}

			public void clickOnAccessRequests() {
				// TODO Auto-generated method stub
				
			}

			public void clickOnMyAccessReviews() {
				// TODO Auto-generated method stub
				
			}

			public void clickOnReports() {
				// TODO Auto-generated method stub
				
			}

			public void clickOnAdvancedAnalytics() {
				// TODO Auto-generated method stub
				
			}

			public void clickOnTasks() {
				// TODO Auto-generated method stub
				
			}

			public void clickOnCertifications() {
				// TODO Auto-generated method stub
				
			}

			public void clickOnLifecycleEvents() {
				// TODO Auto-generated method stub
				
			}

			public void clickOnBusinessProcesses() {
				// TODO Auto-generated method stub
				
			}

			public void clickOnApplicationRiskModel() {
				// TODO Auto-generated method stub
				
			}

			public void clickOnIdentityRiskModel() {
				// TODO Auto-generated method stub
				
			}

			public void clickOnPolicies() {
				// TODO Auto-generated method stub
				
			}

			public void clickOnActivityTargetCategories() {
				// TODO Auto-generated method stub
				
			}

			public void clickOnGroups() {
				// TODO Auto-generated method stub
				
			}

			public void clickOnEntitlementCatalog() {
				// TODO Auto-generated method stub
				
			}

			public void clickOnIdentities() {
				// TODO Auto-generated method stub
				
			}

			public void clickOnRoles() {
				// TODO Auto-generated method stub
				
			}

			public void clickOnApplications() {
				// TODO Auto-generated method stub
				
			}

			public ViewIdentityForOthers clickOnViewIdentityForOthers() {
				return null;
				// TODO Auto-generated method stub
				
			}

			public ViewIdentityForMe clickOnViewIdentityForMe() {
				return null;
				// TODO Auto-generated method stub
				
			}

			public EditIdentityForOthers clickOnEditIdentityForOthers() {
				return null;
				// TODO Auto-generated method stub
				
			}

			public EditIdentityForMe clickOnEditIdentityForMe() {
				return null;
				// TODO Auto-generated method stub
				
			}

			public ChangePasswordForOthers clickOnChangePasswordForOthers() {
				return null;
				// TODO Auto-generated method stub
				
			}

			public ChangePasswordForMe clickOnChangePasswordForMe() {
				return null;
				// TODO Auto-generated method stub
				
			}

			public ManageAccountsForOthers clickOnManageAccountsForOthers() {
				return null;
				// TODO Auto-generated method stub
				
			}

			public ManageAccountsForMe clickOnManageAccountsForMe() {
				return null;
				// TODO Auto-generated method stub
				
			}

			public RequestAccessForOthers clickOnRequestAccessForOthers() {
				return new RequestAccessForOthers(super.driver);
				
				
			}

			public RequestAccessForMe clickOnRequestAccessForMe() {
				return null;
				// TODO Auto-generated method stub
				
			}

			public void clickOnErrorMessage() {
				// TODO Auto-generated method stub
				
			}

			

			public CreateIdentity clickOnCreateIdentity() {
				return null;
				// TODO Auto-generated method stub
				
			}

			public TrackMyRequest clickOnTrackMyRequests() {
				return null;
				// TODO Auto-generated method stub
				
			}

					
			public WorkItem clickOnWorkItem() {
				return null;
				// TODO Auto-generated method stub
				
			}

			public SignOffReports clickOnSignOffReports() {
				return null;
				// TODO Auto-generated method stub
				
			}

			public Approvals clickOnApprovals() {
				return null;
				// TODO Auto-generated method stub
				
			}

			public PolicyViolations clickOnPolicyViolations() {
				return null;
				
				
			}

			public AccessReviews clickOnAccessReviews() {
				return null;
				// TODO Auto-generated method stub
				
			}

			public String getMessage() {
				System.out.println("vsdffdsds");
				return driver.findElement(By.cssSelector("html.x-border-box body#ext-gen1024.x-body table#appTable tbody tr td.menuCell div#bodyDivTitle h1")).getText();
			}

		   
			///html/body/table/tbody/tr[3]/td[3]/div[3]/h1
		  
				
	}


