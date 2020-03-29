package LogicSir;


	import static LogicSir.ClassCommon.LOGIN;
	import static LogicSir.ClassCommon.LOGIN_NAME;
	import static LogicSir.ClassCommon.PASSWORD;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.testng.Assert;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;

	public class BaseClass {
		
	public WebDriver driver;
		
		@BeforeClass
		public void everyTime() throws InterruptedException {
			driver = ClassCommon.getDriver();
			driver.get(ClassCommon.BASE_URL);
			Login("admin", "admin");
		}

		 @BeforeMethod
		public void beforeMethod() throws InterruptedException {
			
			NavigateToEmployeePage();
		}
		
		@AfterMethod
		public void afterMethod() {
			logout();
		} 
		
		@AfterClass
		public void afterEveryTest() {
			driver.close();
		}
		
		public void Login(String userName, String pass) throws InterruptedException {
			WebElement username = driver.findElement(By.name(LOGIN_NAME));
			WebElement Pwd = driver.findElement(By.name(PASSWORD));
			WebElement LoginButton = driver.findElement(By.name(LOGIN));
			ClassCommon.checkenabledAndDisplayed(username,Pwd,LoginButton);
			username.sendKeys(userName);
			Pwd.sendKeys(pass);
			Thread.sleep(2000);
			LoginButton.submit();
		}
		
		public void logout() {
			WebElement logout = driver.findElement(By.name("logoutLink"));
			logout.click();
			//String urlLogout = ClassCommon.BASE_URL + "logout";
			//Assert.assertEquals("Logout is not successful", urlLogout, driver.getCurrentUrl());
	    
	        WebElement username = driver.findElement(By.name(LOGIN_NAME));
			WebElement Pwd = driver.findElement(By.name(PASSWORD));
			WebElement LoginButton = driver.findElement(By.name(LOGIN));
			ClassCommon.checkenabledAndDisplayed(username, Pwd, LoginButton);
			
		}
		
		public void NavigateToEmployeePage() throws InterruptedException {
			 WebElement Employee = driver.findElement(By.id("EmployeeLbl"));
			 Actions action = new Actions(driver);
			 action.moveToElement(Employee).build().perform();
			 Thread.sleep(3000);
			 driver.findElement(By.linkText("Add New Employee")).click();
			 Thread.sleep(2000); 
			 
		}
		
	}



