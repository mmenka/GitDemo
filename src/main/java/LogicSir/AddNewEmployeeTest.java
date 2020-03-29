package LogicSir;




import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//import EmpDemopkg2.EmpDetailForm;
import LogicSir.EmpformWebelement;

public class AddNewEmployeeTest extends BaseClass{
	static EmpformWebelement addEmployeeObj = new EmpformWebelement();
   // static EmpDetailForm dataTobeFilled = new EmpDetailForm();
    
	@BeforeMethod
	public void beforeMethod() throws InterruptedException {
		
		NavigateToEmployeePage();
	}
	
	
    
    @Test
  	public void test1() throws InterruptedException {
  		addEmployeeObj.elementEmployeeData(driver);
  		addEmployeeObj.checkEnable();
  		Employee emp = new Employee();
  		emp.setLoginName("menka");
  		addEmployeeObj.dataTobeFilled(emp);
  		Thread.sleep(5000);
		addEmployeeObj.getSubmitElm().submit();
		Alert alert = driver.switchTo().alert();
		String alertMessage = alert.getText();
		Assert.assertEquals(alertMessage, "Please provide Password!");
		Thread.sleep(2000);
		alert.accept();;
  		
    }
    
    @Test
  	public void test2() throws InterruptedException {
    	
  		addEmployeeObj.elementEmployeeData(driver);
  		addEmployeeObj.checkEnable();
  		Employee emp = new Employee();
  		emp.setLoginName("savita");
  		emp.setPassword("1234");
  		addEmployeeObj.dataTobeFilled(emp);
  		Thread.sleep(5000);
		addEmployeeObj.getSubmitElm().submit();
		Alert alert = driver.switchTo().alert();
		String alertMessage = alert.getText();
		Assert.assertEquals(alertMessage, "password has to be minimum 5 chars and max 10 chars!");
		Thread.sleep(2000);
		alert.accept();;
  		
  	}
}



