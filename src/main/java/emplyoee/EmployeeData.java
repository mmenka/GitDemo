package emplyoee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EmployeeData {

	WebElement emp;
	WebElement addEmp;
	WebElement searchEmp;
	WebElement advSearchEmp;
	WebElement showAllEmp;

	public void navigateEmp(WebDriver driverObj) {
		emp = driverObj.findElement(By.id("EmployeeLbl"));
		addEmp = driverObj.findElement(By.linkText("Add New Employee"));
		searchEmp = driverObj.findElement(By.linkText("Search Employee"));
		advSearchEmp = driverObj.findElement(By.linkText("Advance Search"));
		showAllEmp = driverObj.findElement(By.linkText("Show All Employee"));
	}

	public WebElement getSearchEmp() {
		return searchEmp;
	}

	public WebElement getAdvSearchEmp() {
		return advSearchEmp;
	}

	public WebElement getShowAllEmp() {
		return showAllEmp;
	}

	public WebElement getEmp() {
		return emp;
	}

	public WebElement getaddEmp() {
		return addEmp;
	}

}
