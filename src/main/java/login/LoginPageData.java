package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageData {

	WebElement userNameElem;
	WebElement passwordElem;
	public WebElement loginButtonElem;

	public void loginPageData(WebDriver driver) {

		userNameElem = driver.findElement(By.name("loginName"));
		passwordElem = driver.findElement(By.name("password"));
		loginButtonElem = driver.findElement(By.name("login"));

	}

	public WebElement getUserNameElem() {
		return userNameElem;
	}

	public WebElement getPasswordElem() {
		return passwordElem;
	}

	public WebElement getLoginButtonElem() {
		return loginButtonElem;
	}

}

