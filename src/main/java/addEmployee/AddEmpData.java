package addEmployee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddEmpData {
	WebElement emploginName;
	WebElement pwd;
	WebElement firstName;
	WebElement lastName;
	WebElement designation;
	WebElement gender;
	WebElement maleElm;
	WebElement femaleElm;
	WebElement dob;
	WebElement status;
	WebElement department;
	WebElement manager;
	WebElement empSalary;
	WebElement mobNo;
	WebElement maritalStatus;
	WebElement presentAddLine1;
	WebElement presentAddLine2;
	WebElement presentCity;
	WebElement presentState;
	WebElement presentCountry;
	WebElement presentPin;
	WebElement permanentAddLine1;
	WebElement permanentAddLine2;
	WebElement permanentCity;
	WebElement permanentState;
	WebElement permanentCountry;
	WebElement permanentPin;
	WebElement acceptElm;
	WebElement submitElm;

	public void addEmployeeData(WebDriver driverObj) {
		emploginName = driverObj.findElement(By.id("loginName"));
		pwd = driverObj.findElement(By.id("password"));
		firstName = driverObj.findElement(By.id("fName"));
		lastName = driverObj.findElement(By.id("lName"));
		designation = driverObj.findElement(By.id("designation"));
		gender = driverObj.findElement(By.id("genderLbl"));
		maleElm=driverObj.findElement(By.id("mRadio"));
		femaleElm=driverObj.findElement(By.id("fRadio"));		
		dob = driverObj.findElement(By.id("dateOfBirth"));
		status = driverObj.findElement(By.id("status"));
		department = driverObj.findElement(By.id("department.id"));
		manager = driverObj.findElement(By.id("manager.id"));
		empSalary = driverObj.findElement(By.id("salary"));
		mobNo = driverObj.findElement(By.id("mobileNo"));
		maritalStatus = driverObj.findElement(By.id("maritalStatus"));
		presentAddLine1 = driverObj.findElement(By.name("addresses[0].addrLine1"));
		presentAddLine2 = driverObj.findElement(By.name("addresses[0].addrLine2"));
		presentCity = driverObj.findElement(By.name("addresses[0].city"));
		presentState = driverObj.findElement(By.name("addresses[0].state"));
		presentCountry = driverObj.findElement(By.name("addresses[0].country"));
		presentPin = driverObj.findElement(By.name("addresses[0].pin"));
		permanentAddLine1 = driverObj.findElement(By.name("addresses[1].addrLine1"));
		permanentAddLine2 = driverObj.findElement(By.name("addresses[1].addrLine2"));
		permanentCity = driverObj.findElement(By.name("addresses[1].city"));
		permanentState = driverObj.findElement(By.name("addresses[1].state"));
		permanentCountry = driverObj.findElement(By.name("addresses[1].country"));
		permanentPin = driverObj.findElement(By.name("addresses[1].pin"));
		acceptElm = driverObj.findElement(By.id("accept"));
		submitElm = driverObj.findElement(By.id("submit"));
	}

	public WebElement getMaleElm() {
		return maleElm;
	}

	public void setMaleElm(WebElement maleElm) {
		this.maleElm = maleElm;
	}

	public WebElement getFemaleElm() {
		return femaleElm;
	}

	public void setFemaleElm(WebElement femaleElm) {
		this.femaleElm = femaleElm;
	}

	public WebElement getEmploginName() {
		return emploginName;
	}

	public void setEmploginName(WebElement emploginName) {
		this.emploginName = emploginName;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public void setPwd(WebElement pwd) {
		this.pwd = pwd;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public void setFirstName(WebElement firstName) {
		this.firstName = firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public void setLastName(WebElement lastName) {
		this.lastName = lastName;
	}

	public WebElement getDesignation() {
		return designation;
	}

	public void setDesignation(WebElement designation) {
		this.designation = designation;
	}

	public WebElement getGender() {
		return gender;
	}

	public void setGender(WebElement gender) {
		this.gender = gender;
	}

	public WebElement getDob() {
		return dob;
	}

	public void setDob(WebElement dob) {
		this.dob = dob;
	}

	public WebElement getStatus() {
		return status;
	}

	public void setStatus(WebElement status) {
		this.status = status;
	}

	public WebElement getDepartment() {
		return department;
	}

	public void setDepartment(WebElement department) {
		this.department = department;
	}

	public WebElement getManager() {
		return manager;
	}

	public void setManager(WebElement manager) {
		this.manager = manager;
	}

	public WebElement getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(WebElement empSalary) {
		this.empSalary = empSalary;
	}

	public WebElement getMobNo() {
		return mobNo;
	}

	public void setMobNo(WebElement mobNo) {
		this.mobNo = mobNo;
	}

	public WebElement getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(WebElement maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public WebElement getPresentAddLine1() {
		return presentAddLine1;
	}

	public void setPresentAddLine1(WebElement presentAddLine1) {
		this.presentAddLine1 = presentAddLine1;
	}

	public WebElement getPresentAddLine2() {
		return presentAddLine2;
	}

	public void setPresentAddLine2(WebElement presentAddLine2) {
		this.presentAddLine2 = presentAddLine2;
	}

	public WebElement getPresentCity() {
		return presentCity;
	}

	public void setPresentCity(WebElement presentCity) {
		this.presentCity = presentCity;
	}

	public WebElement getPresentState() {
		return presentState;
	}

	public void setPresentState(WebElement presentState) {
		this.presentState = presentState;
	}

	public WebElement getPresentCountry() {
		return presentCountry;
	}

	public void setPresentCountry(WebElement presentCountry) {
		this.presentCountry = presentCountry;
	}

	public WebElement getPresentPin() {
		return presentPin;
	}

	public void setPresentPin(WebElement presentPin) {
		this.presentPin = presentPin;
	}

	public WebElement getPermanentAddLine1() {
		return permanentAddLine1;
	}

	public void setPermanentAddLine1(WebElement permanentAddLine1) {
		this.permanentAddLine1 = permanentAddLine1;
	}

	public WebElement getPermanentAddLine2() {
		return permanentAddLine2;
	}

	public void setPermanentAddLine2(WebElement permanentAddLine2) {
		this.permanentAddLine2 = permanentAddLine2;
	}

	public WebElement getPermanentCity() {
		return permanentCity;
	}

	public void setPermanentCity(WebElement permanentCity) {
		this.permanentCity = permanentCity;
	}

	public WebElement getPermanentState() {
		return permanentState;
	}

	public void setPermanentState(WebElement permanentState) {
		this.permanentState = permanentState;
	}

	public WebElement getPermanentCountry() {
		return permanentCountry;
	}

	public void setPermanentCountry(WebElement permanentCountry) {
		this.permanentCountry = permanentCountry;
	}

	public WebElement getPermanentPin() {
		return permanentPin;
	}

	public void setPermanentPin(WebElement permanentPin) {
		this.permanentPin = permanentPin;
	}

	public WebElement getAcceptElm() {
		return acceptElm;
	}

	public void setAcceptElm(WebElement acceptElm) {
		this.acceptElm = acceptElm;
	}

	public WebElement getSubmitElm() {
		return submitElm;
	}

	public void setSubmitElm(WebElement submitElm) {
		this.submitElm = submitElm;
	}

}
