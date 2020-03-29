package empProfile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EmpProfileData {
	WebElement myprofileElem;
	WebElement employeeElem;
	WebElement departmentElem;
	WebElement logoutElem;

	public void commonProfileData(WebDriver driverObj) {
		myprofileElem = driverObj.findElement(By.id("myProfileLbl"));
		employeeElem = driverObj.findElement(By.id("EmployeeLbl"));
		departmentElem = driverObj.findElement(By.id("DepartmentLbl"));
		logoutElem = driverObj.findElement(By.id("logoutLbl"));
	}

	public WebElement getEmployeeElem() {
		return employeeElem;
	}

	public WebElement getDepartmentElem() {
		return departmentElem;
	}

	public WebElement getLogoutElem() {
		return logoutElem;
	}

	public WebElement getMyprofile() {
		return myprofileElem;
	}

}
