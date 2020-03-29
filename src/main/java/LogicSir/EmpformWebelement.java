package LogicSir;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.testng.Assert;

	public class EmpformWebelement extends ClassCommon {
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
		
		public void elementEmployeeData(WebDriver driver) {
			emploginName = driver.findElement(By.id("loginName"));
			pwd = driver.findElement(By.id("password"));
			firstName = driver.findElement(By.id("fName"));
			lastName = driver.findElement(By.id("lName"));
			designation = driver.findElement(By.id("designation"));
			gender = driver.findElement(By.id("genderLbl"));
			maleElm=driver.findElement(By.id("mRadio"));
			femaleElm=driver.findElement(By.id("fRadio"));		
			dob = driver.findElement(By.id("dateOfBirth"));
			status = driver.findElement(By.id("status"));
			department = driver.findElement(By.id("department.id"));
			manager = driver.findElement(By.id("manager.id"));
			empSalary = driver.findElement(By.id("salary"));
			mobNo = driver.findElement(By.id("mobileNo"));
			maritalStatus = driver.findElement(By.id("maritalStatus"));
			presentAddLine1 = driver.findElement(By.name("addresses[0].addrLine1"));
			presentAddLine2 = driver.findElement(By.name("addresses[0].addrLine2"));
			presentCity = driver.findElement(By.name("addresses[0].city"));
			presentState = driver.findElement(By.name("addresses[0].state"));
			presentCountry = driver.findElement(By.name("addresses[0].country"));
			presentPin = driver.findElement(By.name("addresses[0].pin"));
			permanentAddLine1 = driver.findElement(By.name("addresses[1].addrLine1"));
			permanentAddLine2 = driver.findElement(By.name("addresses[1].addrLine2"));
			permanentCity = driver.findElement(By.name("addresses[1].city"));
			permanentState = driver.findElement(By.name("addresses[1].state"));
			permanentCountry = driver.findElement(By.name("addresses[1].country"));
			permanentPin = driver.findElement(By.name("addresses[1].pin"));
			acceptElm = driver.findElement(By.id("accept"));
			submitElm = driver.findElement(By.id("submit"));
		}
		
		public void checkEnable() {
			Assert.assertTrue(emploginName.isEnabled(), "emploginName is not enable");
			Assert.assertTrue(pwd.isEnabled(), "Password is not enable");
			Assert.assertTrue(firstName.isEnabled(), "firstName is not enable");
			Assert.assertTrue(lastName.isEnabled(), "lastName is not enable");
			Assert.assertTrue(designation.isEnabled(), "designation is not enable");
			Assert.assertTrue(gender.isEnabled(), "gender is not enable");
			Assert.assertTrue(dob.isEnabled(), "Date of birth is not enable");
			Assert.assertTrue(department.isEnabled(), "department is not enable");
			Assert.assertTrue(manager.isEnabled(), "manager is not enable");
			Assert.assertTrue(empSalary.isEnabled(), "empSalary is not enable");
			Assert.assertTrue(mobNo.isEnabled(), "mobNo is not enable");
			Assert.assertTrue(maritalStatus.isEnabled(), "maritalStatus is not enable");
			
			Assert.assertTrue(presentAddLine1.isEnabled(), "presentAddLine1 is not enable");
			Assert.assertTrue(presentAddLine2.isEnabled(), "presentAddLine2 is not enable");
			Assert.assertTrue(presentCity.isEnabled(), "presentCity is not enable");
			Assert.assertTrue(presentState.isEnabled(), "presentState is not enable");
			Assert.assertTrue(presentCountry.isEnabled(), "presentCountry is not enable");
			Assert.assertTrue(presentPin.isEnabled(), "presentPin is not enable");
			Assert.assertTrue(permanentAddLine1.isEnabled(), "permanentAddLine1 is not enable");
			Assert.assertTrue(permanentAddLine2.isEnabled(), "permanentAddLine2 is not enable");
			Assert.assertTrue(permanentCity.isEnabled(), "permanentCity is not enable");
			
			Assert.assertTrue(permanentState.isEnabled(), "permanentState is not enable");
			Assert.assertTrue(permanentCountry.isEnabled(), "permanentCountry is not enable");
			Assert.assertTrue(permanentPin.isEnabled(), "permanentPin is not enable");
			Assert.assertTrue(acceptElm.isEnabled(), "accept is not enable");
			Assert.assertTrue(submitElm.isEnabled(), "submit is not enable");
			

		}
		
		public void dataTobeFilled(Employee emp) {
			 emploginName.sendKeys("menka");
			 pwd.sendKeys("123xcvb");
			 firstName.sendKeys("menka");
			 lastName.sendKeys("menu");
			 //designation.sendKeys("e.getDesignation()");
			// gender.sendKeys("e.getGender()");
			// maleElm.sendKeys("e.getMaleElm()");
			// femaleElm.sendKeys("e.getFemaleElm()");
			 dob.sendKeys("03/12/2018");
			// status.sendKeys("e.getStatus()");
			// department.sendKeys("e.getDepartment()");
			// manager.sendKeys("e.getManager()");
			 empSalary.sendKeys("45656");
			 mobNo.sendKeys("9886701439");
			 maritalStatus.sendKeys("e.getMaritalStatus()");
			/* presentAddLine1.sendKeys("e.getPresentAddLine1()");
			 presentAddLine2.sendKeys("e.getPresentAddLine2()");
			 presentCity.sendKeys("e.getPresentCity()");
			 presentState.sendKeys("e.getPresentState()");
			 presentCountry.sendKeys("e.getPresentCountry()");
			 presentPin.sendKeys("e.getPresentPin()");
			 permanentAddLine1.sendKeys("e.getPermanentAddLine1()");
			 permanentAddLine2.sendKeys("e.getPermanentAddLine2()");
			 permanentCity.sendKeys("e.getPermanentCity()");
			 permanentState.sendKeys("e.getPermanentState()");
			 permanentCountry.sendKeys("e.getPermanentCountry()");
			 permanentPin.sendKeys("e.getPermanentPin()");
			  **/
			
		
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



