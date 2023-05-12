 package com.hrms.lib;
 import org.openqa.selenium.By;
 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.firefox.FirefoxDriver;

public class General2 extends Global {
	//standared rule:To provide all reusable fun:/methods of whole application
	public void openApplication() {
		driver = new FirefoxDriver();
		driver.navigate().to(url);
		System.out.println("Application closed");
	}
	public void login() {
		driver.findElement(By.name(txt_loginname)).sendKeys(un);
		driver.findElement(By.name(txt_password)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();
		System.out.println("login completed");
	}
	public void logout() {
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("Logout completed");
	}

}
